package com.eduardo.solid.models;

import com.eduardo.solid.interfaces.AccountWithWithdrawal;
import com.eduardo.solid.models.base.AccountBase;
import com.eduardo.solid.requests.TypeAccount;
import jakarta.persistence.Entity;

@Entity
public class CheckingAccount extends AccountBase implements AccountWithWithdrawal {

    public CheckingAccount() { super(null, null); }// or some other default values }

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
