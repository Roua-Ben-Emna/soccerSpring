package com.example.soccer.soccer.services;

import java.util.List;

import com.example.soccer.soccer.models.Player;

public interface playerService {
	public List<Player> getAllPlayers() ;
	public Player updatePlayer(Player p);
	public void deletePlayer(Long id);
	public Player addPlayer(Player p);
	public Player findPlayer(Long id);
}
