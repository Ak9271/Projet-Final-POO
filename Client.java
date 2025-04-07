public class Client {
    private String Nom;
    private int Id;
    private String Adresse;
    private PlaneTicket[] travelDocument;
    protected HotelBooking[] reservedClientHotel;
    protected Stay[] client;
    protected Stay[] guest;
    

    Client() {

    }

    Client(String Nom, int Id, String Adresse) {
        this.Nom = Nom;
        this.Id = Id;
        this.Adresse = Adresse;
    }

    public String getNom() {
        return Nom;
    }

    public String setNom(String Nom) {
        this.Nom = Nom;
        return Nom;
    }

    public int getId() {
        return Id;
    }

    public int setId(int Id) {
        this.Id = Id;
        return Id;
    }

    public String getAdresse() {
        return Adresse;
    }

    public String setAdresse(String Adresse) {
        this.Adresse = Adresse;
        return Adresse;
    }

    public PlaneTicket[] getTravelDocument() {
        return travelDocument;
    }

    public PlaneTicket[] addTravel_Document(PlaneTicket travel_document) {
        PlaneTicket[] newTravelDocument = new PlaneTicket[this.travelDocument.length + 1];
        for (int i = 0; i < this.travelDocument.length; i++) {
            newTravelDocument[i] = this.travelDocument[i];
        }
        newTravelDocument[newTravelDocument.length] = travel_document;
        this.travelDocument = newTravelDocument;
        return this.travelDocument;
    }

    public HotelBooking[] HotelgetReservedClientHotel() {
        return reservedClientHotel;
    }

    public HotelBooking[] addReservedClientHotel(HotelBooking reserved) {
        HotelBooking[] newReservedClientHotel = new HotelBooking[this.reservedClientHotel.length + 1];
        for (int i = 0; i < this.reservedClientHotel.length; i++) {
            newReservedClientHotel[i] = this.reservedClientHotel[i];
        }
        newReservedClientHotel[newReservedClientHotel.length] = reserved;
        this.reservedClientHotel = newReservedClientHotel;
        return this.reservedClientHotel;
    }

    public Stay[] getStayClient() {
        return client;
    }

    public Stay[] addStayClient(Stay subject) {
        Stay[] newClient = new Stay[this.client.length + 1];
        for (int i = 0; i < this.client.length; i++) {
            newClient[i] = this.client[i];
        }
        newClient[newClient.length] = subject;
        this.client = newClient;
        return this.client;
    }

    public Stay[] getStayGuest() {
        return guest;
    }

    public Stay[] addStayGuest (Stay stay) {
        Stay[] newGuest = new Stay[this.guest.length + 1];
        for (int i = 0; i < this.guest.length; i++) {
            newGuest[i] = this.guest[i];
        }
        newGuest[newGuest.length] = stay;
        this.client = newGuest;
        return this.client;
    }

    @Override
    public String toString() {
        return "Client [Nom=" + Nom + ", Id=" + Id + ", Adresse=" + Adresse + "]";
    }
}