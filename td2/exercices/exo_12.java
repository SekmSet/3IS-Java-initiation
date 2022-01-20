package exercices;
/*

Ecrire un programme qui définit un nombre magique (un nombre secret),
et lit des entiers à l'entrée jusqu'à ce que l'utilisateur trouve ce nombre.
En lui indiquant à chaque fois s'il est en dessus ou au-dessous du nombre magique.
*/

import java.util.Scanner;

public class exo_12 {
    public static void main(String[] args) {
        int random = randomNumber();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est le nombre secret (0-100) ?");
        int reponse;

        do {
            reponse = scanner.nextInt();

            if(random == reponse) {
                System.out.println(reponse + " est le nombre secret. Bravo !");
            } else {
                System.out.println(reponse + " n'est pas le nombre secret. Essaie encore !");
                if(random > reponse) {
                    System.out.println("Indice : le nombre secret est plus grand.");
                } else {
                    System.out.println("Indice : le nombre secret est plus petit.");
                }
            }

        } while (reponse != random);

    }

    private static int randomNumber() {
        int max = 100;
        int min = 0 ;
        return (int) ((Math.random() * (max - min)) + min);
    }
}
