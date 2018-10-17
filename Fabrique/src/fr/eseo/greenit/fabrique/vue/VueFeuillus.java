package fr.eseo.greenit.fabrique.vue;

import fr.eseo.greenit.fabrique.model.Arbre;
import fr.eseo.greenit.fabrique.model.EEtatFeuille;
import fr.eseo.greenit.fabrique.model.ArbreFeuillus;

import java.awt.*;

public class VueFeuillus extends VueArbre {

  public VueFeuillus(Arbre arbre, int x, int y) {
    super(arbre, x, y);
  }

  public void affiche(Graphics2D g2D) {
    ArbreFeuillus arbreFeuillus = (ArbreFeuillus) getArbre();
    //on récupere les attributs
    int largeur = arbreFeuillus.getAge();
    int hauteur = arbreFeuillus.getHauteur();

    Color couleurFeuilles;
    if (arbreFeuillus.getEtatFeuilles().equals(EEtatFeuille.VERT)) {
      couleurFeuilles = Color.GREEN;
    } else if (arbreFeuillus.getEtatFeuilles().equals(EEtatFeuille.AUTOMNE)) {
      couleurFeuilles = Color.ORANGE;
    } else if (arbreFeuillus.getEtatFeuilles().equals(EEtatFeuille.TOMBE)) {
      couleurFeuilles = Color.GRAY;
    } else {
      couleurFeuilles = Color.BLACK;
    }

    g2D.setColor(couleurFeuilles);
    g2D.fillRect(this.getX(),this.getY(), hauteur, largeur);
  };
}
