package com.lutalic.contexto.repo;

import com.lutalic.contexto.models.Level;
import com.lutalic.contexto.models.LevelWordPositionLink;
import com.lutalic.contexto.models.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkRepo extends JpaRepository<LevelWordPositionLink, Long> {

    LevelWordPositionLink findByLevelAndWord(Level level, Word word);

}
