package exercices;
/*
    Supposons que l'on veuille demander à l'utilisateur de choisir
    dans un menu une des 3 possibilités offertes.
*/

import java.util.Scanner;

class Choose {
    public static void main(String[] args) {
        System.out.println("Choisir une possibilité : ");
        System.out.println("1 : …");
        System.out.println("2 : …");
        System.out.println("3 : …");

        Scanner scanner = new Scanner(System.in);
        String choix = scanner.nextLine();
        switch (choix) {
            case "1" -> System.out.println("Vous avez choisi la possibilité 1.");
            case "2" -> System.out.println("Vous avez choisi la possibilité 2.");
            case "3" -> System.out.println("Vous avez choisi la possibilité 3.");
            default -> System.err.println(choix + " n'est pas une possibilité.");
        }
    }
}