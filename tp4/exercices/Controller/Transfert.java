/*
 * Created by JFormDesigner on Thu Jan 20 16:00:25 CET 2022
 */

package exercices.Controller;

import exercices.Model.Client;
import exercices.Model.HistoriqueVirement;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author Priscilla Joly
 */
public class Transfert extends JFrame {
    private final LocalDate dateNow = LocalDate.now();
    private final String colorRed = "#CD1818";
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1;
    private JLabel label3;
    private JTextField textField2;
    private JLabel label4;
    private JTextField textField3;
    private JLabel label_err;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    private Client client;
    private ArrayList<Client> liste;


    public Transfert(Client client, ArrayList<Client> liste) {
        this.client = client;
        this.liste = liste;
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        label2 = new JLabel();
        textField1 = new JTextField();
        label3 = new JLabel();
        textField2 = new JTextField();
        label4 = new JLabel();
        textField3 = new JTextField();
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
                        "[150,fill]",
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
                        "[]"));

        //---- label1 ----
        if (this.client != null) {
            label1.setText(this.client.getBanque().getNom());
        }

        label1.setFont(label1.getFont().deriveFont(label1.getFont().getStyle() | Font.BOLD, label1.getFont().getSize() + 10f));
        contentPane.add(label1, "cell 0 0 2 1");

        //---- label2 ----
        label2.setText("Nom du compte \u00e0 d\u00e9biter");
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getStyle() | Font.BOLD));
        contentPane.add(label2, "cell 1 2");
        contentPane.add(textField1, "cell 3 2");

        //---- label3 ----
        label3.setText("Nom du compte b\u00e9n\u00e9ficiaire");
        label3.setFont(label3.getFont().deriveFont(label3.getFont().getStyle() | Font.BOLD));
        contentPane.add(label3, "cell 1 4");
        contentPane.add(textField2, "cell 3 4");

        //---- label4 ----
        label4.setText("Montant \u00e0 transferet");
        label4.setFont(label4.getFont().deriveFont(label4.getFont().getStyle() | Font.BOLD));
        contentPane.add(label4, "cell 1 6");
        contentPane.add(textField3, "cell 3 6");
        contentPane.add(label_err, "cell 1 8 3 1");

        //---- button1 ----
        button1.setText("Envoyer");
        button1.addActionListener(e -> valideTransfert(e));
        contentPane.add(button1, "cell 1 9 3 1");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    private void valideTransfert(ActionEvent e) {
        String nomCreancier = textField1.getText();
        String nomBeneficiaire = textField2.getText();
        String montant = textField3.getText();
        int convertStringToInt = Integer.parseInt(montant);
        Client isExistBenef = getClient(nomBeneficiaire);
        Client isExistCreancier = getClient(nomCreancier);

        if (isExistBenef == null || isExistCreancier == null) {
            label_err.setForeground(Color.decode(this.colorRed));
            label_err.setText("Déstinataire invalid");
            return;
        }

        if (-client.getMontant() <= (this.client.getSolde() - convertStringToInt) && (-client.getMontant() <= (this.client.getSolde() - convertStringToInt + 3))) {
            client.setSolde(convertStringToInt, "transfer");
            isExistBenef.setSolde(convertStringToInt, "depot");
            Home.transfert.setVisible(false);

            HistoriqueVirement historiqueVir = new HistoriqueVirement(isExistCreancier, nomBeneficiaire, montant, dateNow);
            Home.listeHistoriqueVirement.add(historiqueVir);

        } else {
            label_err.setForeground(Color.decode(this.colorRed));
            label_err.setText("Vous ne pouvez effectuer un versement de " + convertStringToInt + " euros.");
        }
    }

    private Client getClient(String nom) {
        for (Client client : this.liste) {
            if (client.getNom().equals(nom)) {
                return client;
            }
        }

        return null;
    }
}
