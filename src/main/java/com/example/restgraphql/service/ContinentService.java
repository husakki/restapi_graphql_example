package com.example.restgraphql.service;

import com.example.restgraphql.model.Continent;
import com.example.restgraphql.repository.ContinentRepo;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@Service
public class ContinentService {

    private final ContinentRepo continentRepo;
    public ContinentService(ContinentRepo continentRepo) {
        this.continentRepo = continentRepo;
    }
    @QueryMapping
    Iterable<Continent> continents() {
        return continentRepo.findAll();
    }

    public List<Continent>getAllContinents(){
        return continentRepo.findAll();
    }

}
