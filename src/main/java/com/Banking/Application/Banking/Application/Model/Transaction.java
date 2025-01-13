package com.Banking.Application.Banking.Application.Model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

    @Entity
    @Data
    public class Transaction {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "account_id")
        private Account account;

        private double amount;
        private String type; // e.g., "DEPOSIT", "WITHDRAWAL", "TRANSFER"
        private LocalDateTime timestamp;

}
