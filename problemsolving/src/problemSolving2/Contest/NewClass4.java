package problemSolving2;

import java.util.Scanner;

public class NewClass4 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        StringBuffer sb = new StringBuffer();
        while(t-->0){
            int n = scan.nextInt();
            if(n%2==0){
                String str ="1";
                String res = str.repeat(n/2);
                
                sb.append(res+"\n");
            }else{
                String str = "1";
                
                 String res = "7";
                 res += str.repeat((n-3)/2);
                
              
                sb.append(res+"\n");
                
            }
        }
        System.out.println(sb);
        

    }

}
