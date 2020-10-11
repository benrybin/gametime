package com.gametime.gametime1.Repos;

import com.gametime.gametime1.Models.GameinGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameinGroupRepo extends JpaRepository<GameinGroup,Long> {
}
