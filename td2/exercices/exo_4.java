package exercices;
/*
    Ecrire un programme qui lit en entrée trois entiers
    et affiche leur moyenne avec une précision de deux chiffres après la virgule.
*/

import java.util.Scanner;

public class exo_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chiffre 1 : ");
        double nbr1 = scanner.nextDouble();
        System.out.println("Chiffre 2 : ");
        double nbr2 = scanner.nextDouble();
        System.out.println("Chiffre 3 : ");
        double nbr3 = scanner.nextDouble();

        System.out.println("Moyenne des nombres : " + average(nbr1, nbr2, nbr3));
    }

    private static double average (double num1, double num2, double num3) {
        double sum = (num1 + num2 + num3) / 3;
        return Math.round(sum * 100.00) / 100.00;
    }
}
