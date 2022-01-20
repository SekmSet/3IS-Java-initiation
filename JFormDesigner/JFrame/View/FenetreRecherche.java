/*
 * Created by JFormDesigner on Wed Jan 19 16:06:55 CET 2022
 */

package JFrame.View;

import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author Priscilla Joly
 */
public class FenetreRecherche extends JFrame {
    public FenetreRecherche() {
        initComponents();
    }

    public static void main(String[] args) {
        new FenetreRecherche();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        textField1 = new JTextField();
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
            "[fill]" +
            "[fill]" +
            "[193,fill]",
            // rows
            "[]" +
            "[]" +
            "[]"));

        //---- label1 ----
        label1.setText("Saisir le nom");
        contentPane.add(label1, "cell 0 0 6 1");
        contentPane.add(textField1, "cell 6 0");

        //---- button1 ----
        button1.setText("Recherche");
        contentPane.add(button1, "cell 0 1 7 1");
        pack();
        setLocationRelativeTo(getOwner());
        setVisible(true);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JTextField textField1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
