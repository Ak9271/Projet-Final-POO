import java.util.Date;

public class HotelBooking {
    // Attributes
    private int nombreRoom;
    private Date start;
    private Date end;
    private int nombreNuit;
    private String roomType;
    private boolean smoking;

    public HotelBooking() {
    }



    public int getNombreRoom() {
        return nombreRoom;
    }

    public void setNombreRoom(int nombreRoom) {
        this.nombreRoom = nombreRoom;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
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
        return smoking;
    }

    public void setSmoking(boolean smoking) {
        this.smoking = smoking;
    }

    @Override
    public String toString() {
        return "HotelBooking{" +
                "nombreRoom=" + nombreRoom +
                ", start=" + start +
                ", end=" + end +
                ", nombreNuit=" + nombreNuit +
                ", roomType='" + roomType + '\'' +
                ", smoking=" + smoking +
                '}';
    }
}