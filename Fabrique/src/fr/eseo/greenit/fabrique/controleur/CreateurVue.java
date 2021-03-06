package fr.eseo.greenit.fabrique.controleur;

import fr.eseo.greenit.fabrique.model.Arbre;
import fr.eseo.greenit.fabrique.vue.VueArbre;
import fr.eseo.greenit.fabrique.vue.VueConifere;
import fr.eseo.greenit.fabrique.vue.VueFeuillus;

public class CreateurVue {

  public VueArbre creerVue(Class<? extends VueArbre> classe, Arbre arbre) {

    String nomClasse = classe.getSimpleName();
    VueArbre vueArbre = null;
    switch (nomClasse) {
      case "VueConifere":
        vueArbre = creerConifere(arbre);
        break;
      case "VueFeuillus":
        vueArbre = creerFeuillu(arbre);
        break;
    }
    return vueArbre;
  }

  public VueConifere creerConifere(Arbre arbre) {
    return new VueConifere(arbre, 0, 0);
  }

  public VueFeuillus creerFeuillu(Arbre arbre) {
    return new VueFeuillus(arbre, 50, 50);
  }

}