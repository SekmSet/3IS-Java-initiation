/*
 * Created by JFormDesigner on Thu Jan 20 10:17:49 CET 2022
 */

package exercices.Controller;

import exercices.Model.Client;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

/**
 * @author Priscilla Joly
 */
public class Depot extends JFrame {
    private final String colorGreen = "#1F6A20";
    private final String colorRed = "#CD1818";
    private final String colorOrange = "#EA5C2B";
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel label2;
    private JLabel label4;
    private JLabel label3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private JTextField textField1;
    private JLabel label_err;
    private JButton button1;
    private Client nom;
    private ArrayList<Client> liste;
    private int solde;

    public Depot() {
        initComponents();
    }

    public Depot(Client nom, ArrayList<Client> liste) {
        this.nom = nom;
        this.liste = liste;
        this.solde = nom.getSolde();
        initComponents();
    }

    public static void main(String[] args) {
        new Depot();
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
                        "[fill]" +
                        "[76,fill]",
                // rows
                "[]" +
                        "[]" +
                        "[]" +
                        "[]" +
                        "[]" +
                        "[]" +
                        "[]"));

        //---- label1 ----
        label1.setText("D\u00e9p\u00f4t");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getStyle() | Font.BOLD, label1.getFont().getSize() + 10f));
        contentPane.add(label1, "cell 2 0 3 1");

        //---- label2 ----
        label2.setText("Mon solde");
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getStyle() | Font.BOLD));
        contentPane.add(label2, "cell 0 2 2 1");
        contentPane.add(label4, "cell 3 2 2 1");

        //---- label3 ----
        label3.setText("Montant du d\u00e9p\u00f4t");
        label3.setFont(label3.getFont().deriveFont(label3.getFont().getStyle() | Font.BOLD));
        contentPane.add(label3, "cell 0 4 2 1");
        contentPane.add(textField1, "cell 3 4 2 1");
        contentPane.add(label_err, "cell 0 5 5 1");

        //---- button1 ----
        button1.setText("Valider");
        button1.addActionListener(e -> valideDepot(e));
        contentPane.add(button1, "cell 0 6 5 1");

        label4.setText(String.valueOf(this.solde));
        if (this.solde < 0) {
            label4.setForeground(Color.decode(this.colorRed));
        } else if (this.solde > 0) {
            label4.setForeground(Color.decode(this.colorGreen));
        } else {
            label4.setForeground(Color.decode(this.colorOrange));
        }

        pack();
        setLocationRelativeTo(getOwner());
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

    private void valideDepot(ActionEvent e) {
        String montant = textField1.getText();
        int convertStringToInt = Integer.parseInt(montant);

        if (nom.getMaxDepot() >= convertStringToInt) {
            this.nom.setSolde(convertStringToInt, "depot");
            nom.setNbrTransactions(nom.getNbrTransactions());
            Home.depot.setVisible(false);
        } else {
            label_err.setForeground(Color.decode(this.colorRed));
            label_err.setText("Le d??p??t ne peux pas ??tre effectu??");
        }

    }
}
