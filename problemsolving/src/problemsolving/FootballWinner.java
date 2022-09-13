
package problemsolving;

import java.util.HashMap;
import java.util.Scanner;

public class FootballWinner {
    @SuppressWarnings("empty-statement")
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        HashMap<String,Integer> goal = new HashMap<String,Integer>();
        int n = scan.nextInt();
        int tempRes = 0;
        String mainRes = "";
        while(n-->0){
            String s = scan.next();
            int temp = 0;
            try{
              temp = goal.get(s);
            }catch(Exception e){
                  temp = 0;
            }
            goal.put(s,++temp);     
            if(goal.get(s)>tempRes){
                tempRes = goal.get(s);
                mainRes = s;
            }
        }
        System.out.println(mainRes);      
    }
}
