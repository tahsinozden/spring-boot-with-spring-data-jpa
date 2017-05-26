package com.web.app.services;

import com.web.app.entities.Star;
import com.web.app.entities.wrappers.StarSummary;
import com.web.app.repositories.StarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StarService {
    @Autowired
    StarRepository starRepository;

    public void initData() {

        if (starRepository.findAll().isEmpty()){
            Star s1 = new Star("tahsin ozden", 1L);
            Star s2 = new Star("tahsin", 2L);
            Star s3 = new Star("ozden", 3L);
            Star s4 = new Star("evet", 4L);

            starRepository.save(Arrays.asList(s1,s2, s3, s4));
        }

    }

    public List<StarSummary> getStar(Long starId) {
        return starRepository.findByStarId(starId);
    }
}
