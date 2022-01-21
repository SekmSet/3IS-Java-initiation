package exercices.Model;

import java.time.LocalDate;

public class HistoriqueVirement {

    private String nomBeneficiaire, montant;
    private LocalDate dateVirement;
    private String nomCreancier;


    public HistoriqueVirement(Client user, String nomBeneficiaire, String montant, LocalDate dateVirement) {
        this.nomCreancier = user.getNom();
        this.nomBeneficiaire = nomBeneficiaire;
        this.montant = montant;
        this.dateVirement = dateVirement;
    }

    @Override
    public String toString() {
        return "<br/> Béneficiaire:" + nomBeneficiaire + ", <br/>" +
                "montant:" + montant + " €" + ", <br/>" +
                "date du virement:" + dateVirement + ", <br/>" +
                "Créancier:" + nomCreancier + "<br/>" +
                "<br/> __________<br/>";
    }

    public String getNomCreancier() {
        return nomCreancier;
    }

    public void setNomCreancier(String nomCreancier) {
        this.nomCreancier = nomCreancier;
    }

    public String getNomBeneficiaire() {
        return nomBeneficiaire;
    }

    public void setNomBeneficiaire(String nomBeneficiaire) {
        this.nomBeneficiaire = nomBeneficiaire;
    }

    public String getMontant() {
        return montant;
    }

    public void setMontant(String montant) {
        this.montant = montant;
    }

    public LocalDate getDateVirement() {
        return dateVirement;
    }

    public void setDateVirement(LocalDate dateVirement) {
        this.dateVirement = dateVirement;
    }
}


