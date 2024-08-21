package com.example.restgraphql.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Continent {

    @Id
    @GeneratedValue
    private String continent_code;

    private String name;

    @OneToMany(mappedBy = "continent", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Country> countries;

    // Getters and Setters
    public String getContinent_code() {
        return continent_code;
    }

    public String getName() {
        return name;
    }

    // Constructors
    public Continent() {
    }


}