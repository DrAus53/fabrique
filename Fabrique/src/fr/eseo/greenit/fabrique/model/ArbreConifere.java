package fr.eseo.greenit.fabrique.model;

public class ArbreConifere extends Arbre {

  private String genre;

  private int age;

  private int hauteur;

  private EEtatPousse croissance;


  public ArbreConifere(EGenreArbre genre, int age, int hauteur, EEtatPousse croissance) {
    super(genre, age, hauteur);
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

  public EEtatPousse getCroissance() {
    return croissance;
  }

  public void setCroissance(EEtatPousse croissance) {
    this.croissance = croissance;
  }

}