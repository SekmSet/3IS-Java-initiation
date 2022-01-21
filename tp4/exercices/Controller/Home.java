/*
 * Created by JFormDesigner on Thu Jan 20 09:44:41 CET 2022
 */

package exercices.Controller;

import exercices.Model.Bank;
import exercices.Model.Client;
import exercices.Model.HistoriqueVirement;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

/**
 * @author Priscilla Joly
 */
public class Home extends JFrame {

    public static ArrayList<Client> listeClient = new ArrayList<>();
    public static ArrayList<HistoriqueVirement> listeHistoriqueVirement = new ArrayList<>();
    public static HistoriqueVirementView historiqueVirementView;
    public static ArrayList<Bank> listeBanques = new ArrayList<>();

    public static Depot depot;
    public static Retrait retrait;
    public static Transfert transfert;
    public static CreateUser createUser;
    public static BanqueInfo banqueInfo;

    private final String colorGreen = "#1F6A20";
    private final String colorOrange = "#EA5C2B";
    private final String colorRed = "#CD1818";
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label10;
    private JLabel label3;
    private JTextField textField1;
    private JButton button3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label8;
    private JLabel label1;
    private JLabel label2;
    private JLabel label7;
    private JLabel label9;
    private JLabel label11;
    private JLabel label12;
    private JButton button2;
    private JButton button1;
    private JLabel label6_status;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public Home() {
        initComponents();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Home frame = new Home();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    private void actionDepot(ActionEvent e) {
        String nom = textField1.getText();
        Client user = getClient(nom);

        if (user != null) {
            depot = new Depot(user, listeClient);
            depot.setVisible(true);
        } else {
            label6_status.setForeground(Color.decode(this.colorRed));
            label6_status.setText("Pas d'utilisateur trouvé.");
        }
    }

    private void actionRetrait(ActionEvent e) {
        String nom = textField1.getText();
        Client user = getClient(nom);

        if (user != null) {
            retrait = new Retrait(user, listeClient);
            retrait.setVisible(true);
        } else {
            label6_status.setForeground(Color.decode(this.colorRed));
            label6_status.setText("Pas d'utilisateur trouvé.");
        }
    }

    private void creerClient(ActionEvent e) {
        createUser = new CreateUser(listeBanques);
        createUser.setVisible(true);
    }

    private void actionVirement(ActionEvent e) {
        String nom = textField1.getText();
        Client user = getClient(nom);

        if (user != null) {
            transfert = new Transfert(user, listeClient);
            transfert.setVisible(true);
        } else {
            label6_status.setForeground(Color.decode(this.colorRed));
            label6_status.setText("Pas d'utilisateur trouvé.");
        }
    }

    private void actionHistoriqueVirement(ActionEvent e) {
        String nom = textField1.getText();
        Client user = getClient(nom);

        if (user != null) {
            ArrayList<HistoriqueVirement> listeHistoriquVirementView = getClientHistoriqueVirement(user);

            historiqueVirementView = new HistoriqueVirementView(listeHistoriquVirementView);
            historiqueVirementView.setVisible(true);

        }
    }

    private ArrayList<HistoriqueVirement> getClientHistoriqueVirement(Client client) {
        ArrayList<HistoriqueVirement> myHistorique = new ArrayList<>();
        for (HistoriqueVirement historiqueVirement : listeHistoriqueVirement) {
            if (historiqueVirement.getNomCreancier().equals(client.getNom())) {
                myHistorique.add(historiqueVirement);
            }
        }
        return myHistorique;
    }

    private void actionVoirInfoBanque(ActionEvent e) {

        String nom = textField1.getText();
        Client user = getClient(nom);

        if (user != null) {
            banqueInfo = new BanqueInfo(user, listeBanques);
            banqueInfo.setVisible(true);
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label10 = new JLabel();
        label3 = new JLabel();
        textField1 = new JTextField();
        button3 = new JButton();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label8 = new JLabel();
        label1 = new JLabel();
        label2 = new JLabel();
        label7 = new JLabel();
        label9 = new JLabel();
        label11 = new JLabel();
        label12 = new JLabel();
        button2 = new JButton();
        button1 = new JButton();
        label6_status = new JLabel();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[102,fill]" +
                        "[fill]" +
                        "[125,fill]" +
                        "[fill]" +
                        "[70,fill]" +
                        "[fill]" +
                        "[81,fill]" +
                        "[fill]" +
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
                        "[]"));

        //---- label10 ----
        label10.setText("Page de profil");
        label10.setFont(label10.getFont().deriveFont(label10.getFont().getStyle() | Font.BOLD, label10.getFont().getSize() + 10f));
        contentPane.add(label10, "cell 0 0 9 1");

        //---- label3 ----
        label3.setText("Nom");
        label3.setFont(label3.getFont().deriveFont(label3.getFont().getStyle() | Font.BOLD));
        contentPane.add(label3, "cell 0 2");
        contentPane.add(textField1, "cell 2 2");

        //---- button3 ----
        button3.setText("Valider");
        button3.addActionListener(e -> afficherClient(e));
        contentPane.add(button3, "cell 4 2");

        //---- label4 ----
        label4.setText("Pr\u00e9nom");
        label4.setFont(label4.getFont().deriveFont(label4.getFont().getStyle() | Font.BOLD));
        contentPane.add(label4, "cell 0 3");
        contentPane.add(label5, "cell 2 3");

        //---- label6 ----
        label6.setText("D\u00e9couvert autoris\u00e9");
        label6.setFont(label6.getFont().deriveFont(label6.getFont().getStyle() | Font.BOLD));
        contentPane.add(label6, "cell 4 3");
        contentPane.add(label8, "cell 6 3");

        //---- label1 ----
        label1.setText("Solde");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getStyle() | Font.BOLD));
        contentPane.add(label1, "cell 0 4");
        contentPane.add(label2, "cell 2 4");

        //---- label7 ----
        label7.setText("Nombre de transaction effectu\u00e9e");
        label7.setFont(label7.getFont().deriveFont(label7.getFont().getStyle() | Font.BOLD));
        contentPane.add(label7, "cell 4 4");
        contentPane.add(label9, "cell 6 4");

        //---- label11 ----
        label11.setText("D\u00e9p\u00f4t max.");
        label11.setFont(label11.getFont().deriveFont(label11.getFont().getStyle() | Font.BOLD));
        contentPane.add(label11, "cell 0 5");
        contentPane.add(label12, "cell 2 5");

        //---- button2 ----
        button2.setText("Retrait");
        button2.addActionListener(e -> actionRetrait(e));
        contentPane.add(button2, "cell 0 6");

        //---- button1 ----
        button1.setText("D\u00e9p\u00f4t");
        button1.addActionListener(e -> actionDepot(e));
        contentPane.add(button1, "cell 6 6");

        //---- label6_status ----
        label6_status.setForeground(new Color(0, 102, 102));
        contentPane.add(label6_status, "cell 0 7 7 1");

        //---- button4 ----
        button4.setText("Cr\u00e9er un nouveau client");
        button4.addActionListener(e -> creerClient(e));
        contentPane.add(button4, "cell 0 8 9 1");

        //---- button5 ----
        button5.setText("Faire un virement");
        button5.addActionListener(e -> actionVirement(e));
        contentPane.add(button5, "cell 0 9 9 1");

        //---- button6 ----
        button6.setText("Voir mon historique des virements");
        button6.addActionListener(e -> actionHistoriqueVirement(e));
        contentPane.add(button6, "cell 0 10 9 1");

        //---- button7 ----
        button7.setText("Voir les informations de ma banque");
        button7.addActionListener(e -> actionVoirInfoBanque(e));
        contentPane.add(button7, "cell 0 11 9 1");

        createBank();

        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    public void afficherClient(ActionEvent e) {
        String nom = textField1.getText();
        Client user = getClient(nom);

        if (user == null) {
            label6_status.setForeground(Color.decode(this.colorRed));
            label6_status.setText("Pas d'utilisateur trouvé.");
            return;
        }

        label5.setText(user.getPrenom());
        int solde = user.getSolde();
        String toString = String.valueOf(solde);
        label2.setText(toString);
        label8.setText(String.valueOf(-user.getMontant()));
        label9.setText(String.valueOf(user.getNbrTransactions()));
        label12.setText(String.valueOf(user.getMaxDepot()));

        if (solde > 0) {
            label6_status.setForeground(Color.decode(this.colorGreen));
            label6_status.setText("Compte positif");
        } else if (solde == 0) {
            label6_status.setForeground(Color.decode(this.colorOrange));
            label6_status.setText("Sans solde");
        } else {
            label6_status.setForeground(Color.decode(this.colorRed));
            label6_status.setText("Compte déficitaire");
        }
    }

    private Client getClient(String nom) {
        for (Client client : listeClient) {
            if (client.getNom().equals(nom)) {
                return client;
            }
        }

        return null;
    }

    private void createBank() {
        Bank newBank1 = new Bank(
                1,
                "C.I.C",
                "Jordan Philippot",
                "Monsieur Kawai",
                "04 00 00 00 00",
                "38 Rue des étoiles",
                "Lyon",
                "69002"
        );
        Bank newBank2 = new Bank(
                2,
                "Philippot Bank",
                "Jordan Philippot",
                "Monsieur Philippot",
                "04 00 00 00 00",
                "69 Rue de la baise",
                "Paris",
                "75000"
        );
        Bank newBank3 = new Bank(
                3,
                "Crédit Mutuel",
                "Marie Philippot",
                "Madame Sakura",
                "04 00 00 00 00",
                "17 Rue Shibie",
                "Marseille",
                "13000"
        );
        Bank newBank4 = new Bank(
                4,
                "Société Générale",
                "Lucie Heartfilia",
                "Monsieur Holmes",
                "04 00 00 00 00",
                "33 Bis Rue du Maréchal",
                "Toulouse",
                "31000"
        );
        listeBanques.add(newBank1);
        listeBanques.add(newBank2);
        listeBanques.add(newBank3);
        listeBanques.add(newBank4);
    }
}
