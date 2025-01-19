package com.eduardo.solid.services;

import com.eduardo.solid.requests.AccountRequest;

public interface IAccountService {
    public String createAccount(AccountRequest request);
    public String getBalance(String numberAccount);
    public String deposit(String numberAccount, double amount);
    public String withdraw(String numberAccount, double amount);
}
