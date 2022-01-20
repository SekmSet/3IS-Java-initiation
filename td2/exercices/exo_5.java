package exercices;
/*

Ecrire un programme qui lit en entrée un caractère alphabétique entre a et y,
 qui peut être soit une majuscule ou une minuscule.
 Et affiche la lettre qui vient juste après lui dans l'ordre alphabétique.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class exo_5 {
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
                if(i == alphabetique.length - 1) {
                    System.out.println(alphabetique[0]);
                } else {
                    System.out.println(alphabetique[i+1]);
                }
            } else if (alphabetique[i].toUpperCase().equals(letter) ) {
                if(i == alphabetique.length - 1) {
                    System.out.println(alphabetique[0].toUpperCase());
                } else {
                    System.out.println(alphabetique[i+1].toUpperCase());
                }
            }
        }
    }
}
