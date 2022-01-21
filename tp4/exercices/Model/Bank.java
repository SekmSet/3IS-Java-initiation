package exercices.Model;

public class Bank {
    private int id;
    private String nom;
    private String directeur;
    private String conseiller;
    private String numero;
    private String adresse;
    private String ville;
    private String codePostal;
    private int nbrClient = 0;

    public Bank(
            int id,
            String nom,
            String directeur,
            String conseiller,
            String numero,
            String adresse,
            String ville,
            String codePostal
    ) {

        this.nom = nom;
        this.directeur = directeur;
        this.conseiller = conseiller;
        this.numero = numero;
        this.adresse = adresse;
        this.ville = ville;
        this.codePostal = codePostal;
        this.id = id;

        setId(this.id);
        setNbrClient(this.id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDirecteur() {
        return directeur;
    }

    public void setDirecteur(String directeur) {
        this.directeur = directeur;
    }

    public String getConseiller() {
        return conseiller;
    }

    public void setConseiller(String conseiller) {
        this.conseiller = conseiller;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public int getNbrClient() {
        return nbrClient;
    }

    public void setNbrClient(int nbrClient) {
        this.nbrClient = nbrClient + 1;
    }
}
