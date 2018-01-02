package pl.javastart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.javastart.model.Value;
import pl.javastart.model.ValueCalculate;

@Repository
public interface ValueRepository extends JpaRepository<Value, Long> {


}
