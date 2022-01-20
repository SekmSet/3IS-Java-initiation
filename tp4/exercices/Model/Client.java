package exercices.Model;

public class Client {
    private String nom;
    private String prenom;
    private int montant;
    private int solde = 0;
    private int id = 1;
    private int nbrTransactions = 0;
    private int maxDepot;

    public Client(String nom, String prenom, int montant, int maxDepot) {
        this.nom = nom;
        this.prenom = prenom;
        this.montant = montant;
        this.maxDepot = maxDepot;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde, int montant, String action) {
        if (action.equals("retrait")){
            this.solde = solde - montant;
        } else {
            this.solde = solde + montant;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id + 1;
    }

    public int getNbrTransactions() {
        return nbrTransactions;
    }

    public void setNbrTransactions(int nbrTransactions) {
        this.nbrTransactions = nbrTransactions + 1;
    }

    public int getMaxDepot() {
        return maxDepot;
    }

    public void setMaxDepot(int maxDepot) {
        this.maxDepot = maxDepot;
    }
}
