package problemsolving;

import java.util.Scanner;

public class BeautifulMatrix {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = scan.nextInt();

            }

        }
        int row = 0;
        int col = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] == 1) {
                    row = i;
                    col = j;
                }
            }
        }
        int ans = 0;
        if (row > 2) {
            ans = ans +(row-2);
        }else{
            ans = ans + (2-row);
        }if(col > 2){
            ans = ans +(col-2);
        }else{
            ans = ans + (2-col);
        }
        System.out.println(ans);

    }

}
