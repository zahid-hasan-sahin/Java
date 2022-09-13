
package problemsolving;

import java.util.Scanner;

public class IntegerPoints {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int dt  = scan.nextInt();
        int d[] = new int[dt];
        for (int i = 0; i < dt; i++) {
            d[i] = scan.nextInt();
        }
        int jt = scan.nextInt();
        int[] j = new int[jt];
        for (int i = 0;i < jt; i++) {
            j[i] = scan.nextInt();
        }int c=  0;
        for (int i = 0; i < dt; i++) {
            for (int k = 0; k < jt; k++) {
                System.out.println((-1+j[i])%(1+d[k]));
                if((-1+j[k])%(1+d[i])>=0){
                   
                    c++;
                }
            }
            
        }
        System.out.println(c);
    }
    
}
