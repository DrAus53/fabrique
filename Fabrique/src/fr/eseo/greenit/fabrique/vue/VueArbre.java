package fr.eseo.greenit.fabrique.vue;

import fr.eseo.greenit.fabrique.model.Arbre;

import java.awt.*;

public abstract class VueArbre {

  protected final Arbre arbre;

  public VueArbre(Arbre arbre) {
    this.arbre = arbre;
  }

  public Arbre getArbre() {
    return this.arbre;
  }

  public abstract void affiche(Graphics2D g2D);
}
