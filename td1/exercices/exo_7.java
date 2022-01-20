package exercices;
/*
    Calculer le périmètre d’un cercle
*/
import java.util.Scanner;

class Perimetre {
    public static void main(String[] args) {
        System.out.println("Quel est le périmètre du cercle ?");
        Scanner scanner = new Scanner(System.in);
        double rayon;

        do {
            System.out.println("Le nombre doit être positif et supérieur à 0.");
            rayon = scanner.nextDouble();
        } while (rayon <= 0);

        double perimetreCercle = rayon * 2 * Math.PI;
        System.out.println("Périmètre du cercle : " + perimetreCercle);
    }
}