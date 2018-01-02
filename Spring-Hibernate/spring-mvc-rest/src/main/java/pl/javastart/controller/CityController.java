package pl.javastart.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.javastart.model.City;

import java.util.Arrays;
import java.util.List;

@RestController
public class CityController {

    @RequestMapping("/city")
    public List<City> getCity() {
        return Arrays.asList(new City(1, "Warszawa", 1_700_000),
                new City(2, "Wroclaw", 1_200_000),
                new City(3, "Kraków", 1_500_000),
                new City(4, "Poznań", 1_100_000));
    }
}