package exercices;
/*
Ecrire un programme qui lit un entier
puis affiche tous les nombres premiers qui lui sont inférieurs.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class exo_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisir un nombre inférieur à 100 et qui se termine par 0 : ");
        int num = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<>();

        for(int i = 1; i <= num; i++) {
            int calc = num % i;
            if(calc == 0) {
                array.add(calc);
            }
        }
    }
}
