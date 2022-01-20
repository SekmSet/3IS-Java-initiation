package exercices;
/*
    Calculer la sommes des entiers compris entre 0 et un nombre n saisi au clavier (on suppose que n≥0).
*/
import java.util.Scanner;

class Boucle1 {
    public static void main(String[] args) {
        System.out.println("Choisir un nombre : ");
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        while(num < 0) {
            System.out.println("Le  nombre saisie doit être positif et supérieur ou égale à 0");
            num = scanner.nextInt();
        }

        System.out.println("Somme des nombres de 0 à " + num + " est : " + calculeSum(num));
    }

    private static int calculeSum (int num) {
        int sum = 0;

        int min = 0;
        while(min <= num) {
            sum += min;
            min++;
        }

        //        for (int min = 0; min <= num; min++) {
//            sum += min;
//        }
        return sum;
    }
}