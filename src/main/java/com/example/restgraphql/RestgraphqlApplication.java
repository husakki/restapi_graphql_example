package com.example.restgraphql;

import com.example.restgraphql.model.Continent;
import com.example.restgraphql.model.Country;
import com.example.restgraphql.repository.ContinentRepo;
import com.example.restgraphql.repository.CountryRepo;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class RestgraphqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestgraphqlApplication.class, args);
    }

    @Bean
    ApplicationRunner init(ContinentRepo continentRepo, CountryRepo countryRepo) {
		return args -> {
			Continent europe = continentRepo.save(new Continent("EU","Europe"));
			Continent asia = continentRepo.save(new Continent("AS","ASIA"));
            Continent america = continentRepo.save(new Continent("NAM","Nord-America"));

            countryRepo.saveAll(List.of(
                    new Country("Deutschland","Euro", europe),
                    new Country("Polen","Zloty", europe),
                    new Country("China","Yuan", asia),
                    new Country("USA", "Dollar", america)
            ));

		};
    }

}
