package fr.eseo.greenit.nopattern;

public class Conifere extends Arbre{
	
	private String genre;
	private int age;
	private int hauteur;
	
	public Conifere (String genre, int age, int hauteur) {
		setGenre(genre);
		setAge(age);
		setHauteur(hauteur);
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

}
