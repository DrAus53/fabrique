package src.fr.eseo.greenit.nopattern.model;

public class ArbreFeuillus {
	EGenreArbre genre;
	int age;
	int hauteur;
	
  public ArbreFeuillus(EGenreArbre genre, int age, int hauteur, EEtatFeuille etatFeuilles) {
    this.genre=genre;
    this.age=age;
    this.hauteur=hauteur;
    this.etatFeuilles = etatFeuilles;
  }

  private EEtatFeuille etatFeuilles;

  public EEtatFeuille getEtatFeuilles() {
    return etatFeuilles;
  }

  public void setEtatFeuilles(EEtatFeuille etatFeuilles) {
    this.etatFeuilles = etatFeuilles;
  }
}
