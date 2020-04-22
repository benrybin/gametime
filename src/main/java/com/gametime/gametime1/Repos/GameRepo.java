package com.gametime.gametime1.Repos;

import com.gametime.gametime1.Models.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepo extends JpaRepository<Game,Long> {
    boolean existsGameByTitle(String title);
}
