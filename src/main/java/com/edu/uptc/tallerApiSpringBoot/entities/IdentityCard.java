package com.edu.uptc.tallerApiSpringBoot.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.criteria.CriteriaBuilder;

@Entity
public class IdentityCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
}
