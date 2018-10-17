package fr.eseo.greenit.fabrique.controleur;

import fr.eseo.greenit.fabrique.model.Arbre;
import fr.eseo.greenit.fabrique.model.ArbreConifere;
import fr.eseo.greenit.fabrique.model.ArbreFeuillus;
import fr.eseo.greenit.fabrique.model.ArbreFruitier;

public abstract class CreateurVue {

	public VueArbre creerVue(Class<? extends VueArbre> classe,Arbre arbre) {

		String nomClasse = classe.getName();
		VueArbre vueArbre = null;
		switch (nomClasse) {
		case "VueConifere":
			vueArbre = creerConifere(arbre);
			break;
		case "VueFeuillus":
			vueArbre = creerFeuillu(arbre);
			break;
		case "VueFruitier":
			vueArbre = creerFruitier();
			break;
		}
		return vueArbre;
	}

	public VueConifere creerConifere() {
		return new VueConifere(null, 0, 0, null);
	}

	public VueFeuillus creerFeuillu() {
		return new ArbreFeuillus(null, 0, 0, null);
	}

	public VueFruitier creerFruitier() {
		return new ArbreFruitier(null, 0, 0, null, null);
	}
	
}