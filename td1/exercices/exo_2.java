package exercices;

/*
    Calculer la taxe sur le chiffre d'affaire (CA) sachant qu'elle est de :
    10% si le CA < 5000€
    20% si le CA >=5000€
*/
import java.util.Scanner;

class Taxes {
    public static void main(String[] args) {
        System.out.println("Quel est votre CA ?");
        Scanner scanner = new Scanner(System.in);
        int CA = scanner.nextInt();

        if (CA < 5000) {
            System.out.println("La taxe pour un CA < 5000 est de 10 % : " + calculeTaxe(CA, 10));
        } else {
            System.out.println("La taxe pour un CA >= 5000 est de 20 % : " + calculeTaxe(CA, 20));
        }
    }

    private static int calculeTaxe (int CA, int taxe) {
        return CA + (CA * taxe / 100);
    }
}