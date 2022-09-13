package problemSolving2;

import java.util.Scanner;

public class DeathNote {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] wrightCount = new int[n];
        int pages = 0;
        for (int i = 0; i < n; i++) {
            wrightCount[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
           int temp = pages;
           System.out.println(temp+" temp");
            pages = (temp+wrightCount[i]) / m;
            double tempCom = (double)(temp+wrightCount[i]) / m;
            if(tempCom==pages){
                ++pages;
            }
            System.out.println(pages-1>0?pages+" ":0+" ");
            pages = (pages+wrightCount[i]) % m;

        }
        System.out.println();

    }

}
