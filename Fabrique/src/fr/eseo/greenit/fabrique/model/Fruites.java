package fr.eseo.greenit.fabrique.model;

public class Fruites extends Feuillus {

  private EEtatFruit etatFruits;
  private int nombreFruits;
  private int tailleFruits;

  public Fruites(String genre, int age, int hauteur, int nombreFeuilles, EEtatFeuille etatFeuilles, EEtatFruit etatFruits, int nombreFruits, int tailleFruits) {
    super(genre, age, hauteur, nombreFeuilles, etatFeuilles);
    this.etatFruits = etatFruits;
    this.nombreFruits = nombreFruits;
    this.tailleFruits = tailleFruits;
  }

  public EEtatFruit getEtatFruits() {
    return etatFruits;
  }

  public void setEtatFruits(EEtatFruit etatFruits) {
    this.etatFruits = etatFruits;
  }

  public int getNombreFruits() {
    return nombreFruits;
  }

  public void setNombreFruits(int nombreFruits) {
    this.nombreFruits = nombreFruits;
  }

  public int getTailleFruits() {
    return tailleFruits;
  }

  public void setTailleFruits(int tailleFruits) {
    this.tailleFruits = tailleFruits;
  }
}
