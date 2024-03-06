package com.chanty.house.cleaning.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Table(name = "categories")
@Entity
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)

    private Set<Agency> agencies;


}
