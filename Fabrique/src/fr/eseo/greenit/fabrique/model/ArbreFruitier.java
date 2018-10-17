package fr.eseo.greenit.fabrique.model;

public class ArbreFruitier extends ArbreFeuillus {

  private EEtatFruit etatFruits;

  public ArbreFruitier(String genre, int age, int hauteur, EEtatFeuille etatFeuilles, EEtatFruit etatFruits) {
    super(genre, age, hauteur, etatFeuilles);
    this.etatFruits = etatFruits;
  }

  public EEtatFruit getEtatFruits() {
    return etatFruits;
  }

  public void setEtatFruits(EEtatFruit etatFruits) {
    this.etatFruits = etatFruits;
  }

}
