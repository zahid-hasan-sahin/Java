package problemSolving2;

import java.util.Scanner;

public class AandBandTeamTraining {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int xp = scan.nextInt();
        int nb = scan.nextInt();
        int res = 0;
        
        while (xp > 0 && nb > 0) {
            int t = xp;
            if (xp >= nb && xp - 2 >= 0 && nb - 1 >= 0) {
                xp -= 2;
                --nb;
            } else if (nb >= xp && xp - 1 >= 0 && nb - 2 >= 0) {
                --xp;
                nb -= 2;
            }
            if(t==xp){
                break;
            }
            ++res;

        }
        System.out.println(res);

    }
}
