/*
 * Created by JFormDesigner on Thu Jan 20 10:17:34 CET 2022
 */

package exercices.View;

import exercices.Model.Client;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

/**
 * @author Priscilla Joly
 */
public class Retrait extends JFrame {

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel label2;
    private JLabel label4;
    private JLabel label3;
    private JTextField textField1;
    private JLabel label_err;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private Client nom;
    private ArrayList<Client> liste;
    private int solde;
    public Retrait() {
        initComponents();
    }


 public Retrait(Client nom, ArrayList<Client> liste) {
     this.nom = nom;
     this.liste = liste;
     this.solde = nom.getSolde();
     initComponents();
    }

    public static void main(String[] args) {
        new Retrait();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        label2 = new JLabel();
        label4 = new JLabel();
        label3 = new JLabel();
        textField1 = new JTextField();
        label_err = new JLabel();
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[78,fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //---- label1 ----
        label1.setText("Retrait");
        contentPane.add(label1, "cell 1 0 3 1");

        //---- label2 ----
        label2.setText("Mon solde");
        contentPane.add(label2, "cell 0 2");
        contentPane.add(label4, "cell 2 2 2 1");

        //---- label3 ----
        label3.setText("Montant du retrait");
        contentPane.add(label3, "cell 0 4");
        contentPane.add(textField1, "cell 2 4 2 1");
        contentPane.add(label_err, "cell 0 5 4 1");

        //---- button1 ----
        button1.setText("Valider");
        button1.addActionListener(e -> valideRetrait(e));
        contentPane.add(button1, "cell 0 6 4 1");
        pack();
        setLocationRelativeTo(getOwner());
//        setVisible(true);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    public Client getNom() {
        return nom;
    }

    public void setNom(Client nom) {
        this.nom = nom;
    }

    public ArrayList<Client> getListe() {
        return liste;
    }

    public void setListe(ArrayList<Client> liste) {
        this.liste = liste;
    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    private void valideRetrait(ActionEvent e) {
        // TODO add your code here
        String montant = textField1.getText();

        int convertStringToInt = Integer.parseInt(montant);

        if(-nom.getMontant() <= (this.solde - convertStringToInt)) {
            this.nom.setSolde(nom.getSolde(), convertStringToInt, "retrait");
            nom.setNbrTransactions(nom.getNbrTransactions());
            label_err.setText("Retrait effectué");
        } else {
            label_err.setText("Retrait impossible");
        }
    }
}
