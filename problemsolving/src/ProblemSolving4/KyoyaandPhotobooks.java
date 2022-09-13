
package ProblemSolving4;

import java.util.Scanner;

public class KyoyaandPhotobooks {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);        
        String s = scan.next();
        System.out.println(26*(s.length()+1)-s.length());
    }
}
