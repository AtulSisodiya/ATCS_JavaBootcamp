package com.gamesSpring.gamesforspring.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Games {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String gameName;
	@Column
	private int noofPlayers;
	@Column
	private String Trophies;
	
	public Games() {	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getNoofPlayers() {
		return noofPlayers;
	}

	public void setNoofPlayers(int noofPlayers) {
		this.noofPlayers = noofPlayers;
	}

	public String getTrophies() {
		return Trophies;
	}

	public void setTrophies(String trophies) {
		Trophies = trophies;
	}

	


}

