package src.fr.eseo.greenit.nopattern.model;

public class ArbreConifere {

	private EGenreArbre genre;
	private int age;
	private int hauteur;
	private EEtatPousse croissance;
	

	public ArbreConifere(EGenreArbre genre, int age, int hauteur, EEtatPousse croissance) {
		this.genre=genre;
		this.age=age;
		this.hauteur=hauteur;
		this.croissance = croissance;
	}

	public EGenreArbre getGenre() {
		return genre;
	}

	public void setGenre(EGenreArbre genre) {
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
	
	public EEtatPousse getCroissance() {
		return croissance;
	}

	public void setCroissance(EEtatPousse croissance) {
		this.croissance = croissance;
	}

}