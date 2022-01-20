package exercice1;

import java.util.ArrayList;

public class Principale {
    public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant();
        etudiant1.setIdentifiant("A904544");
        etudiant1.setNom("SALAMANDER");
        etudiant1.setPrenom("SANDRA");
        etudiant1.setNumeroSS("208371831893");
        etudiant1.setAnneeEtude(2);

        Etudiant etudiant2 = new Etudiant(
                "A409544",
                "JOLY",
                "PRISCILLA",
                "204381831893",
                3
        );

        Professeur professeur = new Professeur();

        ArrayList<Professeur> listeProfesseur = professeur.registerProfesseur();

        compareFraisInscriptionEtudiant(etudiant1, etudiant2);
        System.out.println("-------------------------------------");
        compareEtudiant(etudiant1, etudiant2);
        System.out.println("-------------------------------------");
//        compareProfesseur(listeProfesseur);
        professeur.compare(listeProfesseur.get(1));
    }

    private static void compareFraisInscriptionEtudiant (Etudiant etudiant1, Etudiant etudiant2) {
        System.out.println("Frais d'inscription étudiant 1 : " + etudiant1.getFraisInscription());
        System.out.println("Frais d'inscription étudiant 2 : " + etudiant2.getFraisInscription());
    }

    private static void compareEtudiant (Etudiant etudiant1, Etudiant etudiant2) {
        if(etudiant1.getFraisInscription() > etudiant2.getFraisInscription()) {
            System.out.println("Information de l'étudiant 1 : ");
            System.out.println("Nom de l'étudiant 1 : " + etudiant1.getNom());
            System.out.println("Prenom de l'étudiant 1 : " + etudiant1.getPrenom());
            System.out.println("Numéro de sécurité sociale de l'étudiant 1 : " + etudiant1.getNumeroSS());
            System.out.println("Année d'étude de l'étudiant 1 : " + etudiant1.getAnneeEtude());
        } else {
            System.out.println("Information de l'étudiant 2 : ");
            System.out.println("Nom de l'étudiant 2 : " + etudiant2.getNom());
            System.out.println("Prenom de l'étudiant 2 : " + etudiant2.getPrenom());
            System.out.println("Numéro de sécurité sociale de l'étudiant 2 : " + etudiant2.getNumeroSS());
            System.out.println("Année d'étude de l'étudiant 2 : " + etudiant2.getAnneeEtude());
        }
    }

    private static void compareProfesseur (ArrayList<Professeur> listeProfesseur) {
//        Arrays.sort(listeProfesseur);
//        listeProfesseur.sort(Collections.);
        System.out.println(listeProfesseur.get(0).getNom());
    }
}
