package pl.adres.data;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.adres.model.Information;

public interface InformationRepository extends JpaRepository<Information,Long>{

    Information findFirstByLogin(String login);
    Information findFirstByEmail(String email);
}
