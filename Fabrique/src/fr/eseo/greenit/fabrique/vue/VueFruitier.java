package fr.eseo.greenit.fabrique.vue;

import fr.eseo.greenit.fabrique.model.Arbre;
import fr.eseo.greenit.fabrique.model.EEtatFeuille;
import fr.eseo.greenit.fabrique.model.ArbreFeuillus;
import fr.eseo.greenit.fabrique.model.ArbreFruitier;

import java.awt.*;

public class VueFruitier extends VueArbre {

  public VueFruitier(Arbre arbre, int x, int y) {
    super(arbre, x, y);
  }

  public void affiche(Graphics2D g2D) {
    ArbreFruitier arbreFruitiers = (ArbreFruitier) getArbre();
    //on récupère les attributs
    int largeur = arbreFruitiers.getAge();
    int hauteur = arbreFruitiers.getHauteur();

    Color couleurFeuilles;
    if (arbreFruitiers.getEtatFeuilles().equals(EEtatFeuille.VERT)) {
      couleurFeuilles = Color.GREEN;
    } else if (arbreFruitiers.getEtatFeuilles().equals(EEtatFeuille.AUTOMNE)) {
      couleurFeuilles = Color.ORANGE;
    } else if (arbreFruitiers.getEtatFeuilles().equals(EEtatFeuille.TOMBE)) {
      couleurFeuilles = Color.GRAY;
    } else {
      couleurFeuilles = Color.BLACK;
    }

    g2D.setColor(couleurFeuilles);
    g2D.fillOval(this.getX(), this.getY(), hauteur/2, largeur);
    Color couleurTronc=Color.BLACK;
    g2D.setColor(couleurTronc);
    //g2D.fillRect(this.getX(),this.getY(), hauteur, largeur);
  
  };
}
