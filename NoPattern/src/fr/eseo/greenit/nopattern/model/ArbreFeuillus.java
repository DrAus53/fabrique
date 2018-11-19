package fr.eseo.greenit.nopattern.model;

public class ArbreFeuillus {
  EGenreArbre genre;

  int age;

  int hauteur;

  private EEtatFeuille etatFeuilles;

  public ArbreFeuillus(EGenreArbre genre, int age, int hauteur, EEtatFeuille etatFeuilles) {
    this.genre = genre;
    this.age = age;
    this.hauteur = hauteur;
    this.etatFeuilles = etatFeuilles;
  }

  public EEtatFeuille getEtatFeuilles() {
    return etatFeuilles;
  }

  public void setEtatFeuilles(EEtatFeuille etatFeuilles) {
    this.etatFeuilles = etatFeuilles;
  }

  public EGenreArbre getGenre() {
    return genre;
  }

  public void setGenre(EGenreArbre genre) {
    this.genre = genre;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getHauteur() {
    return hauteur;
  }

  public void setHauteur(int hauteur) {
    this.hauteur = hauteur;
  }
}
