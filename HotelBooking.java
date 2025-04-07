import java.util.Date;

public class HotelBooking {
    private int nombreRoom;
    private Date Start;
    private Date End;
    private int nombreNuit;
    private String roomType;
    private boolean Smoking;

    HotelBooking() {

    }

    HotelBooking(int _nombreRoom, Date Start, Date End, String _roomType, boolean Smoking) {
        this.nombreRoom = _nombreRoom;
        this.Start = Start;
        this.End = End;
        this.roomType = _roomType;
        this.Smoking = Smoking;
    }

    public int getNombreRoom() {
        return this.nombreRoom;
    }

    public void setNombreRoom(int nombreRoom) {
        this.nombreRoom = nombreRoom;
    }

    public Date getStart() {
        return this.Start;
    }

    public void setStart(Date Start) {
        this.Start = Start;
    }

    public Date getEnd() {
        return this.End;
    }

    public void setEnd(Date End) {
        this.End = End;
    }

    public int getNombreNuit() {
        return this.nombreNuit;
    }

    public void setNombreNuit(int nombreNuit) {
        this.nombreNuit = nombreNuit;
    }

    public String getRoomType() {
        return this.roomType;
    }

    public boolean isSmoking() {
        return this.Smoking;
    }
    
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setSmoking(boolean Smoking) {
        this.Smoking = Smoking;
    }

    @Override
    public String toString() {
        return "HotelBooking{" +
                "nombreRoom=" + nombreRoom +
                ", Start=" + Start +
                ", End=" + End +
                ", nombreNuit=" + nombreNuit +
                ", roomType='" + roomType + '\'' +
                ", Smoking=" + Smoking +
                '}';
    }
}