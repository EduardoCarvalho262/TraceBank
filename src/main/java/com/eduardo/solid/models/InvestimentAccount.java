package com.eduardo.solid.models;
import com.eduardo.solid.interfaces.AccountNoWithdrawal;
import com.eduardo.solid.models.base.AccountBase;
import com.eduardo.solid.request.TypeAccount;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
public class InvestimentAccount extends AccountBase implements AccountNoWithdrawal {

    public InvestimentAccount(String nameUser, TypeAccount typeAccount) {
        super(nameUser, typeAccount);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }
}
