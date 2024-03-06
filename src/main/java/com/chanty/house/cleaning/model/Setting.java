package com.chanty.house.cleaning.model;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "settings")
@Entity
@Data
public class Setting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String value;
}
