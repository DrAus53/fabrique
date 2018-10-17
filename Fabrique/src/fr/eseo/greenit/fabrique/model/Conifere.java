package fr.eseo.greenit.fabrique.model;

public class Conifere extends Arbre {

	private String genre;
	private int age;
	private int hauteur;
	private EEtatPersist feuille;
	private EEtatPousse croissance;
	

	public Conifere(String genre, int age, int hauteur, EEtatPersist feuille, EEtatPousse croissance) {
		super(genre, age, hauteur);
		this.feuille = feuille;
		this.croissance = croissance;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getHauteur() {
		return hauteur;
	}

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public EEtatPersist getFeuille() {
		return feuille;
	}

	public void setFeuille(EEtatPersist feuille) {
		this.feuille = feuille;
	}
	
	public EEtatPousse getCroissance() {
		return croissance;
	}

	public void setCroissance(EEtatPousse croissance) {
		this.croissance = croissance;
	}

}