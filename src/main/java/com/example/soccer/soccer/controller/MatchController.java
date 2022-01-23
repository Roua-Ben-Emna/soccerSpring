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
import com.example.soccer.soccer.models.Match;
import com.example.soccer.soccer.services.*;


@CrossOrigin("*") 
@RestController
@RequestMapping("api/matchs") 
public class MatchController {
	 @Autowired
	 private matchService matchService;
	
	@GetMapping("")
	public List<Match> getAllmatchs(){
	return matchService.getAllMatchs();
	}
	@PutMapping("/{id}")
	public Match update(@PathVariable Long id ,@RequestBody Match plat) 
	{ return matchService.updateMatch(plat);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) 
	{ matchService.deleteMatch(id);
	}
	@PostMapping
	public Match add(@RequestBody Match plat) { 
		return matchService.addMatch(plat);
	}
	
	@GetMapping("/{id}")
	public Match getmatchsById(@PathVariable Long id) { 
		return matchService.findMatch(id);
	}
}
