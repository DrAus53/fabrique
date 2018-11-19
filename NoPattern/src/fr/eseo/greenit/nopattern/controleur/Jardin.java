package fr.eseo.greenit.nopattern.controleur;


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
    Jardin.getInstance().getPanneauJardin();

  }

  public fr.eseo.greenit.nopattern.controleur.PanneauJardin getPanneauJardin() {
    return panneauJardin;
  }

}
;