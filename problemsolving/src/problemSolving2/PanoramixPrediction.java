package problemSolving2;

import java.util.ArrayList;
import java.util.Scanner;

public class PanoramixPrediction {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        ArrayList<Integer> primeNumber = new ArrayList<Integer>();
        for (int i = 1; i <= 50; i++) {
            boolean checkVisiblity = false;
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    checkVisiblity = true;
                    break;
                }
            }
            if(!checkVisiblity){
                primeNumber.add(i);
            }
            checkVisiblity = false;
        }if(n==47){
            System.out.println("NO");
        }else{
        if(primeNumber.get(primeNumber.indexOf(n)+1)==m){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
        }
    }

}
