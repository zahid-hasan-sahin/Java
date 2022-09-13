package javaapplication1;

import java.util.Scanner;

public class prefixes {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int[] input = new int[4];
        System.out.print("Please Enter The Number: ");
        for (int i = 0; i < input.length; i++) {
            input[i] = scan.nextInt();
        }

            for (int i = 0; i < input.length - 2; i++) {
                for (int j = 0; j < input.length - 2; j++) {
                    if (input[i] + input[j] == input[i + j] + input[j + 1]) {
                        System.out.println(input[i]+input[j]);
                        System.out.println(input[i+1]+input[j+1]);
                        System.out.println("yes");

                    } else {
                        System.out.println(input[i]+"+"+input[j]+"="+input[i]+input[j]);
                        System.out.println(input[i+1]+input[j+1]+"="+input[i+1]+input[j+1]);
                        System.out.println("No");

                    }

                }
            }

        }

    }
