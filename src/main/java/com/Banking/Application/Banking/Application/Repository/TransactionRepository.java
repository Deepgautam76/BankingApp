package com.Banking.Application.Banking.Application.Repository;

import com.Banking.Application.Banking.Application.Model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Long> {

}
