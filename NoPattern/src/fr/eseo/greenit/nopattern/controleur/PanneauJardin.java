package src.fr.eseo.greenit.nopattern.controleur;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import fr.eseo.greenit.*;
import fr.eseo.greenit.fabrique.model.ArbreFeuillus;
import fr.eseo.greenit.fabrique.model.EEtatFeuille;
import fr.eseo.greenit.fabrique.model.EGenreArbre;
import fr.eseo.greenit.fabrique.vue.VueArbre;
import fr.eseo.greenit.fabrique.vue.VueFeuillus;


public class PanneauJardin extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<VueArbre> vueArbres = new ArrayList<VueArbre>();

	
	public PanneauJardin(int largeur, int hauteur){
		this.setPreferredSize(new Dimension(largeur,hauteur));
	}

	public java.util.List<VueArbre> getVueArbre(){
		return this.vueArbres;
	}
	
	
	public void ajouterVueArbre(VueArbre vueArbre){
		this.vueArbres.add(vueArbre);
		this.repaint(); 
	}
	

	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D)g.create();
		for(int i=0;i<1000;i++) {
		VueFeuillus f = new VueFeuillus(new ArbreFeuillus(EGenreArbre.CHENE,i*10+50,i*10+50,EEtatFeuille.VERT),50,50);
		f.affiche(g2D);
		}
		
		g2D.dispose();
	}
	
	public void openImage(BufferedImage image) {
		getGraphics().drawImage(image, 0, 0, this);		
	}
}
