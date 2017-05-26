package com.web.app.controllers;

import com.web.app.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    @Autowired
    MovieService movieService;

    @GetMapping("/movie/{oldName}")
    public String changeValue(@PathVariable("oldName") String oldName,
                              @RequestParam("newName") String newName) {
        movieService.changeData(oldName, newName);
        return "changed.";
    }
}
