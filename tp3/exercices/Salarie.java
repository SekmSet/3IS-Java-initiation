package exercices;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Salarie {
    private String  categorie;
    private String  nom;
    private String  prenom;
    private String  telephone;
    private LocalDate dateNaissance;
    private LocalDate  dateEmbauche;
    private double  salaire;
    private int  production;
    private double CA;
    private double prime;

    public Salarie() {
    }

    public Salarie(String categorie, String nom, String prenom, String telephone, LocalDate dateNaissance, LocalDate dateEmbauche, double salaire) {
        this.categorie = categorie;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.dateNaissance = dateNaissance;
        this.dateEmbauche = dateEmbauche;
        this.salaire = salaire;
    }

    public String getCategorie() {
        return categorie;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public LocalDate getDateEmbauche() {
        return dateEmbauche;
    }

    public double getSalaire() {
        return salaire;
    }

    public int getProduction() {
        return production;
    }

    public double getCA() {
        return CA;
    }

    public double getPrime() {
        return prime;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setDateEmbauche(LocalDate dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public void setSalaire(String categorie) {
        if(categorie.equals("vente")) {
            this.salaire = (getCA() * 1.25) + 400;
        } else {
            this.salaire = 4 * getProduction();
        }
    }

    public void setProduction(int production) {
        this.production = production;
    }

    public void setCA(double CA) {
        this.CA = CA;
    }

    public void setPrime(double prime) {
        this.prime = prime;
    }

    public void prime () {
    }

    public ArrayList<Salarie> create (ArrayList<Salarie> listeSalarie) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vous allez créer un nouveau salarié.");
        System.out.println("Merci de renseigner les informations suivantes : ");

        System.out.println("- Categorie (vente ou production)");
        String categorie = scanner.next();

        System.out.println("- Nom");
        String nom = scanner.next();

        System.out.println("- Prénom ");
        String prenom = scanner.next();

        System.out.println("- Téléphone ");
        String telephone = scanner.next();

        System.out.println("- Date de naissance (yyyy-mm-dd)");
        LocalDate dateNaissance = LocalDate.parse(scanner.next());

        System.out.println("- Date d'embauche (yyyy-mm-dd)");
        LocalDate dateEmbauche = LocalDate.parse(scanner.next());

        System.out.println("- Salaire");
        double salaire = scanner.nextDouble();

        Salarie nouveau = new Salarie(categorie, nom, prenom, telephone, dateNaissance, dateEmbauche, salaire);
        listeSalarie.add(nouveau);
        return listeSalarie;
    }

    public void afficher () {
        System.out.println("Information du salarié : ");
        System.out.println("Catégorie : " + this.categorie);
        System.out.println("Nom : " + this.nom);
        System.out.println("Prénom : " + this.prenom);
        System.out.println("Téléphone : " + this.telephone);
        System.out.println("Date de naissance : " + this.dateNaissance);
        System.out.println("Date d'embauche : " + this.dateEmbauche);
    }

    public ArrayList<Salarie> delete (ArrayList<Salarie> listeSalarie, String nom) {
        ArrayList<Salarie> newListeSalarie = new ArrayList<>();

        for (int i = 0; i < listeSalarie.size(); i++) {
            if(!listeSalarie.get(i).getNom().equals(nom)) {
                newListeSalarie.add(listeSalarie.get(i));
            }
        }

        if(listeSalarie.size() == newListeSalarie.size()){
            System.err.println("Pas de salarié supprimé.");
            return listeSalarie;
        }

        return newListeSalarie;
    }

    public void update (ArrayList<Salarie> listeSalarie, String nom, String champs) {
        Scanner scanner = new Scanner(System.in);
        int indexOfSalarie = findIndex(listeSalarie, nom);

        switch (champs) {
            case "categorie" :
                System.out.println("Nouvelle catégorie du salarié ? ");
                String categorie = scanner.next();
                setCategorie(categorie);
                setSalaire(categorie);
                break;
            case "nom" :
                setNom(scanner.next());
                break;
            case "prenom" :
                System.out.println("Quel est le nouveau prénom du salarié ?");
                String nouveauPrenom = scanner.next();
                setPrenom(nouveauPrenom);
                //listeSalarie.get(index).setNom(nouveauPrenom);
                break;
            case "telephone" :
                setTelephone(scanner.next());
                break;
            case "date de naissance" :
                setDateNaissance(LocalDate.parse(scanner.next()));
                break;
            case "date embauche" :
                setDateEmbauche(LocalDate.parse(scanner.next()));
                break;
            case "salaire" :
                setSalaire(this.categorie);
                break;
            case "production" :
                setProduction(scanner.nextInt());
                setSalaire(this.categorie);

                break;
            case "ca" :
                setCA(scanner.nextDouble());
                setSalaire(this.categorie);
                break;
            default :
                System.err.println("La propriété ne peux pas être mise à jour.");
        }

        listeSalarie.set(indexOfSalarie, this);

    }

    public Salarie find (ArrayList<Salarie> listeSalarie, String nom) {
        for (Salarie salarie : listeSalarie) {
            if (salarie.getNom().equals(nom)) {
                return salarie;
            }
        }
        return null;
    }
    public int findIndex (ArrayList<Salarie> listeSalarie, String nom) {
        for (int i = 0, listeSalarieSize = listeSalarie.size(); i < listeSalarieSize; i++) {
            Salarie salarie = listeSalarie.get(i);
            if (salarie.getNom().equals(nom)) {
                return i;
            }
        }
        return 0;
    }
}
