package problemSolving2;

import java.util.Scanner;

public class PlayingwithDice {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int posOfA = 0;
        int posOfB = 0;
        int posOfDraw = 0;
        for (int i = 1; i <= 6; i++) {
            if(Math.abs(a-i)<Math.abs(b-i)){
                ++posOfA;
            }else if(Math.abs(a-i)>Math.abs(b-i)){
                ++posOfB;
            }else{
                ++posOfDraw;
            }
        }
        System.out.println(posOfA+" "+posOfDraw+" "+posOfB);

    }

}
