package problemsolving;


import java.util.Scanner;

public class OlesyaandRodion {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int t = scan.nextInt();
        String s = "";
        if(t==10){
            for (int i = 0; i < n-2; i++) {
                s = s + 2;
            }
            s = s + 10;
        }else{
            for (int i = 0; i < n; i++) {
                s = s + t;
            }
        }
        if(s.length()==n){
            System.out.println(s);
        }else{
            System.out.println("-1");
        }
        
    }

}
