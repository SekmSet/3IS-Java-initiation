package exercices;
/*
    Ecrire un programme qui lit trois entiers pour les afficher ensuite dans un ordre croissant.
*/

import java.util.Scanner;

public class exo_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Première nombre :");
        int nbr1 = scanner.nextInt();
        System.out.println("Deuxième nombre :");
        int nbr2 = scanner.nextInt();
        System.out.println("Troisième nombre :");
        int nbr3 = scanner.nextInt();

        int[] array = {nbr1, nbr2, nbr3};
        int[] arrayOrderer = {};

        int isOrder = 0;
        int round = 0;

        System.out.println(arrayOrderer.length);
        while (isOrder != 1) {

            System.out.println(round);

            if (array[round] < array[round + 1]) {
                arrayOrderer[round] = array[round];
            } else {
                arrayOrderer[round+1] = array[round];
            }

            if (round >= array.length) {
                round = 0;
            } else {
                round++;
            }

            if (round == 3) {
                isOrder = 1;
            }
        }

        for(int i = 0; i < arrayOrderer.length; i++) {
            System.out.println(arrayOrderer[i]);
        }
    }
}

