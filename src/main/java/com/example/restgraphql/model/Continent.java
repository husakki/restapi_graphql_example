package com.example.restgraphql.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Continent {

    @Id
    private String continent_code;

    private String name;

    @OneToMany(mappedBy = "continent", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Country> countries = new ArrayList<>();



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

    public Continent(String continent_code, String name) {
        this.continent_code = continent_code;
        this.name = name;
    }

}