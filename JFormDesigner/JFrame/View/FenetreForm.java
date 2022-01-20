package JFrame.View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import JFrame.Controller.FenetreHome;
import JFrame.Model.Client;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Wed Jan 19 14:24:43 CET 2022
 */

/**
 * @author Priscilla Joly
 */
public class FenetreForm extends JFrame {
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JTextField textField_nom;
    private JLabel label2;
    private JTextField textField_prenom;
    private JLabel label4;
    private JButton button_envoyer;
    private JLabel label5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public static void main(String[] args) {
       new FenetreForm();
    }

    public FenetreForm() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        textField_nom = new JTextField();
        label2 = new JLabel();
        textField_prenom = new JTextField();
        label4 = new JLabel();
        button_envoyer = new JButton();
        label5 = new JLabel();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[124,fill]" +
            "[455,fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //---- label1 ----
        label1.setText("Nom * :");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getStyle() | Font.BOLD, label1.getFont().getSize() + 14f));
        label1.setForeground(new Color(0, 153, 153));
        contentPane.add(label1, "cell 0 0");
        contentPane.add(textField_nom, "cell 1 0");

        //---- label2 ----
        label2.setText("Pr\u00e9nom :");
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getStyle() | Font.BOLD, label2.getFont().getSize() + 14f));
        label2.setForeground(new Color(0, 153, 153));
        contentPane.add(label2, "cell 0 1");
        contentPane.add(textField_prenom, "cell 1 1");
        contentPane.add(label4, "cell 0 3 2 1");

        //---- button_envoyer ----
        button_envoyer.setText("Envoyer");
        button_envoyer.setFont(button_envoyer.getFont().deriveFont(button_envoyer.getFont().getSize() + 15f));
        button_envoyer.setForeground(new Color(0, 153, 153));
        button_envoyer.addActionListener(e -> {
			_envoyer(e);
		});
        contentPane.add(button_envoyer, "cell 0 5");

        //---- label5 ----
        label5.setText("* Champ obligatoire");
        label5.setForeground(new Color(0, 102, 102));
        contentPane.add(label5, "cell 0 7");
        pack();
        setLocationRelativeTo(getOwner());
        setVisible(true);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    private void _envoyer(ActionEvent e) {
        // TODO add your code here
        String nom = textField_nom.getText();
        String prenom = textField_prenom.getText();

        if(nom.equals(" ")) {
            label4.setText("Un champ obligatoire est vide !");
        } else {
            label4.setText(nom + " " + prenom + " a bien été enregistré dans notre base.");

            Client client = new Client(nom, prenom);
            FenetreHome.listeClients.add(client);

            FenetreHome home = new FenetreHome();
//            FenetreForm form = new FenetreForm();
//            form.setVisible(false);
            home.setVisible(true);
        }

        textField_nom.setText("");
        textField_prenom.setText("");
    }
}
