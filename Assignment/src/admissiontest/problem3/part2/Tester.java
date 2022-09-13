package admissiontest.problem3.part2;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 8;
        FMRadioStation[] station = new FMRadioStation[n];
        for (int i = 0; i < 8; i++) {
            System.out.println("Enter data for station- " + (i + 1));
            System.out.print("Enter call sing: ");
            String sing = scan.next();
            System.out.print("Enter frequency: ");
            double frequency = scan.nextDouble();
            try {
                station[i] = new FMRadioStation(sing, frequency);
                System.out.println("valid object");
            } catch (Exception e) {
                System.out.println("invalid object");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            if (station[i] != null) {
                System.out.println(station[i].toString());
            }
        }
    }
}
