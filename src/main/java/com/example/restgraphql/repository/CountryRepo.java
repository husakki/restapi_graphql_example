package com.example.restgraphql.repository;

import com.example.restgraphql.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepo extends JpaRepository<Country, Long> {
}