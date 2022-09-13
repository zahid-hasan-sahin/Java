package Three;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Patient> ar = new ArrayList<Patient>();
        IndoorPatient in1 = new IndoorPatient(1, "A", 10, 20, 30);
        IndoorPatient in2 = new IndoorPatient(2, "B", 40, 50, 60);
        OutdoorPatient out1 = new OutdoorPatient(3, "C", 70);
        OutdoorPatient out2 = new OutdoorPatient(4, "D", 80);
        ar.add(in1);
        ar.add(in2);
        ar.add(out1);
        ar.add(out2);
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i).bill());
            System.out.println(ar.get(i).toString());
        }
        int sum = 0;
        int count = 0;

        for (int i = 0; i < ar.size(); i++) {
            if (ar.get(i) instanceof IndoorPatient) {
                sum += ar.get(i).bill();
                ++count;
            }
        }
        System.out.println("Avg: " + (sum / (double) count));
     
    }
}
