package ProblemSolving4;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Messi10FCB {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashMap<String,Integer> h = new HashMap<String,Integer>();
        for (int i = 0; i < n; i++) {
           String s = scan.next();
          if(h.get(s)==null){
              h.put(s, 1);
          }else{
              h.put(s, h.get(s)+1);
          }
        }
        String r ="";
        int t = -1;
        
        for(Map.Entry<String,Integer> en: h.entrySet()){
            int k = en.getValue();
            if(k>t){
                t = k;
                r = en.getKey();
            }
        }
        System.out.println(r);
    }

}
