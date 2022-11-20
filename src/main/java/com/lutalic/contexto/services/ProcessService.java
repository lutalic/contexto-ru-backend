package com.lutalic.contexto.services;

import com.lutalic.contexto.models.LevelWordPositionLink;
import com.lutalic.contexto.models.Response;
import com.lutalic.contexto.repo.LevelRepo;
import com.lutalic.contexto.repo.LinkRepo;
import com.lutalic.contexto.repo.WordRepo;
import org.springframework.stereotype.Service;

@Service
public class ProcessService {

    private final LevelRepo levelRepo;
    private final WordRepo wordRepo;
    private final LinkRepo linkRepo;

    public ProcessService(LevelRepo levelRepo, WordRepo wordRepo, LinkRepo linkRepo) {
        this.levelRepo = levelRepo;
        this.wordRepo = wordRepo;
        this.linkRepo = linkRepo;
    }

    public Response getResponse(int level, String word) {
        LevelWordPositionLink result = linkRepo.findByLevelAndWord(
                levelRepo.findByLevel(level),
                wordRepo.findByWord(word)
        );

        if (result != null) {
            long count = wordRepo.count();
            long position = result.getPosition().getPosition();

            String match = (int) ((double) count / position * 100) + "%";
            return new Response(position + "/" + count, match);
        }
        return null;
    }
}
