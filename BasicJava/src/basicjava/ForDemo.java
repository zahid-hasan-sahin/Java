
package basicjava;

import java.util.Scanner;

public class ForDemo {
    public static void main(String [] args){
        int t;
        Scanner input = new Scanner(System.in);
        System.out.print("How Many Time : ");
        t = input.nextInt();
      for (int i=1;i<=t;i =i+2){
        System.out.println(i+"Bangladesh");
    }
    }
    
}
