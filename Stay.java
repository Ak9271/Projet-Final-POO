import java.util.ArrayList;
import java.util.Date;

public class Stay {

    private Date start;
    private Date end;
    private final ArrayList<PlaneTicket> transport = new ArrayList<>();
    private final ArrayList<HotelBooking> reservedStayHotel = new ArrayList<>();

    public Stay() {
        this.start = null;
        this.end = null;
    }

    public Stay(Date start, Date end) {
        this.start = start;
        this.end = end;
    }
    public void setStay(int days) {
        if (this.start != null) {
            this.end = new Date(this.start.getTime() + (long) days * 24 * 60 * 60 * 1000);
        }
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
        for (PlaneTicket pt : transport) {
            total += pt.getPrice();
        }
        for (HotelBooking hb : reservedStayHotel) {
            total += hb.getPrice();
        }
        return total;
    }

    public double calculatePrice(int days) {
        double total = 0;
        for (PlaneTicket pt : transport) {
            total += pt.getPrice();
        }
        for (HotelBooking hb : reservedStayHotel) {
            total += hb.getPricePerDay() * days;
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