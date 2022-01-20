package exercices;
/*
Ecrire un programme qui lit deux entiers est affiche le plus grand d'entre eux.
*/

import java.util.Scanner;

public class exo_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Première nombre R1:");
        double nbr1 = scanner.nextDouble();
        System.out.println("Première nombre R2:");
        double nbr2 = scanner.nextDouble();

        if (nbr1 < nbr2) {
            System.out.println(nbr2);
        } else {
            System.out.println(nbr1);
        }
    }
}
