package fr.eseo.greenit.fabrique.controleur;

import java.awt.CheckboxGroup;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Jardin extends JFrame  {
	JComboBox arbre1;
	JTextArea arbre2;
	JComboBox arbre3;
	public Jardin(){
		buildJPanel();//On initialise notre fenêtre
	}

	public JFrame buildJPanel(){
		JFrame.setDefaultLookAndFeelDecorated(true);
	    JFrame frame = new JFrame("JCheckBox Test");
	    frame.setPreferredSize(new Dimension(500,500));
	    frame.setLayout(new FlowLayout());
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
	    arbre1 = new JComboBox();
	    arbre1.setPreferredSize(new Dimension(100,30));
	    
	    arbre1.addItem("Test");
	    
	    arbre2 = new JTextArea("Taille");
	    arbre2.setPreferredSize(new Dimension(100,30));
	    
	    arbre3 = new JComboBox();
	    arbre3.setPreferredSize(new Dimension(100,30));
	    JButton boutonvalider = new JButton("Valider");
	    
	    boutonvalider.addActionListener(new ActionValider());
	    
	    frame.add(arbre1);
	    frame.add(arbre2);
	    frame.add(arbre3);
	    frame.add(boutonvalider);
	    frame.pack();
	    
	    
	    frame.setVisible(true);
	    return frame;
	    
		}
		
	    
	    
	    
	    public static void main(String [] args) {
	    	Jardin jardin = new Jardin();
	    }

	
}
