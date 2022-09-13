
package problemsolving;

import java.util.Scanner;

public class VustheCossackandaContest {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n =  scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();
        if(n<=m && n<=k){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
