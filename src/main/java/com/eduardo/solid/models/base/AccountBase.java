package com.eduardo.solid.models.base;

import com.eduardo.solid.requests.TypeAccount;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
@Entity
public abstract class AccountBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameUser;
    private String accountNumber;
    private double balance;
    private boolean active;
    private TypeAccount typeAccount;

    public AccountBase(String nameUser, TypeAccount typeAccount) {
        this.nameUser = nameUser;
        this.balance = 0;
        this.accountNumber = generateAccountNumber();
        this.active = true;
        this.typeAccount = typeAccount;
    }

    private String generateAccountNumber() {
        Random random = new Random();
        int number = random.nextInt(1000000);
        return String.format("%06d", number);
    }
}
