package exercices;
/*
Ecrire un programme qui permet de comparer deux entiers a et b,
et d'afficher selon le cas l'un des messages suivants: a=b, a>b ou a<b.
*/

import java.util.Scanner;

public class exo_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Première nombre :");
        double nbr1 = scanner.nextDouble();
        System.out.println("Première nombre :");
        double nbr2 = scanner.nextDouble();

        if (nbr1 == nbr2) {
            System.out.println(nbr2 + " = " + nbr1);
        } else if (nbr1 < nbr2) {
            System.out.println(nbr2 + " > " + nbr1);
        } else {
            System.out.println(nbr2 + " < " + nbr1);

        }
    }
}
