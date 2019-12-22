package com.absence.entity;

import java.io.Serializable;

import javax.persistence.*;

import com.absence.entity.enums.Role;

@Entity
public class Professeur implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String username;
	private String password;
	private String nom;
	
	
	
	@Override
	public String toString() {
		return "Professeur [id=" + id + ", username=" + username + ", password=" + password + ", nom="
				+ nom + "]";
	}

	public Professeur() {
		super();
	}

	public Professeur(Long id, String nom, String username, String password) {
		super();
		this.id = id;
		this.nom = nom;
		this.username = username;
		this.password = password;
	}

	public Long getid() {
		return id;
	}

	public void setid(Long id) {
		this.id = id;
	}

	public String getnom() {
		return nom;
	}

	public void setnom(String nom) {
		this.nom = nom;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User toUser() {
		return new User(this.getUsername(),this.getPassword(),Role.ETUDIANT);
	}
	
}
