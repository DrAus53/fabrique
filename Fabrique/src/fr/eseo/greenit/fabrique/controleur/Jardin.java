package fr.eseo.greenit.fabrique.controleur;


import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;



public class Jardin extends JFrame {
	private static Jardin fenetreJardin;
	private PanneauJardin panneauJardin;

	public PanneauJardin getPanneauJardin() {
		return panneauJardin;
	}

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
		Jardin jardin = new Jardin();
	}

}
