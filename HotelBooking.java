import java.io.Serializable;

public class HotelBooking implements Serializable {
    private int nombreRoom;
    private Date Start;
    private Date End;
    private int nombreNuit;
    private String roomType;
    private boolean Smoking;

    public HotelBooking() {
        
    }

    public HotelBooking(int nombreRoom, Date Start, Date End, String roomType, boolean Smoking) {
        this.nombreRoom = nombreRoom;
        this.Start = Start;
        this.End = End;
        this.roomType = roomType;
        this.Smoking = Smoking;
    }

    public int getNombreRoom() {
        return nombreRoom;
    }

    public void setNombreRoom(int nombreRoom) {
        this.nombreRoom = nombreRoom;
    }

    public Date getStart() {
        return Start;
    }

    public void setStart(Date Start) {
        this.Start = Start;
    }

    public Date getEnd() {
        return End;
    }

    public void setEnd(Date End) {
        this.End = End;
    }

    public int getNombreNuit() {
        return nombreNuit;
    }

    public void setNombreNuit(int nombreNuit) {
        this.nombreNuit = nombreNuit;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isSmoking() {
        return Smoking;
    }

    public void setSmoking(boolean Smoking) {
        this.Smoking = Smoking;
    }

    @Override
    public String toString() {
        return  "Nombre de chambres: " + nombreRoom +
                "\n" +
                "Début: " + Start +
                "\n" +
                "Fin: " + End +
                "\n" +
                "Nombre de Nuits: " + nombreNuit +
                "\n" +
                "Type de Chambre: " + roomType +
                "\n" +
                "Fumeur: " + Smoking;
    }
}