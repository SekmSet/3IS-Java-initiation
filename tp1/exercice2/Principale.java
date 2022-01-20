package exercice2;

public class Principale {

    public static void main(String[] args) {
        Article article1 = new Article(
                11,
                "Apple - Iphone 13 Pro Rose Gold 64GB. Un nouveau smartphone Apple",
                1000.0f
        );

        Article article2 = new Article(
                12,
                "Evian - eau plate",
                1.5f
        );

        Article article3 = new Article(
                13,
                "Marie - gratin de pâte",
                3.5f
        );

        article1.approvisionner(20);
        System.out.println("Quantité en stock : " + article1.getQuantiteEnStock());
        article1.vendre(10);
        System.out.println("Quantité en stock après une vente de 10 articles : " + article1.getQuantiteEnStock());
        article1.vendre(15);
        System.out.println("Quantité en stock après une vente de 15 articles : " + article1.getQuantiteEnStock());

        System.out.println("Prix HT de l'article : " + article1.prixHT());
        System.out.println("Prix TTC de l'article : " + article1.prixTTC());

        System.out.println("Informations concernant l'article (reference - intitulé - prix HT) : " + article1);

        if(article1.equals(article2)) {
            System.out.println("Référence identitque");
        } else {
            System.out.println("Référence différente");
        }
    }
}
