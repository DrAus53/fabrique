package fr.eseo.greenit.fabrique.controleur;

import fr.eseo.greenit.fabrique.vue.VueArbre;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;


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
		
		for(VueArbre i : this.vueArbres){
			if (i != null){
				i.affiche(g2D);	
			}

		}	
	g2D.dispose();
	}
	
	public void openImage(BufferedImage image) {
		getGraphics().drawImage(image, 0, 0, this);		
	}
}
