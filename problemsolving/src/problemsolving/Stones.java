package problemsolving;

import java.util.Scanner;

public class Stones {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(a+b>=b+c){
            int k =a*b/2+(b/2)*2;
             b = b - (b/2)*2;
            int p = b*c/2+(c/2)*2;
            System.out.println(k+p);
        }else{
            int k =b*c/2+(c/2)*2;
             b = b*c/2;
            int p = b*a/2+(a/2)*2;
            System.out.println(k+p);
        }
        
    }
}
