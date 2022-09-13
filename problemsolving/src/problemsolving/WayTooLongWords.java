
package problemsolving;

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        while(h>0){
        String word = scan.next();
        char[] c = word.toCharArray(); 
        if(word.length()>10){
            System.out.println(c[0]+""+(word.length()-2)+""+(c[word.length()-1]));
        }else{
            System.out.println(word);
        }
        h--;
    }
    }
    
}
