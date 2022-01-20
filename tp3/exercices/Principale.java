package exercices;

import java.util.ArrayList;
import java.util.Scanner;

public class Principale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String reponse;

        Salarie salarie = new Salarie();
        ArrayList<Salarie> listeSalarie = new ArrayList<>();

        do {
            System.out.println("-------------------------------------------");
            System.out.println("Choisir une option : ");
            System.out.println("0 : Quitter le programme");
            System.out.println("1 : Créer un nouveau salarié");
            System.out.println("2 : Modifier les informations d'un salarié");
            System.out.println("3 : Supprimer un salarié");
            System.out.println("4 : Afficher un salarié");
            System.out.println("-------------------------------------------");
            reponse = scanner.next();

            switch (reponse) {
                case "1" :
                    listeSalarie = salarie.create(listeSalarie);
                    break;
                case "2" :
                    System.out.println("Nom du salarié : ");
                    String nom = scanner.next();

                    System.out.println("Valeur a modifier (categorie, nom, prenom, téléphone, date de naissance, date embauche, salaire, production*, ca**) : ");
                    System.out.println("* uniquement pour les salarié de production.");
                    System.out.println("** uniquement pour les salarié de vente.");
                    String champs = scanner.next();

                    salarie.update(listeSalarie, nom, champs);
                    break;
                case "3" :
                    System.out.println("Nom du salarié : ");
                    listeSalarie = salarie.delete(listeSalarie,  scanner.next());
                    System.err.println("Le salarié a été supprimé.");

                    break;
                case "4" :
                    System.out.println("Nom du salarié : ");
                    Salarie resultAffiche = salarie.find(listeSalarie, scanner.next());

                    if (resultAffiche != null) {
                        resultAffiche.afficher();
                    } else {
                        System.err.println("Pas de salarié trouvé.");
                    }

                    break;
                default :
                    System.out.println("La demande n'a pas été comprise. Veuillez re-essayer !");
            }
        } while (!reponse.equals("0"));
    }
}
