package fr.eseo.greenit.fabrique.controleur;

import fr.eseo.greenit.fabrique.model.Arbre;
import fr.eseo.greenit.fabrique.model.Conifere;
import fr.eseo.greenit.fabrique.model.Feuillus;
import fr.eseo.greenit.fabrique.model.Fruites;

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
		return new Conifere(null, 0, 0, null, null);
	}

	public Feuillus creerFeuillu() {
		return new Feuillus(null, 0, 0, 0, null);
	}

	public Fruites creerFruitier() {
		return new Fruites(null, 0, 0, 0, null, null, 0, 0);
	}
	
}