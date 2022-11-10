package com.lutalic.contexto.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/words")
@Api("Demo controller with swagger, UI available at localhost:8080/swagger-ui/")
public class DemoController {

    @GetMapping("/{id}")
    @ApiOperation("Get word by id")
    public Object getWord(@PathVariable String id) {
        return null;
    }

}
