package com.eduardo.solid.models.base;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AccountBase {
    private int id;
    private String nameUser;
    private String accountNumber;
    private double balance;

    public AccountBase( String nameUser, double balance) {
        this.nameUser = nameUser;
        this.balance = balance;
    }
}
