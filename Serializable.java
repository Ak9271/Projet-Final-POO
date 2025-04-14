import java.util.ArrayList;

public interface Serializable {
    String getNom();
    void setNom(String Nom);
    int getId();
    void setId(int Id);
    String getAdresse();
    void setAdresse(String Adresse);
    ArrayList<PlaneTicket> getTravelDocument();
    void addTravelDocument(PlaneTicket travel_document);
    ArrayList<HotelBooking> getReservedClientHotel();
    void addReservedClientHotel(HotelBooking reserved);
    ArrayList<Stay> getStayClient();
    void addStayClient(Stay subject);
    ArrayList<Stay> getStayGuest();
    void addStayGuest(Stay stay);

    int getNombreRoom();
    void setNombreRoom(int nombreRoom);
    Date getStart();
    void setStart(Date Start);
    Date getEnd();
    void setEnd(Date End);
    int getNombreNuit();
    void setNombreNuit(int nombreNuit);
    String getRoomType();
    void setRoomType(String roomType);
    boolean isSmoking();
    void setSmoking(boolean Smoking);

    String getReference();
    void setReference(String reference);

    ArrayList<PlaneTicket> getTransport();
    void addTransport(PlaneTicket pt);
    ArrayList<HotelBooking> getReservedStayHotel();
    void addReservedStayHotel(HotelBooking hb);
    double calculatePrice();
    double calculatePrice(int i);
}
