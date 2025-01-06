package com.eduardo.solid.services;
import com.eduardo.solid.models.CheckingAccount;
import com.eduardo.solid.models.InvestimentAccount;
import com.eduardo.solid.repository.AccountRepository;
import com.eduardo.solid.request.AccountRequest;
import com.eduardo.solid.request.TypeAccount;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository _repository;

    public String createAccount(AccountRequest request){
        String numberAccount = "";

        if(request.getTypeAccount().equals("Checking")){
            CheckingAccount checkingAccount = new CheckingAccount(request.getNameUser(), TypeAccount.CHECKING);
            _repository.save(checkingAccount);
            numberAccount = checkingAccount.getAccountNumber();
        } else {
            InvestimentAccount investimentAccount = new InvestimentAccount(request.getNameUser(), TypeAccount.INVESTMENT);
            _repository.save(investimentAccount);
            numberAccount = investimentAccount.getAccountNumber();
        }

        return "Account Created! Number Account: " + numberAccount;
    }
}
