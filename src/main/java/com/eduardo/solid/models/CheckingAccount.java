package com.eduardo.solid.models;

import com.eduardo.solid.interfaces.AccountWithWithdrawal;
import com.eduardo.solid.models.base.AccountBase;
import com.eduardo.solid.request.TypeAccount;

public class CheckingAccount extends AccountBase implements AccountWithWithdrawal {

    public CheckingAccount(String nameUser, TypeAccount typeAccount) {
        super(nameUser, typeAccount);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        setBalance(getBalance() - amount);
    }
}
