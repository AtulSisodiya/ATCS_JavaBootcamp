package com.gamesSpring.gamesforspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gamesSpring.gamesforspring.domain.Games;
import com.gamesSpring.gamesforspring.service.GamesService;

///@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/games/api")
@RestController
public class GamesController {
	
	private GamesService gamesService;
	
	@Autowired
	public void setGamesService(GamesService gamesService) {
		this.gamesService = gamesService;
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Games>> getAll() {
		return ResponseEntity.ok(gamesService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Games> findById(@PathVariable Long id) {
		return ResponseEntity.ok(gamesService.findById(id).orElse(null));
	}
	
	@PutMapping("/")
	public ResponseEntity<Games> update(@RequestBody Games games) {
		return ResponseEntity.ok(gamesService.save(games));
	}
	
	@PostMapping("/")
	public ResponseEntity<Games> add(@RequestBody Games games) {
		return ResponseEntity.ok(gamesService.save(games));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Games> delete(@PathVariable Long id) {
		gamesService.findById(id).ifPresent(gamesService::delete);
		return ResponseEntity.ok().build();
	}
}


