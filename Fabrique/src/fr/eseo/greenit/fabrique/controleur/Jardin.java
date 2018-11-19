package fr.eseo.greenit.fabrique.controleur;


import fr.eseo.greenit.fabrique.model.ArbreConifere;
import fr.eseo.greenit.fabrique.model.ArbreFeuillus;
import fr.eseo.greenit.fabrique.vue.VueConifere;
import fr.eseo.greenit.fabrique.vue.VueFeuillus;

import javax.swing.*;
import java.awt.*;


public class Jardin extends JFrame {
  private static Jardin fenetreJardin;

  private PanneauJardin panneauJardin;

  public Jardin() {
    Jardin.fenetreJardin = this;
    panneauJardin = new PanneauJardin(300, 300);
    add(panneauJardin);
    this.setPreferredSize(new Dimension(500, 500));
    this.setLayout(new FlowLayout());
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
    this.setLocationRelativeTo(null);

  }

  public static Jardin getInstance() {
    if (fenetreJardin == null) {
      fenetreJardin = new Jardin();
    }
    return fenetreJardin;
  }

  public static void main(String[] args) {
    CreateurVue instance = new CreateurVue();
    Createur inst = new Createur();
    for (int i = 0; i < 1000; i++) {
      Jardin.getInstance().getPanneauJardin()
              .ajouterVueArbre(
                      instance.creerVue(VueFeuillus.class, inst.creerArbre(ArbreFeuillus.class)));
    }

    for (int i = 0; i < 1000; i++) {
      Jardin.getInstance().getPanneauJardin()
              .ajouterVueArbre(
                      instance.creerVue(VueConifere.class, inst.creerArbre(ArbreConifere.class)));
    }
  }

  public PanneauJardin getPanneauJardin() {
    return panneauJardin;
  }

}
;