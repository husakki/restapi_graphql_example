package com.example.restgraphql;

import com.example.restgraphql.model.Continent;
import com.example.restgraphql.service.ContinentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
public class RestApiController {

    private final ContinentService continentService;
    @Autowired
    public RestApiController(ContinentService continentService) {
        this.continentService = continentService;
    }

    @GetMapping("/continents")
    public ResponseEntity<List<Continent>> getAllContinents() {
        return ResponseEntity.ok(continentService.getAllContinents());
    }
}
