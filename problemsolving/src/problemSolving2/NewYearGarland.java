
package problemSolving2;

import java.util.Scanner;

public class NewYearGarland {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0){
            int r = scan.nextInt();
            int g = scan.nextInt();
            int b = scan.nextInt();
            if(r+g+1<b || g+b+1<r || r+b+1<g){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
        
    }
    
}
