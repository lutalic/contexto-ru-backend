package com.lutalic.contexto.controllers;

import com.lutalic.contexto.models.Response;
import com.lutalic.contexto.services.ProcessService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/words")
@Api("Words handler")
public class WordsController {

    private final ProcessService service;

    public WordsController(ProcessService service) {
        this.service = service;
    }

    @GetMapping("/{level}/{word}")
    @ApiOperation("Find and return position, match with the hidden word as a percentage for current word")
    public Response getWord(@PathVariable int level, @PathVariable String word) {
        return service.getResponse(level, word);
    }

}
