package com.gametime.gametime1.Repos;

import com.gametime.gametime1.Models.RustPrefs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RustPrefsRepo extends JpaRepository<RustPrefs,Long> {
}
