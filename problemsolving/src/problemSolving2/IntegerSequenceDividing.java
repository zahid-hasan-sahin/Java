
package problemSolving2;

import java.util.Scanner;

public class IntegerSequenceDividing {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long sumOfAllDigit = ((1+n)*n)/2;     
        System.out.println(sumOfAllDigit%2);
        
    }
    
}
