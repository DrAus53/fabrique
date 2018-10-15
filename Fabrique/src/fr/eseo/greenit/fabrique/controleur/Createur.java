package fr.eseo.greenit.fabrique.controleur;

import fr.eseo.greenit.fabrique.Arbre;

public abstract class Createur {

  public abstract Arbre creerArbre(String nomArbre);

  public static void afficherArbre (String type) {
    Createur createur;

    if("bouleau".equals(type)) {

    }
  }
}
