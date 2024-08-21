package com.example.restgraphql.repository;

import com.example.restgraphql.model.Continent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContinentRepo extends JpaRepository<Continent, String> {
}