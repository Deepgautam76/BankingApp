package com.Banking.Application.Banking.Application.Repository;

import com.Banking.Application.Banking.Application.Model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {

}
