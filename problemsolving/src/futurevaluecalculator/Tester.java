package futurevaluecalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//display a welcome message
        System.out.println("Welcome to the Future Value Calculator");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get input from the user
            FutureValueCalculator ob = new FutureValueCalculator();
            System.out.print("Enter monthly investment:  ");
            ob.setMonthlyInvestment(Double.parseDouble(sc.nextLine()));

            System.out.print("Enter yearly interest rate:  ");
            ob.setYearlyInterestRate(Double.parseDouble(sc.nextLine()));

            System.out.print("Enter number of years:  ");
            ob.setYears(Integer.parseInt(sc.nextLine()));

            //convert yearly value to monthly value
            double res = ob.calculate();
            //Format and display the result
            System.out.println("Future Value:   "
                    + NumberFormat.getCurrencyInstance().format(res));
            System.out.println();

            //see if the user wants to continue
            System.out.print("Continue?  (y/n): ");
            choice = sc.nextLine();
            System.out.println();

        }
        System.out.println("bye!");
    }

}
