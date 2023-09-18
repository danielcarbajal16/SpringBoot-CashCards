package com.example.cashcard.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cash_card")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CashCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; 
    
    private Double amount;

    private String owner;
}
