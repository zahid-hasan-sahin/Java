
package problemsolving;

import java.util.Scanner;

public class NewYearGarland {
    public static void main(String args[]){
        Scanner scan  =  new Scanner(System.in);
        int n = scan.nextInt();
        while(n-->0){
            int r = scan.nextInt();
            int g = scan.nextInt();
            int b = scan.nextInt();
            if(Math.abs(r-g)>2 && Math.abs(g-b)>2 || (Math.abs(r -b) >2) && (Math.abs(g -b) >2) || (Math.abs(r -b) >2) && (Math.abs(g -b) >2)){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
        
    }
    
}
