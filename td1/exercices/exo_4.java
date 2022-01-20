package exercices;
/*
    Vérifier si un agent a droit de bénéficier du crédit de logement ou non selon ses années d’ancienneté et sa note d’appréciation :
    - Quand l’ancienneté est inférieur à 5 :
    – Si ancienneté = 4 et note >=16
     ou  ancienneté = 3 et note >=18
     L’agent a le droit de bénéficier du crédit.
    – Sinon : L’agent n’a pas le droit de bénéficier du crédit.

    - Quand l’ancienneté >= 5 :
    – Si note >= 13 : L’agent a le droit de bénéficier du crédit.
    – Sinon : L’agent n’a pas le droit de bénéficier du crédit.
*/

import java.util.Scanner;

class Conditions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anciennete;
        int note;

        do  {
            System.out.println("La note et/ou l'ancienneté doit être supérieure à 0.");

            System.out.println("Quel est votre ancienneté ?");
            anciennete = scanner.nextInt();

            System.out.println("Quelle est votre note ?");
            note = scanner.nextInt();
        } while(anciennete <= 0 || note <= 0);


//        if (anciennete < 5) {
//            if (note >= 18 && anciennete == 3 || note >= 16 && anciennete == 4) {
//                System.out.println("L’agent a le droit de bénéficier du crédit.");
//            } else {
//                System.out.println("L’agent n'a pas le droit de bénéficier du crédit.");
//            }
//        } else if (note >= 13) {
//            System.out.println("L’agent a le droit de bénéficier du crédit.");
//        } else {
//            System.out.println("L’agent n'a pas le droit de bénéficier du crédit.");
//        }

        if(
                (note >= 18 && anciennete == 3) ||
                (note >= 16 && anciennete == 4) ||
                (note >= 13 && anciennete >= 5)
        ) {
            System.out.println("L’agent a le droit de bénéficier du crédit.");
        } else {
            System.out.println("L’agent n'a pas le droit de bénéficier du crédit.");
        }
    }
}