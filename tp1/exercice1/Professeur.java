package exercice1;

import java.util.ArrayList;
import java.util.Scanner;

public class Professeur {
    private String identifiant;
    private String nom;
    private String prenom;
    private String numeroSS;
    private int anciennete;
    private int salaire;

    public Professeur() {
    }

    public Professeur(String identifiant, String nom, String prenom, String numeroSS, int anciennete) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.numeroSS = numeroSS;
        this.anciennete = anciennete;
    }

    public static void main(String[] args) {

    }

    public String getIdentifiant() {
        return identifiant;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNumeroSS() {
        return numeroSS;
    }

    public int getAnciennete() {
        return anciennete;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNumeroSS(String numeroSS) {
        this.numeroSS = numeroSS;
    }

    public void setAnciennete(int anciennete) {
        this.anciennete = anciennete;
    }

    public void setSalaire(int salaire) {
        this.salaire = this.anciennete * 50 + 1600;
    }

    public ArrayList<Professeur> registerProfesseur () {
        ArrayList<Professeur> listeProfesseur = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String id, nom, prenom, ss;
        int anciennete;

        for(int i = 0; i < 2; i++) {
            System.out.println("Identifiant du professeur " + i);
            id = scanner.next();

            System.out.println("Nom du professeur " + i);
            nom = scanner.next();

            System.out.println("Prenom du professeur " + i);
            prenom = scanner.next();

            System.out.println("Numéro de sécurité sociale du professeur " + i);
            ss = scanner.next();

            System.out.println("Ancienneté du professeur " + i);
            anciennete = scanner.nextInt();

            Professeur professeur = new Professeur(id, nom, prenom, ss, anciennete);
            listeProfesseur.add(professeur);
        }

        return listeProfesseur;
    }

    public void compare(Professeur prof) {
        if(this.nom.compareTo(prof.getNom()) == 0) {
            System.out.println("Egalité");
        } else if (this.nom.compareTo(prof.getNom()) > 0){
            System.out.println("prof 1");
        } else {
            System.out.println("prof 2");
        }
    }
}
