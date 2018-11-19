package fr.eseo.greenit.fabrique.vue;

import fr.eseo.greenit.fabrique.model.Arbre;
import fr.eseo.greenit.fabrique.model.ArbreConifere;
import fr.eseo.greenit.fabrique.model.EEtatPousse;

import java.awt.*;

public class VueConifere extends VueArbre {

  public VueConifere(Arbre arbre, int x, int y) {
    super(arbre, x, y);
  }

  @Override
  public void affiche(Graphics2D g2D) {
    //on récupere les attributs
    ArbreConifere arbreConifere = (ArbreConifere) getArbre();

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
    g2D.fillRect(getX() - arbreConifere.getAge() / 2, getY() + arbreConifere.getHauteur() / 2, arbreConifere.getAge(), arbreConifere.getAge());
    g2D.setColor(couleurTronc);
    g2D.fillRect(getX() - arbreConifere.getAge() / 4, getY() + arbreConifere.getHauteur() / 2 - arbreConifere.getAge(), arbreConifere.getAge() / 2, arbreConifere.getHauteur() - arbreConifere.getAge());
  }

}
