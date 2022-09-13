package problemSolving3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RoundCorridor {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double s = (a + b + c) / 2;
        double rArea = Math.sqrt(s * (s - a) * (s - b) * (s - c));
       
        double oArea = Math.sqrt((s - a) * (s - b) * (s - c) / s);
        
        double bArea = (a * b * c) / Math.sqrt((a + b + c) * (b + c - a) * (c + a - b) * (a + b - c));
        double t = Math.PI * oArea * oArea;
        double k = rArea;
         DecimalFormat formatter = new DecimalFormat("#0.0000");
        double u = bArea * bArea*Math.PI;
        System.out.print(formatter.format(u-k)+" ");
        System.out.print(formatter.format(k-t)+" ");
        System.out.println(formatter.format(t));

    }

}
