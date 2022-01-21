/*
 * Created by JFormDesigner on Fri Jan 21 15:11:57 CET 2022
 */

package exercices.Controller;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

import exercices.Model.Bank;
import exercices.Model.Client;
import net.miginfocom.swing.*;

/**
 * @author Priscilla Joly
 */
public class BanqueInfo extends JFrame {
    private Client user;
    private ArrayList<Bank> listeBanques;

    public static void main(String[] args) {
        new BanqueInfo();
    }
    public BanqueInfo() {
        initComponents();
    }

    public BanqueInfo(Client user, ArrayList<Bank> listeBanques) {
        this.user = user;
        this.listeBanques = listeBanques;
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        label2 = new JLabel();
        label9 = new JLabel();
        label3 = new JLabel();
        label10 = new JLabel();
        label4 = new JLabel();
        label11 = new JLabel();
        label5 = new JLabel();
        label12 = new JLabel();
        label6 = new JLabel();
        label13 = new JLabel();
        label7 = new JLabel();
        label14 = new JLabel();
        label8 = new JLabel();
        label15 = new JLabel();
        label16 = new JLabel();
        label17 = new JLabel();
        label18 = new JLabel();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[171,fill]" +
            "[336,fill]",
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
            "[]" +
            "[]" +
            "[]"));

        Bank isExistBank = getBankById(user.getBanque().getId());

        if(isExistBank == null) {
            return;
        }

        //---- label1 ----
        label1.setText(isExistBank.getNom());
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getStyle() | Font.BOLD, label1.getFont().getSize() + 10f));
        contentPane.add(label1, "cell 0 0 2 1");

        //---- label2 ----
        label2.setText("Nom de la banque : ");
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getStyle() | Font.BOLD));
        contentPane.add(label2, "cell 0 2");

        //---- label9 ----
        label9.setText(isExistBank.getNom());
        contentPane.add(label9, "cell 1 2");

        //---- label3 ----
        label3.setText("Nom du directeur :");
        label3.setFont(label3.getFont().deriveFont(label3.getFont().getStyle() | Font.BOLD));
        contentPane.add(label3, "cell 0 4");

        //---- label10 ----
        label10.setText(isExistBank.getDirecteur());
        contentPane.add(label10, "cell 1 4");

        //---- label4 ----
        label4.setText("Nom du conseiller :");
        label4.setFont(label4.getFont().deriveFont(label4.getFont().getStyle() | Font.BOLD));
        contentPane.add(label4, "cell 0 6");

        //---- label11 ----
        label11.setText(isExistBank.getConseiller());
        contentPane.add(label11, "cell 1 6");

        //---- label5 ----
        label5.setText("Adresse :");
        label5.setFont(label5.getFont().deriveFont(label5.getFont().getStyle() | Font.BOLD));
        contentPane.add(label5, "cell 0 8");

        //---- label12 ----
        label12.setText(isExistBank.getAdresse());
        contentPane.add(label12, "cell 1 8");

        //---- label6 ----
        label6.setText("Ville :");
        label6.setFont(label6.getFont().deriveFont(label6.getFont().getStyle() | Font.BOLD));
        contentPane.add(label6, "cell 0 10");

        //---- label13 ----
        label13.setText(isExistBank.getVille());
        contentPane.add(label13, "cell 1 10");

        //---- label7 ----
        label7.setText("Code postal :");
        label7.setFont(label7.getFont().deriveFont(label7.getFont().getStyle() | Font.BOLD));
        contentPane.add(label7, "cell 0 12");

        //---- label14 ----
        label14.setText(isExistBank.getCodePostal());
        contentPane.add(label14, "cell 1 12");

        //---- label8 ----
        label8.setText("T\u00e9l\u00e9phone :");
        label8.setFont(label8.getFont().deriveFont(label8.getFont().getStyle() | Font.BOLD));
        contentPane.add(label8, "cell 0 14");

        //---- label15 ----
        label15.setText(isExistBank.getNumero());
        contentPane.add(label15, "cell 1 14");

        //---- label16 ----
        label16.setText("Ouverture");
        label16.setFont(label16.getFont().deriveFont(label16.getFont().getStyle() | Font.BOLD));
        contentPane.add(label16, "cell 0 16");

        //---- label17 ----
        label17.setText("Du lundi au vendredi de 10h \u00e0 18h");
        contentPane.add(label17, "cell 1 16");

        //---- label18 ----
        label18.setText("Le samedi de 9h \u00e0 12h");
        contentPane.add(label18, "cell 1 17");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel label2;
    private JLabel label9;
    private JLabel label3;
    private JLabel label10;
    private JLabel label4;
    private JLabel label11;
    private JLabel label5;
    private JLabel label12;
    private JLabel label6;
    private JLabel label13;
    private JLabel label7;
    private JLabel label14;
    private JLabel label8;
    private JLabel label15;
    private JLabel label16;
    private JLabel label17;
    private JLabel label18;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private Bank getBankById(int id) {
        for (Bank banque : this.listeBanques) {
            if(banque.getId() == id){
                return banque;
            }
        }

        return null;
    }
}
