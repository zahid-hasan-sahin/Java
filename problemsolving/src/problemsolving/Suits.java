
package problemsolving;

import java.util.Scanner;

public class Suits {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        int f = scan.nextInt();
        int ad = Math.min(a,d);
        int cb = Math.min(b, Math.min(c, d-ad));
        int res1= (ad*e)+(f*cb);
        int tp = Math.min(b,Math.min(c,d));       
        int td = Math.min(a,d-tp);
        int res2 = (td*e)+(tp*f);
        System.out.println(res1>res2?res1:res2);       
    }   
}
