package com.edu.uptc.tallerApiSpringBoot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Sectional {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
}
