package fr.eseo.greenit.fabrique.controleur;

import fr.eseo.greenit.fabrique.*;

public abstract class Createur {

	public Arbre creerArbre(Class<? extends Arbre> classe) {

		String nomClasse = classe.getName();
		Arbre arbre = null;
		switch (nomClasse) {
		case "Conifere":
			arbre = creerConifere();
			break;
		case "Feuillus":
			arbre = creerFeuillu();
			break;
		case "Fruites":
			arbre = creerFruitier();
			break;
		}
		return arbre;
	}

	public Conifere creerConifere() {
		return new Conifere();
	}

	public Feuillus creerFeuillu() {
		return new Feuillus();
	}

	public Fruites creerFruitier() {
		return new Fruites();
	}
	
}