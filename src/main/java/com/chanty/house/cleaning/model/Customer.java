package com.chanty.house.cleaning.model;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "customers")
@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String fullName;
    private String address;
    private String phone;
    private String birthDate;

}
