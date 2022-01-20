package exercices;
/*
Ecrire un programme qui lit un caractère et détermine s'il fait partie des alphabets ou non.
Et s'il l'est, dire en plus s’il est une minuscule ou une majuscule.
*/

import java.util.Scanner;

public class exo_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Première lettre entre a(A) et z(Z)");
        String letter = scanner.nextLine();

        String[] alphabetique = {
                "a",
                "b",
                "c",
                "d",
                "e",
                "f",
                "g",
                "h",
                "i",
                "j",
                "k",
                "l",
                "m",
                "n",
                "o",
                "p",
                "q",
                "r",
                "s",
                "t",
                "u",
                "v",
                "w",
                "x",
                "y",
                "z",
        };

        for (int i = 0; i < alphabetique.length; i++) {
            if (alphabetique[i].equals(letter) ) {
               System.out.println("La lettre est dans l'alaphabet et est en minuscule");
            } else if (alphabetique[i].toUpperCase().equals(letter) ) {
                System.out.println("La lettre est dans l'alaphabet et est en majuscule");
            } else {
                System.out.println("La lettre n'est pas dans l'alaphabet.");
                return;
            }
        }
    }
}
