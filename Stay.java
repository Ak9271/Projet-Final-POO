import java.io.Serializable;
import java.util.ArrayList;

public class Stay implements Serializable {
    private Date start;
    private Date end;
    private final ArrayList<PlaneTicket> transport;
    private final ArrayList<HotelBooking> reservedStayHotel;

    public Stay() {
        this.transport = new ArrayList<>();
        this.reservedStayHotel = new ArrayList<>();
    }

    public Stay(Date start, Date end) {
        this.start = start;
        this.end = end;
        this.transport = new ArrayList<>();
        this.reservedStayHotel = new ArrayList<>();
    }

    public void setStay(int i) {

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
        double prixTotal = 0;
        double prixAvion = 500;
        for (PlaneTicket pt : transport) {
            if (pt != null) {
                prixTotal += prixAvion;
            }
        }
        for (HotelBooking hb : reservedStayHotel) {
            if (hb != null) {
               int NbrNuit = hb.getNombreNuit();
                String type = hb.getRoomType();
                if (type.equals("Single")) {
                    prixTotal += 100 * NbrNuit;
                } else if (type.equals("Double")) {
                    prixTotal += 150 * NbrNuit;
                } else if (type.equals("Family")) {
                    prixTotal += 200 * NbrNuit;
                }
            }
        }
        return prixTotal;
    }

    public double calculatePrice(int i) {
        return calculatePrice() * i;
    }

    @Override
    public String toString() {
        return "Prix Total: " + calculatePrice();
    }
}
