package com.lutalic.contexto.repo;

import com.lutalic.contexto.models.Level;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LevelRepo extends JpaRepository<Level, Long> {

    Level findByLevel(int level);

}
