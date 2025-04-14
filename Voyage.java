import java.awt.*;
import javax.swing.*;

public class Voyage extends JFrame {
    private JTextField nomField, idField, adresseField, nbPersonnesField, caseReference;
    private JComboBox<String> caseTypeRoom;
    private JCheckBox fumeur;
    private JTextArea espaceAffichage;
    private Client client;

    public Voyage() {
        super("Gestion de Voyage");
        client = new Client();
        setLayout(new BorderLayout());

        JPanel clientPanel = new JPanel(new GridLayout(4, 2, 10, 10));
        clientPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        clientPanel.add(new JLabel("Nom:"));
        nomField = new JTextField(15);
        clientPanel.add(nomField);

        clientPanel.add(new JLabel("ID:"));
        idField = new JTextField(15);
        clientPanel.add(idField);

        clientPanel.add(new JLabel("Adresse:"));
        adresseField = new JTextField(15);
        clientPanel.add(adresseField);

        JButton creerClient = new JButton("Créer Client");
        clientPanel.add(creerClient);

        JPanel hotelPanel = new JPanel(new GridLayout(4, 2, 10, 10));
        hotelPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        hotelPanel.add(new JLabel("Nombre de personnes :"));
        nbPersonnesField = new JTextField(10);
        hotelPanel.add(nbPersonnesField);

        hotelPanel.add(new JLabel("Type de chambre :"));
        caseTypeRoom = new JComboBox<>(new String[]{"Simple", "Double", "Family"});
        hotelPanel.add(caseTypeRoom);

        hotelPanel.add(new JLabel("Fumeur :"));
        fumeur = new JCheckBox("Oui");
        hotelPanel.add(fumeur);

        JButton reserverHotel = new JButton("Réserver Hôtel");
        hotelPanel.add(reserverHotel);

        JPanel avionPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        avionPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        avionPanel.add(new JLabel("Référence billet avion :"));
        caseReference = new JTextField(15);
        avionPanel.add(caseReference);

        JButton reserverAvion = new JButton("Ajouter Billet");
        avionPanel.add(reserverAvion);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Client", clientPanel);
        tabbedPane.addTab("Hôtel", hotelPanel);
        tabbedPane.addTab("Avion", avionPanel);

        espaceAffichage = new JTextArea(10, 40);
        espaceAffichage.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(espaceAffichage);

        add(tabbedPane, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        creerClient.addActionListener(e -> {
            try {
                client.setNom(nomField.getText());
                client.setId(Integer.parseInt(idField.getText()));
                client.setAdresse(adresseField.getText());
                espaceAffichage.append("Votre compte a bien été créé:\n" + client.toString() + "\n\n");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "ID invalide !");
            }
        });

        reserverHotel.addActionListener(e -> {
            try {
                int nb = Integer.parseInt(nbPersonnesField.getText());
                String type = caseTypeRoom.getSelectedItem().toString();
                boolean estFumeur = fumeur.isSelected();

                HotelBooking reserver = new HotelBooking();
                reserver.setNombreRoom(nb);
                reserver.setRoomType(type);
                reserver.setSmoking(estFumeur);

                client.addReservedClientHotel(reserver);

                espaceAffichage.append("L'hôtel a bien été réservé:\n" + reserver.toString() + "\n\n");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Nombre de personnes invalide !");
            }
        });

        reserverAvion.addActionListener(e -> {
            String ref = caseReference.getText().trim();
            if (!ref.isEmpty()) {
                PlaneTicket ticket = new PlaneTicket(ref);
                client.addTravelDocument(ticket);
                espaceAffichage.append(ticket.toString() + "\n\n");
                caseReference.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Veuillez entrer une référence de billet.");
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Voyage();
    }
}