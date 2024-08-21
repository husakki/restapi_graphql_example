package com.example.restgraphql.model;

import jakarta.persistence.*;

@Entity
public class Country {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String currency;

    @ManyToOne
    @JoinColumn(name = "continent_code", nullable = false)
    private Continent continent;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public String getCurrency() {
        return currency;
    }

    public Long getId() {
        return id;
    }
    // Constructors
    public Country() {

    }


}