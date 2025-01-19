package com.eduardo.solid.repository;

import com.eduardo.solid.models.base.AccountBase;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<AccountBase, Long> {
    AccountBase findByAccountNumber(String numberAccount);;
}
