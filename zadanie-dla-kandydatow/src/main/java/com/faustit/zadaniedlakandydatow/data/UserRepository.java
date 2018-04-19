package com.faustit.zadaniedlakandydatow.data;

import com.faustit.zadaniedlakandydatow.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findFirstByNick(String nick);
    User findFirstById(Long id);
}
