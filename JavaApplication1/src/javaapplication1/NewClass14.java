package javaapplication1;

public class NewClass14 {

    public static void printWithCondition(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        }
        if (num % 3 == 0) {
            System.out.println("Fizz");
        }
        if (num % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }
    }

    public static void main(String args[]) {
        for (int i = 1; i <= 100; i++) {
            printWithCondition(i);
        }
    }

}
