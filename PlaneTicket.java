import java.io.Serializable;

public class PlaneTicket implements Serializable {
    private String Reference;

    public PlaneTicket() {}

    public PlaneTicket(String reference) {
        this.Reference = reference;
    }

    public String getReference() {
        return Reference;
    }

    public void setReference(String reference) {
        this.Reference = reference;
    }

    @Override
    public String toString() {
        return "La référence du ticket est : " + Reference;
    }
}