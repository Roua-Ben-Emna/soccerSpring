package com.example.soccer.soccer.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.soccer.soccer.models.Match;


public interface matchRepository extends JpaRepository<Match,Long> {
	

}
