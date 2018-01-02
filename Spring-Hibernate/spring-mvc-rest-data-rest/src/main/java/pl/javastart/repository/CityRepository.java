package pl.javastart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.javastart.model.City;

public interface CityRepository extends JpaRepository<City,Long> {
}
