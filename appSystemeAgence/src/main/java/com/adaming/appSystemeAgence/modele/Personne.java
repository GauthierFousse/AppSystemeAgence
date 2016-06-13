package com.adaming.appSystemeAgence.modele;

public abstract class Personne {

	private int id;
	private String nom;
	private String prenom;
	private Adresse adresse;
	private String telPrive;

	public Personne() {
		super();
	}

	public Personne(String nom, String prenom, Adresse adresse, String telPrive) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telPrive = telPrive;
	}

	public Personne(int id, String nom, String prenom, Adresse adresse, String telPrive) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telPrive = telPrive;
	}

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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String getTelPrive() {
		return telPrive;
	}

	public void setTelPrive(String telPrive) {
		this.telPrive = telPrive;
	}

}
