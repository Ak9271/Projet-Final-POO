import java.util.ArrayList;

public class Stay {
    private Date start;
    private Date end;
    private final ArrayList<PlaneTicket> transport = new ArrayList<>();
    private final ArrayList<HotelBooking> reservedStayHotel = new ArrayList<>();

    Stay() {
        this.start = new Date();
        this.end = new Date();
    }

    Stay(Date start, Date end) {
        this.start = start;
        this.end = end;
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

    public ArrayList<PlaneTicket> getTransport() {
        return transport;
    }

    public void addTransport(PlaneTicket pt) {
        this.transport.add(pt);
    }

    public ArrayList<HotelBooking> getReservedStayHotel() {
        return reservedStayHotel;
    }

    public void addReservedStayHotel(HotelBooking hb) {
        this.reservedStayHotel.add(hb);
    }

    public double calculatePrice() {
        double total = 0;
    }

    public double calculatePrice(int i) {
        double total = 0;
    }

    @Override
    public String toString() {
        return "Stay [" +
                "start=" + start +
                ", end=" + end +
                ", transport=" + transport +
                ", reservedStayHotel=" + reservedStayHotel +
                ']';
    }
}