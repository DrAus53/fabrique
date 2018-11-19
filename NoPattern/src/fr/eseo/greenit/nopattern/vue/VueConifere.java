package fr.eseo.greenit.nopattern.vue;

import fr.eseo.greenit.nopattern.model.ArbreConifere;
import fr.eseo.greenit.nopattern.model.EEtatPousse;

import java.awt.*;

public class VueConifere {
  ArbreConifere arbreConifere;

  int x;

  int y;

  int largeur;

  int hauteur;

  public VueConifere(ArbreConifere arbreConifere, int x, int y) {
    this.arbreConifere = arbreConifere;
    this.x = x;
    this.y = y;
    this.hauteur = arbreConifere.getHauteur();
    this.largeur = arbreConifere.getAge();
  }


  public void affiche(Graphics2D g2D) {
    //on récupere les attributs


    Color couleurFeuilles;
    if (arbreConifere.getCroissance() == null) {
      couleurFeuilles = Color.MAGENTA;
    } else if (arbreConifere.getCroissance().equals(EEtatPousse.BOULE)) {
      couleurFeuilles = Color.GREEN;
    } else if (arbreConifere.getCroissance().equals(EEtatPousse.BUISSON)) {
      couleurFeuilles = Color.ORANGE;
    } else if (arbreConifere.getCroissance().equals(EEtatPousse.COLONNE)) {
      couleurFeuilles = Color.GRAY;
    } else if (arbreConifere.getCroissance().equals(EEtatPousse.CONE)) {
      couleurFeuilles = Color.CYAN;
    } else if (arbreConifere.getCroissance().equals(EEtatPousse.ETALE)) {
      couleurFeuilles = Color.RED;
    } else if (arbreConifere.getCroissance().equals(EEtatPousse.FUSEAU)) {
      couleurFeuilles = Color.BLUE;
    } else if (arbreConifere.getCroissance().equals(EEtatPousse.RAMPANT)) {
      couleurFeuilles = Color.YELLOW;
    } else {
      couleurFeuilles = Color.BLACK;
    }

    Color couleurTronc = Color.LIGHT_GRAY;
    if (!EEtatPousse.ETALE.equals(arbreConifere.getCroissance()) || !EEtatPousse.RAMPANT.equals(arbreConifere.getCroissance())) {
      couleurTronc = Color.DARK_GRAY;
    }

    g2D.setColor(couleurFeuilles);
    g2D.fillRect(x - largeur / 2, y + hauteur / 2, largeur, largeur);
    g2D.setColor(couleurTronc);
    g2D.fillRect(x - largeur / 4, y + hauteur / 2 - largeur, largeur / 2, hauteur - largeur);
  }

}
