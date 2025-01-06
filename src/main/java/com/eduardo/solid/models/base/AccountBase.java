package com.eduardo.solid.models.base;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
public abstract class AccountBase {
    private int id;
    private String nameUser;
    private String accountNumber;
    private double balance;
    private boolean active;

    public AccountBase(String nameUser, double balance) {
        this.nameUser = nameUser;
        this.balance = balance;
        this.accountNumber = generateAccountNumber();
        this.active = true;
    }

    private String generateAccountNumber() {
        Random random = new Random();
        int number = random.nextInt(1000000);
        return String.format("%06d", number);
    }
}
