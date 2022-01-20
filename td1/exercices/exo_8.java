package exercices;
/*
    Ecrire un algorithme saisissant le prix "TTC" d'une marchandise
    et affichant le prix "Hors Taxe" sachant que cet article a une T.V.A. de 18,6%
*/
import java.util.Scanner;

class PrixHT {
    public static void main(String[] args) {
        System.out.println("Quel est le prix TTC ?");
        Scanner scanner = new Scanner(System.in);
        double prixTTC;

        do {
            System.out.println("Le nombre doit être positif et supérieur à 0.");
            prixTTC = scanner.nextDouble();
        } while (prixTTC <= 0);

        double prixHT = prixTTC * (1-(18.6/100));
        System.out.println("Prix Hors Taxe (T.V.A. de 18,6%) " + prixHT);
    }
}