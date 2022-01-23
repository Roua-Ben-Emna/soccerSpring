package com.example.soccer.soccer.services;

import java.util.List;

import com.example.soccer.soccer.models.Match;


public interface matchService {
	public List<Match> getAllMatchs();
	public Match updateMatch(Match p);
	public void deleteMatch(Long id);
	public Match addMatch(Match p);
	public Match findMatch(Long id);
}
