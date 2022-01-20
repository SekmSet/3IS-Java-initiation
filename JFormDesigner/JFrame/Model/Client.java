package JFrame.Model;

public class Client {
    private String nom, prenom;

    public Client() {
    }

    public Client(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }


    public static void main(String[] args) {

    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
