/*
Ecrire un programme qui permet de lire deux nombres réels,
et d'afficher ensuite leur produit, avec une précision de trois chiffres après la virgule.
*/

package exercices;

import java.text.DecimalFormat;
import java.util.Scanner;

class Add {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nombre 1 :");
        float nbr1 = scanner.nextFloat();
        System.out.println("Nombre 2 :");
        float nbr2 = scanner.nextFloat();

        double sum = nbr1 * nbr2;
        DecimalFormat df = new DecimalFormat("###.###");
        System.out.println("Premier nombre " + nbr1 + ". Deuxième nombre " + nbr2);

        System.out.println(df.format(sum));
        System.out.printf("%.3f", sum);

    }

}