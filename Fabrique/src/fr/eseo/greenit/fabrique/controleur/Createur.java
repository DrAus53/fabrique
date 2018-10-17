package fr.eseo.greenit.fabrique.controleur;

import fr.eseo.greenit.fabrique.model.Arbre;
import fr.eseo.greenit.fabrique.model.ArbreConifere;
import fr.eseo.greenit.fabrique.model.ArbreFeuillus;
import fr.eseo.greenit.fabrique.model.ArbreFruitier;

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

	public ArbreConifere creerConifere() {
		return new ArbreConifere(null, 0, 0, null);
	}

	public ArbreFeuillus creerFeuillu() {
		return new ArbreFeuillus(null, 0, 0, null);
	}

	public ArbreFruitier creerFruitier() {
		return new ArbreFruitier(null, 0, 0, null, null);
	}
	
}