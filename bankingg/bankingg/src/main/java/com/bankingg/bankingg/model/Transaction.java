package com.bankingg.bankingg.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Setter
@Getter
@NoArgsConstructor
@Entity
public class Transaction 
{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal amount;

    private LocalDateTime transactionTime;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    @JsonIgnoreProperties("transactions")
    private Account account;

}
