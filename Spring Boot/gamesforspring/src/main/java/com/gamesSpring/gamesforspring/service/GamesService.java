package com.gamesSpring.gamesforspring.service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.gamesSpring.gamesforspring.domain.Games;

@Service
public interface GamesService extends JpaRepository<Games, Long>{

}
