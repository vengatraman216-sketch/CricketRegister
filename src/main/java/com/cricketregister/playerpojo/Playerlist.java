package com.cricketregister.playerpojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "player_table1")
public class Playerlist {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "name")
	private String name;
	@Column(name = "jerseynumber")
	private int jerseynumber;
	@Column(name = "teamname")
	private String teamname;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJerseynumber() {
		return jerseynumber;
	}
	public void setJerseynumber(int jerseynumber) {
		this.jerseynumber = jerseynumber;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getAvailabity() {
		return availabity;
	}
	public void setAvailabity(String availabity) {
		this.availabity = availabity;
	}
	@Column(name = "role")
	private String role;
	@Column(name = "availabity")
	private String availabity;

}
