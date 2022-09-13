package basicjava;
import java.util.Scanner;
public class FibonacciDemo {
    public static void main(String[] args){
        int t;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Last Number : ");
        t = input.nextInt();
        int first = 0;
        int second = 1;
       System.out.print(first+" "+second+" ");
        for (int i = 3; i <= t; i++) {
           int result = first + second;
           System.out.print(result+" ");
           first = second;
           second = result;
        }
    }
    
}
