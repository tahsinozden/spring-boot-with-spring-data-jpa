package com.web.app.services;

import com.web.app.entities.Movie;
import com.web.app.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public void initData() {
        if (movieRepository.findAll().isEmpty()){
            Movie mv1 = new Movie("Hello");
            Movie mv2 = new Movie("There");
            Movie mv3 = new Movie("Tahsin");
            Movie mv4 = new Movie("Ozden");
            Movie mv5 = new Movie("Yep");

            movieRepository.save(Arrays.asList(mv1, mv2, mv3, mv4, mv5));
        }
    }

    public void changeData(String oldName, String newName) {
        List<Movie> movies = movieRepository.findByName(oldName);
        if (!movies.isEmpty()){
            movies
                    .get(0)
                    .setName(newName);
            movieRepository.save(movies);
        }
    }
}
