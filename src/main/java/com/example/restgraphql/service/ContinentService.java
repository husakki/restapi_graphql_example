package com.example.restgraphql.service;

import com.example.restgraphql.model.Continent;
import com.example.restgraphql.repository.ContinentRepo;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
@Service
public class ContinentService {

    private final ContinentRepo continentRepo;

    public ContinentService(ContinentRepo continentRepo) {
        this.continentRepo = continentRepo;
    }

    @QueryMapping
    public Iterable<Continent> continents() {
        return continentRepo.findAll();
    }

}
