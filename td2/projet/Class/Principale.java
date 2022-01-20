package projet.Class;

import java.util.ArrayList;
import java.util.Scanner;

public class Principale {

    public static void main(String[] args) {
        // Instanciation, on instancie un objet de la classe Voiture
        Voiture voiture1 = new Voiture(
                "AG-703-HX",
                "VOLKSWAGEN",
                40000,
                "Blue shadow"
        );

        // Appel de la fonction promotion() pour les objets voiture1 et voiture2
        voiture1.promotion(10);

        System.out.println("Prix de la voiture 1 : " + voiture1.prix);
        System.out.println("Immatriculation de la voiture 1 : " + voiture1.getImmatriculation());

        ArrayList<Voiture> listeVoiture = new ArrayList();
        String im, m, c;
        double p;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Saisir l'immatriculation de la voiture : " + i);
            im = scanner.nextLine();

            System.out.println("Saisir la marque de la voiture : " + i);
            m = scanner.nextLine();

            System.out.println("Saisir la couleur de la voiture : " + i);
            c = scanner.nextLine();

            System.out.println("Saisir le prix de la voiture : " + i);
            p = scanner.nextDouble();


            Voiture v = new Voiture(im, m, p, c);
            listeVoiture.add(v);
        }
        // Avoir la voiture 1
         System.out.println(listeVoiture.get(0).getPrix());
        //
    }
}
