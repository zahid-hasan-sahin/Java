package Three;

public class IndoorPatient extends Patient {

    int bedFee;
    int medicineFee;
    int labTestFee;

    public IndoorPatient(int id, String name, int bedFee, int medicineFee, int labTestFee) {
        super(id, name);
        this.bedFee = bedFee;
        this.medicineFee = medicineFee;
        this.labTestFee = labTestFee;
    }

    @Override
    int bill() {
        return bedFee + medicineFee + labTestFee;
    }

    public String toString() {
        return super.toString() + " " + bedFee + " " + medicineFee + " " + labTestFee;
    }

}
