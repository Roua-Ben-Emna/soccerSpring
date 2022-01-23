package com.example.soccer.soccer.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.soccer.soccer.models.Match;
import com.example.soccer.soccer.repositories.matchRepository;
import com.example.soccer.soccer.services.matchService;

@Service
public class matchServiceImpl implements  matchService {
	@Autowired
	public matchRepository matchRepository;
	@Override
	public List<Match> getAllMatchs() {
		// TODO Auto-generated method stub
		return matchRepository.findAll();
	}

	@Override
	public Match updateMatch(Match p) {
		// TODO Auto-generated method stub
		return matchRepository.save(p);
	}

	@Override
	public void deleteMatch(Long id) {
		// TODO Auto-generated method stub
		matchRepository.deleteById(id);
	}

	@Override
	public Match addMatch(Match p) {
		// TODO Auto-generated method stub
		return matchRepository.save(p);
	}

	@Override
	public Match findMatch(Long id) {
		// TODO Auto-generated method stub
		Optional<Match> match=matchRepository.findById(id);
		return match.isPresent()? match.get(): null;
	}

}
