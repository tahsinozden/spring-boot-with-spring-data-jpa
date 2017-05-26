package com.web.app.repositories;

import com.web.app.entities.Star;
import com.web.app.entities.wrappers.StarSummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StarRepository extends JpaRepository<Star, Long> {


//    @Query(value = "select s.name as starName, m.name as movieName from Star s inner join Movie m on m.id = s.movie_Id where s.id = ?1 ", nativeQuery = true)
//    List<StarWrapper> findByStarId(Long starId);
    @Query(value = "select s.name as starName, m.name as movieName from Star s, Movie m where m.id = s.movieId and s.id = ?1 ")
    List<StarSummary> findByStarId(Long starId);
}
