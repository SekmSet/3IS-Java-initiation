package exercice1;

import java.util.Scanner;

public class Etudiant {
    private String identifiant;
    private String nom;
    private String prenom;
    private String numeroSS;
    private int anneeEtude;
    private int fraisInscription;

    public Etudiant() {
    }

    public Etudiant(String identifiant, String nom, String prenom, String numeroSS, int anneeEtude) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.numeroSS = numeroSS;
        this.anneeEtude = anneeEtude;
        setFraisInscription(anneeEtude);
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

    public int getAnneeEtude() {
        return anneeEtude;
    }

    public int getFraisInscription() {
        return fraisInscription;
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

    public void setAnneeEtude(int anneeEtude) {
        this.anneeEtude = anneeEtude;
        setFraisInscription(anneeEtude);
    }

    public void setFraisInscription(int anneeEtude) {
        this.fraisInscription = anneeEtude * 150;
    }
}
