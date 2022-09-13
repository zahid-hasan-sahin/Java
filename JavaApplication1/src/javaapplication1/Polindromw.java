package javaapplication1;
import java.util.ArrayList;
import java.util.Scanner;
public class Polindromw {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter The String: ");
        String Get_input = scan.nextLine();
        char[] to_char = Get_input.toCharArray();
        String split_string = "";
        ArrayList<String> put_string = new ArrayList();
        for (int i = 0; i < to_char.length; i++) {
            for (int j = i + 1; j < to_char.length; j++) {
                if (to_char[i] == to_char[j]) {
                    split_string = Get_input.substring(i, j + 1);
                    put_string.add(split_string);
                }
            }
        }
        String reverse = "";
        for (String access_value : put_string) {
            for (int i = access_value.length() - 1; i >= 0; i--) {
                reverse = reverse + access_value.charAt(i);
            }
            if (reverse.equalsIgnoreCase(access_value)) {
                System.out.print(reverse + ",");
            }
            reverse = "";
        }
        System.out.println();
        
    }
}
