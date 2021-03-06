package fr.eseo.greenit.nopattern.model;

public enum EGenreArbre {
  CYPRES("Cypres", "Conifere"), SAPIN("Sapin", "Conifere"), CEDRE("Cedre", "Conifere"),
  SEQUOIA("Sequoia", "Conifere"), COCOTIER("Cocotier", "Fruitier"), CHENE("Chene", "Feuillus");

  private String name = "";

  private String arbre = "";

  EGenreArbre(String name, String arbre) {
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
