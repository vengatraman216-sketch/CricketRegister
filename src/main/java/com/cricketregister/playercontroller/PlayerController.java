package com.cricketregister.playercontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cricketregister.playerpojo.Playerlist;
import com.cricketregister.service.Playerservice;

@RestController
@RequestMapping("/player")
public class PlayerController {
	@Autowired
	Playerservice service;

	@PostMapping("/saveplayerlist")
	public List<Playerlist> savelist(@RequestBody List<Playerlist> player) {
		return service.saveplayerlist(player);
	}

	@PostMapping("/single")
	public Playerlist savesingle(@RequestBody Playerlist single) {
		return service.savesingle(single);

	}

	@GetMapping("/getall")
	public List<Playerlist> getall() {
		return service.getall();
	}
	@GetMapping("/status")
	public String getStatus() {
		return "Player Status Running Successfully";
	}
	@GetMapping("/statuschecking")
	public String getStatuschecking() {
		return "Player Status Checking Running Successfully";
	}

	@PutMapping("/update")
	public Playerlist updated(@RequestParam Long id, @RequestBody Playerlist update) {
		return service.update(id, update);
	}

	@DeleteMapping("/delete")
	public ResponseEntity<String> deletePlayer(@RequestParam Long id) {
		service.delete(id);
		return ResponseEntity.ok("Player deleted successfully");
	}
	
	@GetMapping("/getone")
public Optional<Playerlist> findone(@RequestParam Long id) {
	return service.findone(id);
}
}
