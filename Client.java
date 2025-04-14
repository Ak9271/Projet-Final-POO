import java.io.Serializable;
import java.util.ArrayList;

public class Client implements Serializable {
    private String Nom;
    private int Id;
    private String Adresse;
    private final ArrayList<PlaneTicket> travelDocument = new ArrayList<>();
    protected final ArrayList<HotelBooking> reservedClientHotel = new ArrayList<>();
    protected final ArrayList<Stay> client = new ArrayList<>();
    protected final ArrayList<Stay> guest = new ArrayList<>();

    public Client() {}

    public Client(String Nom, int Id, String Adresse) {
        this.Nom = Nom;
        this.Id = Id;
        this.Adresse = Adresse;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }

    public ArrayList<PlaneTicket> getTravelDocument() {
        return travelDocument;
    }

    public void addTravelDocument(PlaneTicket travel_document) {
        this.travelDocument.add(travel_document);
    }

    public ArrayList<HotelBooking> getReservedClientHotel() {
        return reservedClientHotel;
    }

    public void addReservedClientHotel(HotelBooking reserved) {
        this.reservedClientHotel.add(reserved);
    }

    public ArrayList<Stay> getStayClient() {
        return client;
    }

    public void addStayClient(Stay subject) {
        this.client.add(subject);
    }

    public ArrayList<Stay> getStayGuest() {
        return guest;
    }

    public void addStayGuest(Stay stay) {
        this.guest.add(stay);
    }

    @Override
    public String toString() {
        return "Nom: " + Nom +
        "\n" + 
        "Id: " + Id + 
        "\n" +
        "Adresse: " + Adresse;
    }
}
