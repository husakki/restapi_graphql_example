package com.example.restgraphql;

import com.example.restgraphql.model.Continent;
import com.example.restgraphql.repository.ContinentRepo;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class GraphQLQuery {

    private final ContinentRepo continentRepo;
    public GraphQLQuery(ContinentRepo continentRepo) {
        this.continentRepo = continentRepo;
    }
    @QueryMapping
    Iterable<Continent> continents() {
        return continentRepo.findAll();
    }
}
