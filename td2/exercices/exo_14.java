package exercices;
/*
Ecrire un programme qui lit une série d'entiers positifs inférieurs à 100 terminée par 0.
Et qui doit négliger toute entrée strictement supérieure à 100.
Puis calcule et affiche la somme et le max des éléments de cette série.
*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exo_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisir un nombre inférieur à 100 et qui se termine par 0 : ");
        int reponse;
        boolean isAccept = false;

        do {
            reponse = scanner.nextInt();

            if( reponse <= 0) {
                System.out.println("Le nombre choisi doit être supérieur à 0.");
            } else if(reponse > 100) {
                System.out.println("Le nombre choisi doit être inférieur à 100.");
            } else if (!terminateByZero(reponse)) {
                System.out.println("Le nombre choisi doit se terminer par 0.");
            } else {
                isAccept = true;
            }
        } while(!isAccept);

        int somme = calculeSomme(reponse);
        System.out.println("Somme : " + somme);
    }

    private static boolean terminateByZero(int number) {
        String regex = "\\d0";
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(String.valueOf(number));

        return matcher.find();
    }

    private static int calculeSomme(int number) {
        int somme = 0;
        for(int i = 0; i <= number; i++) {
            somme += i;
        }
        return somme;
    }
}
