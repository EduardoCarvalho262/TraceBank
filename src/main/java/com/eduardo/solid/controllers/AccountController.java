package com.eduardo.solid.controllers;

import com.eduardo.solid.request.AccountRequest;
import com.eduardo.solid.request.OperationRequest;
import com.eduardo.solid.services.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/account")
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
    public String getBalance(@RequestBody String numberAccount) {
        return "Saldo da conta";
    }

    //Depositar na conta
    @PostMapping("/deposit")
    public String deposit(@RequestBody OperationRequest body) {
        return "Deposito realizado com sucesso";
    }

    //Sacar da conta
    @PostMapping("/withdraw")
    public String withdraw(@RequestBody OperationRequest body) {
        return "Saque realizado com sucesso";
    }

    //Desativar Conta
    @DeleteMapping("/disable")
    public String disableAccount(@RequestBody String numberAccount) {
        return "Conta desativada com sucesso";
    }
}
