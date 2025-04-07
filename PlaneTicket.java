public class PlaneTicket {
    private String reference;

    public PlaneTicket() {
        this.reference = "";
    }

    public PlaneTicket(String reference) {
        this.reference = reference;
    }

    public String getRefence() {
        return this.reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public String toString() {
        return "LA référence du ticket est{reference= + reference }";
    }
}
