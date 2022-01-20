package exercices;
/*
Ecrire un programme qui lit un entier puis détermine s'il est premier ou non.
On rappelle qu'un entier est dit premier s'il a exactement deux diviseurs différents; 1 et lui-même.
Ex:
2, 3, 7, 17, 101 sont tous premiers
et 4, 10, 27 ne le sont pas.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class exo_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisir un nombre : ");
        int reponse = scanner.nextInt();
        isPremier(reponse);
    }

    private static void isPremier(int num) {
       ArrayList<Integer> array = new ArrayList<>();

       for (int i = 1; i <= 10; i++) {
           int calc = num % i;
           if(calc == 0) {
               array.add(calc);
           }
       }

       if(array.size() > 2) {
           System.out.println("Le nombre n'est pas premier");
       } else {
           System.out.println("Le nombre est premier");
       }
    }
}
