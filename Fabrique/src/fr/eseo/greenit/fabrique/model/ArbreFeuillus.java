package fr.eseo.greenit.fabrique.model;

public class ArbreFeuillus extends Arbre {

  private EEtatFeuille etatFeuilles;

  public ArbreFeuillus(EGenreArbre genre, int age, int hauteur, EEtatFeuille etatFeuilles) {
    super(genre, age, hauteur);
    this.etatFeuilles = etatFeuilles;
  }

  public EEtatFeuille getEtatFeuilles() {
    return etatFeuilles;
  }

  public void setEtatFeuilles(EEtatFeuille etatFeuilles) {
    this.etatFeuilles = etatFeuilles;
  }
}
