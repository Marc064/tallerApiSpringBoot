package com.edu.uptc.tallerApiSpringBoot.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "identityCard")
public class IdentityCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false, length = 50)
    private String career;
    @Column(nullable = false)
    private Integer code;

    public IdentityCard (){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
