package com.cricketregister.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricketregister.playerpojo.Playerlist;

public interface repodatabase extends JpaRepository<Playerlist, Long> {

}
