package fr.eseo.greenit.fabrique.controleur;

import fr.eseo.greenit.fabrique.model.Arbre;
import fr.eseo.greenit.fabrique.model.ArbreConifere;
import fr.eseo.greenit.fabrique.model.ArbreFeuillus;
import fr.eseo.greenit.fabrique.model.EEtatFeuille;
import fr.eseo.greenit.fabrique.model.EGenreArbre;

public class Createur {

  public Arbre creerArbre(Class<? extends Arbre> classe) {

    String nomClasse = classe.getSimpleName();
    Arbre arbre = null;
    System.out.println("he" + nomClasse);
    switch (nomClasse) {
      case "ArbreConifere":
        arbre = creerConifere();
        break;
      case "ArbreFeuillus":
        arbre = creerFeuillu();
        break;
    }
    return arbre;
  }

  public ArbreConifere creerConifere() {
    return new ArbreConifere(EGenreArbre.CEDRE, 100, 200, null);
  }

  public ArbreFeuillus creerFeuillu() {
    return new ArbreFeuillus(EGenreArbre.CHENE, 100, 50, EEtatFeuille.VERT);
  }

}