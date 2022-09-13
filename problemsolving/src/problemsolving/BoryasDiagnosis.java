
package problemsolving;

import java.util.Scanner;

public class BoryasDiagnosis {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] goingDia = new int[n];
        int[] stayDia = new int[n];
        int otalDayNeed = 0;        
        for (int i = 0; i < n; i++) {
            goingDia[i] = scan.nextInt();
            stayDia[i] = scan.nextInt(); 
        }
        
        
    }
    
}
