/*
 * Created by JFormDesigner on Fri Jan 21 10:47:34 CET 2022
 */

package exercices.View;

import javax.swing.*;

import exercices.Model.Client;
import exercices.Model.HistoriqueVirement;
import net.miginfocom.swing.*;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author unknown
 */
public class HistoriqueVirementView extends JFrame {

    private ArrayList<HistoriqueVirement> listeHistoriqueVirement;

    public HistoriqueVirementView() {
        initComponents();
    }

    public HistoriqueVirementView(ArrayList<HistoriqueVirement> listeHistoriqueVirement) {
        this.listeHistoriqueVirement = listeHistoriqueVirement;
        initComponents();
    }

    public String getToString(){
        String str = "";

        for(int i = 0; i< this.listeHistoriqueVirement.size(); i++){
            str += this.listeHistoriqueVirement.get(i).toString();
        }
        return str;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        myArray = new JLabel();


        String str = getToString();
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
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //---- label1 ----
        label1.setText("L'historique de vos virements :");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 5f));
        contentPane.add(label1, "cell 4 1 6 2");

        //---- myArray ----
        myArray.setText("<html><body>" + str + "</body></html>");
        contentPane.add(myArray, "cell 0 3 10 3");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    public static void main(Client user, ArrayList<HistoriqueVirement> listeHistoriqueVirement){

    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JLabel myArray;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
