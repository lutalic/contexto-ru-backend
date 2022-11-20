package com.lutalic.contexto.repo;

import com.lutalic.contexto.models.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordRepo extends JpaRepository<Word, Long> {

    Word findByWord(String word);

}
