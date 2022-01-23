package com.example.soccer.soccer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.soccer.soccer.models.Player;

public interface playerRepository  extends JpaRepository<Player,Long>{

}
