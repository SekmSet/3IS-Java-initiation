package projet.Class;

public class Voiture {
    // Attributs (propriétés, caractéristiques)
    String immatriculation, marque;
    double prix;

    // Principe d'encapsulation
    // Private accessible uniquement dans cette class
    // Public (par défaut) accessible dans la class et dans les autres class
    // Protected
    private String color;

    // Méthodes (fonctions)
    // Constructeur vide qui ne prend pas d'argument
    public Voiture() {
    }

    // Constructeur surchargé
    public Voiture(String immatriculation, String marque, double prix, String color) {
        super(); // facultatif, appel le constructeur de la class mère
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.prix = prix;
        this.color = color;
    }

    public void promotion (double pourcentage) {
        prix = prix * (1 - pourcentage/100);
    }

    // Getter (récupérer) & Setter (modifier)

    public String getImmatriculation() {
        return immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public double getPrix() {
        return prix;
    }

    public String getColor() {
        return color;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
