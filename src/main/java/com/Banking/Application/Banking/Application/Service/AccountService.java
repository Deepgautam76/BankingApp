package com.Banking.Application.Banking.Application.Service;

import com.Banking.Application.Banking.Application.Model.Account;
import com.Banking.Application.Banking.Application.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    public Account getAccount(Long id) {
        return accountRepository.findById(id).orElse(null);
    }
}
