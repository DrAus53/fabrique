package fr.eseo.greenit.fabrique.model;

public class Feuillus extends Arbre {

  public Feuillus(String genre, int age, int hauteur, int nombreFeuilles, EEtatFeuille etatFeuilles) {
    super(genre, age, hauteur);
    this.nombreFeuilles = nombreFeuilles;
    this.etatFeuilles = etatFeuilles;
  }

  private int nombreFeuilles;

  private EEtatFeuille etatFeuilles;

  public int getNombreFeuilles() {
    return nombreFeuilles;
  }

  public void setNombreFeuilles(int nombreFeuilles) {
    this.nombreFeuilles = nombreFeuilles;
  }

  public EEtatFeuille getEtatFeuilles() {
    return etatFeuilles;
  }

  public void setEtatFeuilles(EEtatFeuille etatFeuilles) {
    this.etatFeuilles = etatFeuilles;
  }
}
