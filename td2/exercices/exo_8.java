package exercices;
/*
Ecrire un programme qui lit une fraction au format a/b
où a et b sont deux entiers, et donne son équivalent décimal avec une précision de quatre chiffres après la virgule.
Ex: si l'utilisateur entre 3/2, le programme doit afficher: 3/2 = 1.5000
*/

import java.util.Scanner;

public class exo_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Première fraction a/b :");
        String fraction = scanner.nextLine();

        double a;
        double b;

        String[] array = fraction.split("/",-1);
        a = Double.parseDouble(array[0]);
        b = Double.parseDouble(array[1]);

        double division = a/b;

        System.out.println(fraction + " : "+ Math.round(division * 100.00) / 100.00);
    }
}
