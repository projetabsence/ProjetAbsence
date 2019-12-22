package com.absence.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Absence {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAbsence;
	private Boolean jusitifie;
	private Module module;
	private Etudiant etudiant;
	
	public Absence() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Absence(Integer idAbsence, Boolean jusitifie, Module module, Etudiant etudiant) {
		super();
		this.idAbsence = idAbsence;
		this.jusitifie = jusitifie;
		this.module = module;
		this.etudiant = etudiant;
	}

	public Integer getIdAbsence() {
		return idAbsence;
	}

	public void setIdAbsence(Integer idAbsence) {
		this.idAbsence = idAbsence;
	}

	public Boolean getJusitifie() {
		return jusitifie;
	}

	public void setJusitifie(Boolean jusitifie) {
		this.jusitifie = jusitifie;
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	
	

}
