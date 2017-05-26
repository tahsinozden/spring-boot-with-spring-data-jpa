package com.web.app.repositories;

import com.web.app.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by tahsin on 5/23/17.
 */
@Transactional
public interface MovieRepository extends JpaRepository<Movie, Long>{
    List<Movie> findByName(String name);
}
