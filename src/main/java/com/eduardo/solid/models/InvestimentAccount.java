package com.eduardo.solid.models;
import com.eduardo.solid.interfaces.Balance;
import com.eduardo.solid.interfaces.Depositable;
import com.eduardo.solid.models.base.AccountBase;

public class InvestimentAccount extends AccountBase implements Balance, Depositable {

    public InvestimentAccount(String nameUser, double balance) {
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
}