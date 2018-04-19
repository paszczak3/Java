package com.faustit.zadaniedlakandydatow.data;

import com.faustit.zadaniedlakandydatow.model.UserGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserGroupRepository extends JpaRepository<UserGroup, Long> {

    UserGroup findFirstByName(String name);
    UserGroup findFirstById(Long id);
}
