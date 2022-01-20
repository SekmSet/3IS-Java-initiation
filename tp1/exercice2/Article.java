package exercice2;

import java.util.Objects;

public class Article {
    long reference; // un numéro qui caractérise l’article de manière unique
    String intitule; // la description de l’article sous forme de texte
    float prixHT; // le prix unitaire hors taxes de l’article
    int quantiteEnStock; // le nombre d’unités de l’article
    double taxes = 5.5;

    public Article() {}

    public Article(long reference, String intitule, float prixHT) {
        this.reference = reference;
        this.intitule = intitule;
        this.prixHT = prixHT;
    }

    public Article(long reference, String intitule, float prixHT, int quantiteEnStock) {
        this.reference = reference;
        this.intitule = intitule;
        this.prixHT = prixHT;
        this.quantiteEnStock = quantiteEnStock;
    }

    public long getReference() {
        return reference;
    }

    public String getIntitule() {
        return intitule;
    }

    public int getQuantiteEnStock() {
        return quantiteEnStock;
    }

    // méthode pour augmenter la quantité disponible de l’article
    public void approvisionner(int nombreUnites) {
        this.quantiteEnStock += nombreUnites;
    }

    // cette méthode enregistre la vente d’un certain nombre d’unités de l’article,
    // dont il faut donc diminuer en conséquence la quantité disponible en stock.
    public boolean vendre(int nombreUnites) {
        if (nombreUnites > this.quantiteEnStock) {
            return false;
        }

        this.quantiteEnStock -= nombreUnites;
        return true;
    }

    // cette méthode calcule et renvoie le prix HT de l’article
    public float prixHT() {
        return this.prixHT;
    }

    // cette méthode calcule et renvoie le prix TTC de l’article
    public float prixTTC() {
        return (float) (this.prixHT * (1 + this.taxes/100));
    }

    // chaîne de caractères exprimant la référence, l’intitulé et le prix de l’article.
    public String toString() {
        return "Reference : " + this.reference + " Intitulé : " + this.intitule + " Prix HT : " + this.prixHT();
    }

    public boolean equals(Article unArticle) {
       if (Objects.deepEquals(unArticle, this)) {
            return true;
        } else {
            return false;
        }
    }
}
