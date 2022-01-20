package exercices;
/*
    Ecrire un algorithme saisissant 2 variables entières qui calcule et affiche leur moyenne.
*/

import java.util.Scanner;

class Somme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nbr1;
        int nbr2;

        do {
            System.out.println("Quel est le premier nombre ?");
            nbr1 = scanner.nextInt();

            System.out.println("Quel est le deuxieme nombre ?");
            nbr2 = scanner.nextInt();
        } while (nbr1 <= 0 && nbr2 <= 0);

        int sum = nbr1 + nbr2;
        double average = sum / 2.0;

        System.out.println("L'addition des nombres " + nbr1 + " et " + nbr2 + " : " + sum);
        System.out.println("La moyenne des nombres " + nbr1 + " et " + nbr2 + " : " + average);
    }
}