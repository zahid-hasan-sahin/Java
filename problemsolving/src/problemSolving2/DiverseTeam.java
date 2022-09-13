package problemSolving2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class DiverseTeam {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int numOfStudent = scan.nextInt();
        int studentOfATeam = scan.nextInt();
        HashSet<Integer> team = new HashSet<Integer>();
        ArrayList<Integer> memPos = new ArrayList<Integer>();
        for (int i = 0; i < numOfStudent; i++) {
            int in = scan.nextInt();
            if(!team.contains(in)){
                memPos.add(i+1);
                team.add(in);
            }
            
        }
        if (team.size() >= studentOfATeam) {
            System.out.println("YES");
            for (int i = 0; i < studentOfATeam; i++) {
                System.out.print(memPos.get(i)+" ");
            }
        }else{
            System.out.print("NO");
        }
        System.out.println();

    }

}
