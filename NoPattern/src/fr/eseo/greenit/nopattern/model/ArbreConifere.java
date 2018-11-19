package fr.eseo.greenit.nopattern.model;

public class ArbreConifere {

  private EGenreArbre genre;

  private int age;

  private int hauteur;

  private EEtatPousse croissance;

  private EEtatFeuille etatFeuilles;

  public ArbreConifere(EGenreArbre genre, int age, int hauteur, EEtatPousse croissance, EEtatFeuille etatFeuille) {
    this.genre = genre;
    this.age = age;
    this.hauteur = hauteur;
    this.croissance = croissance;
    this.etatFeuilles = etatFeuille;
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

  public EEtatFeuille getEtatFeuilles() {
    return etatFeuilles;
  }

  public void setEtatFeuillus(EEtatFeuille etatFeuilles) {
    this.etatFeuilles = etatFeuilles;
  }


}