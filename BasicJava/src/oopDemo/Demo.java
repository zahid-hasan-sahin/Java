package oopDemo;

import java.util.Arrays;

public class Demo {
    public static void main(String args[]){
        int[] a = {45,46,40,4,1,2,78};
       
        Arrays.sort(a);
        for(int k : a){
            System.out.println(k);
        }
                
    }
}
