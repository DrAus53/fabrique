package fr.eseo.greenit.fabrique.vue;

import fr.eseo.greenit.fabrique.model.Arbre;
import fr.eseo.greenit.fabrique.model.EEtatFeuille;
import fr.eseo.greenit.fabrique.model.Feuillus;

import java.awt.*;

public class VueFeuillus extends VueArbre {

  public VueFeuillus(Arbre arbre) {
    super(arbre);
  }

  public void affiche(Graphics2D g2D) {
    Feuillus feuillus = (Feuillus) getArbre();
    //on récupere les attributs
    int largeur = feuillus.getAge();
    int hauteur = feuillus.getHauteur();

    Color couleurFeuilles;
    if (feuillus.getEtatFeuilles().equals(EEtatFeuille.VERT)) {
      couleurFeuilles = Color.GREEN;
    } else if (feuillus.getEtatFeuilles().equals(EEtatFeuille.AUTOMNE)) {
      couleurFeuilles = Color.ORANGE;
    } else if (feuillus.getEtatFeuilles().equals(EEtatFeuille.TOMBE)) {
      couleurFeuilles = Color.GRAY;
    } else {
      couleurFeuilles = Color.BLACK;
    }

    g2D.setColor(couleurFeuilles);
    //g2D.fillRect(largeur,largeur);
  };
}
