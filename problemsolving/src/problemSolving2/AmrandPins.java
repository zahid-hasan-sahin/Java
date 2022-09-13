package problemSolving2;

import java.util.Scanner;

public class AmrandPins {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int dis = (int)Math.ceil(Math.sqrt(Math.pow(x-a,2)+Math.pow(y-b,2)));
        
        System.out.println(dis/(r*2)+(dis%(r*2)>0?1:0));
                
    }

}
