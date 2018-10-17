package fr.eseo.greenit.fabrique.model;

public class ArbreFeuillus extends Arbre {

  public ArbreFeuillus(String genre, int age, int hauteur, EEtatFeuille etatFeuilles) {
    super(genre, age, hauteur);
    this.etatFeuilles = etatFeuilles;
  }

  private int nombreFeuilles;

  private EEtatFeuille etatFeuilles;

  public EEtatFeuille getEtatFeuilles() {
    return etatFeuilles;
  }

  public void setEtatFeuilles(EEtatFeuille etatFeuilles) {
    this.etatFeuilles = etatFeuilles;
  }
}
