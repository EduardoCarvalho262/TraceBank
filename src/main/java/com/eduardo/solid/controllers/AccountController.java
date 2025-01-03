package com.eduardo.solid.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class AccountController {

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    //Cria conta

    //Depositar na conta

    //Sacar da conta





}
