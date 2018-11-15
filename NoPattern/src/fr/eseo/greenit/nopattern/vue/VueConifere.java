package src.fr.eseo.greenit.nopattern.vue;

import java.awt.Color;
import java.awt.Graphics2D;

import fr.eseo.greenit.fabrique.model.Arbre;
import fr.eseo.greenit.fabrique.model.ArbreFeuillus;
import fr.eseo.greenit.fabrique.model.EEtatFeuille;
import src.fr.eseo.greenit.nopattern.model.ArbreConifere;

public class VueConifere {
	ArbreConifere arbreConifere;
	int x;
	int y;
	int largeur;
	int hauteur;
	
  public VueConifere(src.fr.eseo.greenit.nopattern.model.ArbreConifere arbreConifere, int x, int y) {
    this.arbreConifere=arbreConifere;
    this.x=x;
    this.y=y;
    this.hauteur=arbreConifere.getHauteur();
    this.largeur=arbreConifere.getAge();
  }
	

	  public void affiche(Graphics2D g2D) {
		    //on récupere les attributs
		    

		    Color couleurFeuilles;
		    if (arbreConifere.getEtatFeuilles().equals(EEtatFeuille.VERT)) {
		      couleurFeuilles = Color.GREEN;
		    } else if (arbreConifere.getEtatFeuilles().equals(EEtatFeuille.AUTOMNE)) {
		      couleurFeuilles = Color.ORANGE;
		    } else if (arbreConifere.getEtatFeuilles().equals(EEtatFeuille.TOMBE)) {
		      couleurFeuilles = Color.GRAY;
		    } else {
		      couleurFeuilles = Color.BLACK;
		    }

		    Color couleurTronc = Color.BLACK;
		    if (arbreConifere.getEtatFeuilles().equals(EEtatFeuille.VERT)) {
		    } else {
		      couleurTronc = Color.BLACK;
		    }

		    g2D.setColor(couleurFeuilles);
		    g2D.fillRect(x - largeur/2, y + hauteur/2, largeur, largeur);
		    g2D.setColor(couleurTronc);
		    g2D.fillRect(x - largeur/4, y + hauteur/2 - largeur, largeur/2, hauteur-largeur );
		  };

}
