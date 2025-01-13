package com.Banking.Application.Banking.Application.Repository;

import com.Banking.Application.Banking.Application.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
