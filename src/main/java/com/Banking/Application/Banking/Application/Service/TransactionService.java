package com.Banking.Application.Banking.Application.Service;

import com.Banking.Application.Banking.Application.Model.Transaction;
import com.Banking.Application.Banking.Application.Repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

}
