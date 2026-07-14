package com.cricketregister.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.cricketregister.playerpojo.Playerlist;
import com.cricketregister.repo.repodatabase;

@Service
public class Playerservice {

	@Autowired
	repodatabase repodatabase;

	public List<Playerlist> saveplayerlist(List<Playerlist> player) {
		return repodatabase.saveAll(player);
	}

	public Playerlist savesingle(Playerlist single) {
		return repodatabase.save(single);
	}

	public List<Playerlist> getall() {
		return repodatabase.findAll();
	}

	public Playerlist update(Long id, Playerlist update) {
		Playerlist existing = repodatabase.findById(id)
				.orElseThrow(() -> new RuntimeException("Player not found with id " + id));
		existing.setName(update.getName());
		existing.setJerseynumber(update.getJerseynumber());
		existing.setAvailabity(update.getAvailabity());
		existing.setRole(update.getRole());
		existing.setTeamname(update.getTeamname());

		return repodatabase.save(existing);
	}

	public void delete(Long id) {
		if (!repodatabase.existsById(id)) {
			throw new RuntimeException("Player not found with id " + id);
		}

		repodatabase.deleteById(id);

	}
	public Optional<Playerlist> findone(Long id) {

	return	repodatabase.findById(id);
		
	}

}
