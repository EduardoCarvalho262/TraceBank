package com.eduardo.solid.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/account")
public class AccountController {

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    //Cria conta
    @PostMapping("/create")
    public String createAccount() {
        return "Conta criada com sucesso";
    }

    @GetMapping("/balance")
    public String getBalance() {
        return "Saldo da conta";
    }

    //Depositar na conta
    @PostMapping("/deposit")
    public String deposit() {
        return "Deposito realizado com sucesso";
    }

    //Sacar da conta
    @PostMapping("/withdraw")
    public String withdraw() {
        return "Saque realizado com sucesso";
    }

    //Desativar Conta
    @DeleteMapping("/disable")
    public String disableAccount() {
        return "Conta desativada com sucesso";
    }
}
