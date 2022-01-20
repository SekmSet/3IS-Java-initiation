/*
 * Created by JFormDesigner on Wed Jan 19 15:04:30 CET 2022
 */

package JFrame.Controller;

import javax.swing.*;
import JFrame.Model.Client;
import JFrame.View.FenetreForm;
import JFrame.View.FenetreRecherche;
import net.miginfocom.swing.*;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

/**
 * @author Priscilla Joly
 */
public class FenetreHome extends JFrame {
    public static ArrayList<Client> listeClients = new ArrayList<>();

    public FenetreHome() {
        initComponents();
    }

    public static void main(String[] args) {
        new FenetreHome();
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents

        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]"));

        //---- button1 ----
        button1.setText("Ajouter client");
        button1.addActionListener(e -> ajouterClient(e));
        contentPane.add(button1, "cell 0 1 2 1");

        //---- button2 ----
        button2.setText("Chercher client");
        button2.addActionListener(e -> chercherClient(e));
        contentPane.add(button2, "cell 0 3 2 1");

        pack();
        setLocationRelativeTo(getOwner());
        setVisible(true);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private void ajouterClient(ActionEvent e) {
        // TODO add your code here
        FenetreForm form = new FenetreForm();
    }

    private void chercherClient(ActionEvent e) {
        // TODO add your code here
        FenetreRecherche chercherClient = new FenetreRecherche();
    }
}
