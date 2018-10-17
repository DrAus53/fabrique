package fr.eseo.greenit.fabrique.model;

public abstract class Arbre {

  public Arbre (EGenreArbre genre, int age, int hauteur) {
    this.genre = genre.getName();
    this.age = age;
    this.hauteur = hauteur;
  }

  private int hauteur;

  private int age;

  private String genre;

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

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }
}
