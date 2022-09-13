package problemSolving2;

import java.util.Scanner;

public class RestoringThreeNumbers {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int[] val = new int[4];
        int max = 0;
        for (int i = 0; i < 4; i++) {
            val[i] = scan.nextInt();
            if(val[i]>val[max]){
                max = i;
            }
        }
        for (int i = 0; i < 4; i++) {
            if(i!=max){
                System.out.print(val[max]-val[i]+" ");
            }
        }
        
       System.out.println();
        
        
        
    }

}
