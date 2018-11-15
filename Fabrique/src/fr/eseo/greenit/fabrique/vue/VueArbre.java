package fr.eseo.greenit.fabrique.vue;

import fr.eseo.greenit.fabrique.model.Arbre;

import java.awt.*;

public abstract class VueArbre {

  protected final Arbre arbre;
  private final int x;
  private final int y;

  public VueArbre(Arbre arbre, int x, int y) {
    this.arbre = arbre;
    this.x = x;
    this.y = y;
  }

  public Arbre getArbre() {
    return this.arbre;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public abstract void affiche(Graphics2D g2D);
}


