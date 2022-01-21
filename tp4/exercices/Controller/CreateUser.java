/*
 * Created by JFormDesigner on Thu Jan 20 09:26:22 CET 2022
 */

package exercices.Controller;

import java.awt.*;

import exercices.Model.Bank;
import exercices.Model.Client;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

/**
 * @author Priscilla Joly
 */
public class CreateUser extends JFrame {
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel label7;
    private JLabel label3;
    private JTextField textField1;
    private JLabel label2;
    private JTextField textField2;
    private JLabel label4;
    private JTextField textField3;
    private JLabel label5;
    private JTextField textField4;
    private JLabel label6;
    private JTextField textField5;
    private JLabel label8;
    private JLabel label_error;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private ArrayList<Bank> listeBanques;
    private String colorGreen = "#1F6A20";
    private String colorRed = "#CD1818";

    public static void main(String[] args) {
        new CreateUser();
    }

    public CreateUser() {
        initComponents();
    }

    public CreateUser(ArrayList<Bank> listeBanques) {
        this.listeBanques = listeBanques;
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        label7 = new JLabel();
        label3 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        textField2 = new JTextField();
        label4 = new JLabel();
        textField3 = new JTextField();
        label5 = new JLabel();
        textField4 = new JTextField();
        label6 = new JLabel();
        textField5 = new JTextField();
        label8 = new JLabel();
        label_error = new JLabel();
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[69,fill]" +
            "[178,fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //---- label1 ----
        label1.setFont(label1.getFont().deriveFont(Font.BOLD, label1.getFont().getSize() + 10f));
        contentPane.add(label1, "cell 0 0 6 1");

        //---- label7 ----
        label7.setText("Cr\u00e9er un nouveau client");
        label7.setFont(label7.getFont().deriveFont(label7.getFont().getStyle() | Font.BOLD, label7.getFont().getSize() + 11f));
        contentPane.add(label7, "cell 1 1 4 1");

        //---- label3 ----
        label3.setText("Nom");
        label3.setFont(label3.getFont().deriveFont(label3.getFont().getStyle() | Font.BOLD));
        contentPane.add(label3, "cell 3 3");
        contentPane.add(textField1, "cell 4 3 2 1");

        //---- label2 ----
        label2.setText("Pr\u00e9nom");
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getStyle() | Font.BOLD));
        contentPane.add(label2, "cell 3 4");
        contentPane.add(textField2, "cell 4 4 2 1");

        //---- label4 ----
        label4.setText("D\u00e9couvert autoris\u00e9");
        label4.setFont(label4.getFont().deriveFont(label4.getFont().getStyle() | Font.BOLD));
        contentPane.add(label4, "cell 3 5");
        contentPane.add(textField3, "cell 4 5 2 1");

        //---- label5 ----
        label5.setText("D\u00e9p\u00f4t max.");
        label5.setFont(label5.getFont().deriveFont(label5.getFont().getStyle() | Font.BOLD));
        contentPane.add(label5, "cell 3 7");
        contentPane.add(textField4, "cell 4 7 2 1");

        //---- label6 ----
        label6.setText("Banque*");
        label6.setFont(label6.getFont().deriveFont(label6.getFont().getStyle() | Font.BOLD));
        contentPane.add(label6, "cell 3 9");
        contentPane.add(textField5, "cell 4 9 2 1");

        //---- label8 ----
        label8.setText("* Choix de la banque : C.I.C, Philippot Bank, Cr\u00e9dit Mutuel, Soci\u00e9t\u00e9 G\u00e9n\u00e9rale");
        label8.setFont(label8.getFont().deriveFont(Font.BOLD|Font.ITALIC));
        contentPane.add(label8, "cell 0 11 6 1");
        contentPane.add(label_error, "cell 3 13 3 1");

        //---- button1 ----
        button1.setText("Envoyer");
        button1.addActionListener(e -> createClient(e));
        contentPane.add(button1, "cell 3 14 3 1");

        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    private void createClient(ActionEvent e) {
        String nom = textField1.getText();
        String prenom = textField2.getText();
        String montant = textField3.getText();
        String depotMax = textField4.getText();
        String nomBanque = textField5.getText();

        if (nom.equals(" ") && prenom.equals(" ") && montant.equals(" ") && nomBanque.equals(" ")) {
            label_error.setForeground(Color.decode(this.colorRed));
            label_error.setText("Impossible de créer un nouveau client !");
            return;
        }

        Bank isExistBank = getBankByNom(nomBanque);

        if (isExistBank == null) {
            label_error.setForeground(Color.decode(this.colorRed));
            label_error.setText("Impossible de créer un nouveau client !");
        } else {
            Client client = new Client(
                    nom,
                    prenom,
                    Integer.parseInt(montant),
                    Integer.parseInt(depotMax),
                    isExistBank
            );

            Home.listeClient.add(client);

            label_error.setForeground(Color.decode(this.colorGreen));
            label_error.setText("Création d'un nouveau client effectué");
        }
    }

    private Bank getBankByNom(String nom) {
        for (Bank banque : this.listeBanques) {
            if(banque.getNom().equals(nom)){
                return banque;
            }
        }

        return null;
    }
}
