package com.absence.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.absence.entity.enums.Role;

@Entity
public class Etudiant implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String username;
	private String password;
	private String cne;
	private String nom;
	private Long idclasse;
	
	
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Etudiant(String username, String password, String cne, String nom, Long classe) {
		super();
		this.username = username;
		this.password = password;
		this.cne = cne;
		this.nom = nom;
		this.idclasse = classe;
	}




	public Etudiant(Long id, String username, String password, String cne, String nom, Long classe) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.cne = cne;
		this.nom = nom;
		this.idclasse = classe;
	}




	public User toUser() {
		return new User(this.username, this.password, Role.ETUDIANT);
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
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




	public String getCne() {
		return cne;
	}




	public void setCne(String cne) {
		this.cne = cne;
	}




	public String getNom() {
		return nom;
	}




	public void setNom(String nom) {
		this.nom = nom;
	}




	public Long getClasse() {
		return idclasse;
	}




	public void setClasse(Long classe) {
		this.idclasse = classe;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
}
