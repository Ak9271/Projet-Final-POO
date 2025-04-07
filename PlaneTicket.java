public class PlaneTicket {
    private String Reference;

    PlaneTicket() {
        this.Reference = "";
    }

    PlaneTicket(String reference) {
        this.Reference = reference;
    }

    public String getReference() {
        return this.Reference;
    }

    public void setReference(String reference) {
        this.Reference = reference;
    }

    @Override
    public String toString() {
        return "LA référence du ticket est : " + this.Reference;
    }
}