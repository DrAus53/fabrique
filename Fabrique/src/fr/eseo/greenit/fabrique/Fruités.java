package fr.eseo.greenit.fabrique;

public class Fruités extends Feuillus {

  public Fruités(String genre, int age, int hauteur, int nombreFeuilles, EEtatFeuille etatFeuilles, EEtatFruit etatFruits, int nombreFruits, int tailleFruits) {
    super(genre, age, hauteur, nombreFeuilles, etatFeuilles);
    this.etatFruits = etatFruits;
    this.nombreFruits = nombreFruits;
    this.tailleFruits = tailleFruits;
  }

  private EEtatFruit etatFruits;

  private int nombreFruits;

  private int tailleFruits;

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
