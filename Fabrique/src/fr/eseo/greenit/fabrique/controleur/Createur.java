package fr.eseo.greenit.fabrique.controleur;

import fr.eseo.greenit.fabrique.model.Arbre;
import fr.eseo.greenit.fabrique.model.ArbreConifere;
import fr.eseo.greenit.fabrique.model.ArbreFeuillus;
import fr.eseo.greenit.fabrique.model.ArbreFruitier;
import fr.eseo.greenit.fabrique.model.EGenreArbre;

public class Createur {

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
		return new ArbreConifere(EGenreArbre.CEDRE, 100, 200, null);
	}

	public ArbreFeuillus creerFeuillu() {
		return new ArbreFeuillus(EGenreArbre.CHENE, 100, 50, null);
	}

	public ArbreFruitier creerFruitier() {
		return new ArbreFruitier(EGenreArbre.COCOTIER, 50, 100, null, null);
	}
	
}