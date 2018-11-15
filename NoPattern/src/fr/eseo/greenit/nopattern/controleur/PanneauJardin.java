package src.fr.eseo.greenit.nopattern.controleur;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import src.fr.eseo.greenit.nopattern.model.ArbreConifere;
import src.fr.eseo.greenit.nopattern.model.ArbreFeuillus;
import src.fr.eseo.greenit.nopattern.model.EEtatFeuille;
import src.fr.eseo.greenit.nopattern.model.EEtatPousse;
import src.fr.eseo.greenit.nopattern.model.EGenreArbre;
import src.fr.eseo.greenit.nopattern.vue.VueConifere;
import src.fr.eseo.greenit.nopattern.vue.VueFeuillus;


public class PanneauJardin extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	
	public PanneauJardin(int largeur, int hauteur){
		this.setPreferredSize(new Dimension(largeur,hauteur));
	}	

	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D)g.create();
		for(int i=0;i<100;i++) {
		VueFeuillus f = new VueFeuillus(new ArbreFeuillus(EGenreArbre.CHENE,i*10+50,i*10+50,EEtatFeuille.VERT),50,50);
		f.affiche(g2D);
		}	
		for(int i=0;i<100;i++) {
			VueConifere f = new VueConifere(new ArbreConifere(EGenreArbre.CHENE,i*10+50,i*10+50,EEtatPousse.BUISSON,EEtatFeuille.VERT),50,50);
			f.affiche(g2D);
			}
		g2D.dispose();
	}
	
	public void openImage(BufferedImage image) {
		getGraphics().drawImage(image, 0, 0, this);		
	}
}
