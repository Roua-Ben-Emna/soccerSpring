package com.example.soccer.soccer.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.soccer.soccer.models.Player;
import com.example.soccer.soccer.repositories.playerRepository;
import com.example.soccer.soccer.services.playerService;
@Service
public class playerServiceImpl implements playerService {
	@Autowired
	public playerRepository playerRepository;
	@Override
	public List<Player> getAllPlayers() {
		// TODO Auto-generated method stub
		return playerRepository.findAll();
	}

	@Override
	public Player updatePlayer(Player p) {
		// TODO Auto-generated method stub
		return playerRepository.save(p);
	}

	@Override
	public void deletePlayer(Long id) {
		// TODO Auto-generated method stub
		playerRepository.deleteById(id);
	}

	@Override
	public Player addPlayer(Player p) {
		// TODO Auto-generated method stub
		return playerRepository.save(p);
	}

	@Override
	public Player findPlayer(Long id) {
		// TODO Auto-generated method stub
		Optional<Player> player=playerRepository.findById(id);
		return player.isPresent()? player.get(): null;
	}
}
