package MidTask;

import java.util.Scanner;

public class One {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter: ");
        double[] a = new double[11];
        for (int i = 0; i < 11; i++) {
            a[i] = scan.nextDouble();
        }
        int nc = 0;
        int mc = 0;
        int hc = 0;
        double nm = 0;
        double mm = 0;
        double hm = 0;
        for (int i = 0; i < 11; i++) {
            if (a[i] < 7.8) {
                ++nc;
                nm = Math.max(nm, a[i]);
            } else if (a[i] <= 11) {
                ++mc;
                mm = Math.max(mm, a[i]);
            } else {
                ++hc;
                hm = Math.max(hm, a[i]);
            }
        }
        System.out.println("Normal");
        System.out.println("Total: " + nc + "; Max Sugar Level:" + nm);
        System.out.println("Prediabets");
        System.out.println("Total: " + mc + "; Max Sugar Level:" + mm);
        System.out.println("Diabetes");
        System.out.println("Total: " + hc + "; Max Sugar Level:" + hm);
    }
}
