package com.bahawi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Eleve2")
public class Etudiant {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id=2;
	@Column
	private String nom;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Etudiant(String nom) {
		super();
		this.nom = nom;
	}
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
