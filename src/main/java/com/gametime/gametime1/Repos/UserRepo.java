package com.gametime.gametime1.Repos;

import com.gametime.gametime1.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    User findByUsername(String username);
    Boolean existsByUsername(String username);
}
