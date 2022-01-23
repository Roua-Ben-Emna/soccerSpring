package com.example.soccer.soccer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.soccer.soccer.models.Player;
import com.example.soccer.soccer.services.playerService;

@CrossOrigin("*") 
@RestController
@RequestMapping("api/players") 
public class PlayerController {
	 @Autowired
	 private playerService playerService;
	
	@GetMapping("")
	public List<Player> getAllplayers(){
	return playerService.getAllPlayers();
	}
	@PutMapping("/{id}")
	public Player update(@PathVariable Long id ,@RequestBody Player plat) 
	{ return playerService.updatePlayer(plat);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) 
	{ playerService.deletePlayer(id);
	}
	@PostMapping
	public Player add(@RequestBody Player plat) { 
		return playerService.addPlayer(plat);
	}
	
	@GetMapping("/{id}")
	public Player getplayersById(@PathVariable Long id) { 
		return playerService.findPlayer(id);
	}
}
