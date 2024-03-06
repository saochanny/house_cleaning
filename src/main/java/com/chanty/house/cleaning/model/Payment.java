package com.chanty.house.cleaning.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;
@Table(name = "payments")
@Entity
@Data

public class Payment {
    @Id
    private Long id;
    private BigDecimal amount;

}
