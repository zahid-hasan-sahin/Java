package problemsolving;

import java.util.Scanner;

public class AntonandDanik {

    public static void main(String agrs[]) {
        Scanner scan = new Scanner(System.in);
        int game = scan.nextInt();
        String s = scan.next();
        int antom = 0;
        int danik = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                antom++;
            } else {
                danik++;
            }

        }
        if(antom>danik){
            System.out.println("Anton");
        }else if(danik>antom){
            System.out.println("Danik");
        }else{
            System.out.println("Friendship");
        }

    }
}
