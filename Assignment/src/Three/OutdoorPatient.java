package Three;

public class OutdoorPatient extends Patient {

    private int visitingFee;

    public OutdoorPatient(int id, String name, int visitingFee) {
        super(id, name);
        this.visitingFee = visitingFee;
    }

    @Override
    int bill() {
        return visitingFee;
    }

    public String toString() {
        return super.toString() + " " + visitingFee;
    }
}
