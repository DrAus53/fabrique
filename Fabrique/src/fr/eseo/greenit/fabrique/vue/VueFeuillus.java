package fr.eseo.greenit.fabrique.vue;

import fr.eseo.greenit.fabrique.model.Arbre;
import fr.eseo.greenit.fabrique.model.ArbreFeuillus;
import fr.eseo.greenit.fabrique.model.EEtatFeuille;

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

    Color couleurTronc = Color.BLACK;
    if (arbreFeuillus.getEtatFeuilles().equals(EEtatFeuille.VERT)) {
    } else {
      couleurTronc = Color.BLACK;
    }

    g2D.setColor(couleurFeuilles);
    g2D.fillRect(this.getX() - largeur/2, this.getY() + hauteur/2, largeur, largeur);
    g2D.setColor(couleurTronc);
    g2D.fillRect(this.getX() - largeur/4, this.getY() + hauteur/2 - largeur, largeur/2, hauteur-largeur );
  };
}
