package problemsolving;

import java.util.Scanner;

public class IlyaandBankAccount {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        char[] input = scan.next().toCharArray();
        if (input[0] == '-') {
            if (input[input.length - 1] > input[input.length - 2]) {
                for (int i = 0; i < input.length; i++) {
                    if (i == input.length - 1) {
                        continue;
                    } else {

                        if (input.length == 3 && input[2] == '0') {
                            System.out.print("0");
                            break;
                        } else {
                            System.out.print(input[i]);
                        }
                    }
                }
            } else {
                for (int i = 0; i < input.length; i++) {
                    if (i == input.length - 2) {
                        continue;
                    } else {
                        if (input.length == 3 && input[2] == '0') {
                            System.out.print("0");
                            break;
                        } else {
                            System.out.print(input[i]);
                        }
                    }
                }
            }
        } else {
            for (char p : input) {
                System.out.print(p);
            }
        }
        System.out.println();
    }

}
