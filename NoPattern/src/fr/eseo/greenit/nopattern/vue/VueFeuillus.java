package src.fr.eseo.greenit.nopattern.vue;



import java.awt.*;

import src.fr.eseo.greenit.nopattern.model.ArbreFeuillus;
import src.fr.eseo.greenit.nopattern.model.EEtatFeuille;

public class VueFeuillus {
	ArbreFeuillus arbreFeuillus;
	int x;
	int y;
	int largeur;
	int hauteur;
  public VueFeuillus(src.fr.eseo.greenit.nopattern.model.ArbreFeuillus arbreFeuillus, int x, int y) {
    this.arbreFeuillus=arbreFeuillus;
    this.x=x;
    this.y=y;
    this.largeur=arbreFeuillus.getAge();
    this.hauteur=arbreFeuillus.getHauteur();
  }

  public void affiche(Graphics2D g2D) {
    //on récupere les attributs
    

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
    g2D.fillRect(x - largeur/2, y + hauteur/2, largeur, largeur);
    g2D.setColor(couleurTronc);
    g2D.fillRect(x - largeur/4,y + hauteur/2 - largeur, largeur/2, hauteur-largeur );
  };
}
