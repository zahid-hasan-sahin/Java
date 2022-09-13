package problemSolving8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputApp {

    static int getInput() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();

    }

    public static void main(String args[]) throws Exception {
        try {
            int e = getInput();
            if (e < 0) {
                System.out.println("Negetive Integer found");
                throw new Exception("Negetive Integer found");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! You have to enter a number");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! You have to enter a number");
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
  
    }
}
