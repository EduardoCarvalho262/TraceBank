package com.eduardo.solid.controllers;

import com.eduardo.solid.requests.AccountRequest;
import com.eduardo.solid.requests.OperationRequest;
import com.eduardo.solid.services.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/v1/account")
@RestController
@RequiredArgsConstructor
public class AccountController {

    private final AccountService _service;

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    //Cria conta
    @PostMapping("/create")
    public ResponseEntity<String> createAccount(@RequestBody AccountRequest request) {
        String result = _service.createAccount(request);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/balance")
    public String getBalance(@RequestParam(value = "numberAccount") String numberAccount) {
        String balance = _service.getBalance(numberAccount);
        return "The balance is: " + balance;
    }

    //Depositar na conta
    @PostMapping("/deposit")
    public String deposit(@RequestBody OperationRequest body) {
        return _service.deposit(body.getNumberAccount(), body.getAmount());
    }

    //Sacar da conta
    @PostMapping("/withdraw")
    public String withdraw(@RequestBody OperationRequest body) {
        return _service.withdraw(body.getNumberAccount(), body.getAmount());
    }

    //Desativar Conta
    @DeleteMapping("/disable")
    public String disableAccount(@RequestBody String numberAccount) {
        return "Account disabled";
    }
}
