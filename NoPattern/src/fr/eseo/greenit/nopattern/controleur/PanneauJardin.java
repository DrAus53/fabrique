package fr.eseo.greenit.nopattern.controleur;

import fr.eseo.greenit.nopattern.model.ArbreConifere;
import fr.eseo.greenit.nopattern.model.ArbreFeuillus;
import fr.eseo.greenit.nopattern.model.EEtatFeuille;
import fr.eseo.greenit.nopattern.model.EEtatPousse;
import fr.eseo.greenit.nopattern.model.EGenreArbre;
import fr.eseo.greenit.nopattern.vue.VueConifere;
import fr.eseo.greenit.nopattern.vue.VueFeuillus;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;


public class PanneauJardin extends JPanel {
  /**
   *
   */
  private static final long serialVersionUID = 1L;

  public PanneauJardin(int largeur, int hauteur) {
    this.setPreferredSize(new Dimension(largeur, hauteur));
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2D = (Graphics2D) g.create();
    for (int i = 0; i < 100; i++) {
      VueFeuillus f = new VueFeuillus(new ArbreFeuillus(EGenreArbre.CHENE, i * 10 + 50, i * 10 + 50, EEtatFeuille.VERT), 50, 50);
      f.affiche(g2D);
    }
    for (int i = 0; i < 100; i++) {
      VueConifere f = new VueConifere(new ArbreConifere(EGenreArbre.CHENE, i * 10 + 50, i * 10 + 50, EEtatPousse.BUISSON, EEtatFeuille.VERT), 50, 50);
      f.affiche(g2D);
    }
    g2D.dispose();
  }

  public void openImage(BufferedImage image) {
    getGraphics().drawImage(image, 0, 0, this);
  }
}
