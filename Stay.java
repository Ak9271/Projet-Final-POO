import java.util.ArrayList;
import java.util.Date;

public class Stay {
    // Attributes
    private Date start;
    private Date end;
    private final ArrayList<PlaneTicket> transport = new ArrayList<>();
    private final ArrayList<HotelBooking> reservedStayHotel = new ArrayList<>();

    // Constructors
    public Stay() {
        this.start = null;
        this.end = null;
    }

    public Stay(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    // Methods
    public void setStay(int days) {
        if (this.start != null) {
            this.end = new Date(this.start.getTime() + (long) days * 24 * 60 * 60 * 1000);
        }
    }

    // Getters and Setters
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
        for (PlaneTicket pt : transport) {
            total += pt.getPrice(); // Assuming PlaneTicket has a getPrice() method
        }
        for (HotelBooking hb : reservedStayHotel) {
            total += hb.getPrice(); // Assuming HotelBooking has a getPrice() method
        }
        return total;
    }

    public double calculatePrice(int days) {
        double total = 0;
        for (PlaneTicket pt : transport) {
            total += pt.getPrice(); // Assuming PlaneTicket has a getPrice() method
        }
        for (HotelBooking hb : reservedStayHotel) {
            total += hb.getPricePerDay() * days; // Assuming HotelBooking has a getPricePerDay() method
        }
        return total;
    }

    @Override
    public String toString() {
        return "Stay{" +
                "start=" + start +
                ", end=" + end +
                ", transport=" + transport +
                ", reservedStayHotel=" + reservedStayHotel +
                '}';
    }
}