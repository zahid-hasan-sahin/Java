package problemsolving;

import java.util.Arrays;
import java.util.Scanner;
public class TheNewYearMeetingFriends {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int[] pos = new int[3];
        for (int i = 0; i <=2; i++) {
            pos[i] = scan.nextInt();
        }
        Arrays.sort(pos);      
        System.out.println((pos[1]-pos[0])+(pos[2]-pos[1]));
    }
    
}
