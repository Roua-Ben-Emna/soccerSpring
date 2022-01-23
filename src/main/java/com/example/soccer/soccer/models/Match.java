package com.example.soccer.soccer.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Matchs")
public class Match {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MATCH_ID")
	private Long id;
	@Column
	private String team1;
	@Column
	private String team2;
	@Column
	private Integer score1;
	@Column
	private Integer score2;
	
	public Match() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Match(Long id, String team1, String team2, Integer score1, Integer score2) {
		super();
		this.id = id;
		this.team1 = team1;
		this.team2 = team2;
		this.score1 = score1;
		this.score2 = score2;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTeam1() {
		return team1;
	}
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	public Integer getScore1() {
		return score1;
	}
	public void setScore1(Integer score1) {
		this.score1 = score1;
	}
	public Integer getScore2() {
		return score2;
	}
	public void setScore2(Integer score2) {
		this.score2 = score2;
	}
	
	
}
