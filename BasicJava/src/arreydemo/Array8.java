
package arreydemo;

import java.util.Arrays;

public class Array8 {
    public static void main(String[] args){
        int[] num = {2,5,3,3,5,65,5,33};
        
        Arrays.sort(num);
        System.out.print("Accending: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(" "+num[i]);
        }
        System.out.println();
        System.out.print("Deccendin: ");
        for (int x:num) {
            System.out.print(x);
        }
        System.out.println();
        String[] name = {"sahin","zahid","hasan"};
        Arrays.sort(name);
          System.out.print("Accending: ");
        for (int i = 0; i < name.length; i++) {
            System.out.print(" "+name[i]);
        }
        System.out.println();
        System.out.print("Deccendin: ");
        for (int i = name.length-1; i>=0; i--) {
            System.out.print(" "+name[i]);
        }
        System.out.println();
    }
    
}
