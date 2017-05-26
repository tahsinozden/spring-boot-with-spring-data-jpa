package com.web.app.controllers;


import com.web.app.entities.wrappers.StarSummary;
import com.web.app.services.StarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StarController {

    @Autowired
    StarService starService;

    @GetMapping("/star/{id}")
    public List<StarSummary> getStar(@PathVariable("id") Long starId) {
        return starService.getStar(starId);
    }
}
