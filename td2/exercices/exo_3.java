package exercices;

import java.util.Scanner;

/*
Ecrire un programme qui permet de permuter le contenu de deux variables entières en
passant par une troisième variable auxiliaire.
Ceci et en affichant les deux variables avant et après permutation.
 */
public class exo_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chiffre 1 : ");
        int nbr1 = scanner.nextInt();
        System.out.println("Chiffre 2 : ");
        int nbr2 = scanner.nextInt();

        int tmp;

        System.out.println("Variables 1 avant permutation : " + nbr1);
        System.out.println("Variables 2 avant permutation : " + nbr2 );
        System.out.println("-----------------------");

        tmp = nbr1;
        nbr1 = nbr2;
        nbr2 = tmp;

        System.out.println("Variables 1 après permutation : " + nbr1);
        System.out.println("Variables 2 après permutation : " + nbr2 );
    }
}
