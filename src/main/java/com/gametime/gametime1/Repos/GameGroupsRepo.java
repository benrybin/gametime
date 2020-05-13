package com.gametime.gametime1.Repos;

import com.gametime.gametime1.Models.GameGroups;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameGroupsRepo extends JpaRepository<GameGroups,Long> {

    boolean existsGameByGroupName(String title);
}
