package fr.eseo.greenit.fabrique.model;

public enum EGenreConifere {
	CYPRES("Cypres", "Conifere"), SAPIN("Sapin", "Conifere"), CEDRE("Cedre", "Conifere"),
	SEQUOIA("Sequoia", "Conifere");

	private String name = "";
	private String arbre = "";

	EGenreConifere(String name, String arbre) {
		this.name = name;
		this.arbre = arbre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArbre() {
		return arbre;
	}

	public void setArbre(String arbre) {
		this.arbre = arbre;
	}
}
