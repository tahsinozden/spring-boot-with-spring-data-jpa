package com.web.app.repositories;

import com.web.app.entities.Movie;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "movie", path = "movies")
public interface RestMovieRepository extends PagingAndSortingRepository<Movie, Long> {
    List<Movie> findByName(@Param("name") String name);
}
