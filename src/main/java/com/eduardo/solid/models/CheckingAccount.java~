package com.eduardo.solid.models;

import com.eduardo.solid.interfaces.AccountWithWithdrawal;
import com.eduardo.solid.models.base.AccountBase;

public class CheckingAccount extends AccountBase implements AccountWithWithdrawal {

    public CheckingAccount(String nameUser, double balance) {
        super(nameUser, balance);
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }

    @Override
    public void deposit(double amount) {
        super.setBalance(super.getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        super.setBalance(super.getBalance() - amount);
    }
}
