package Assignment3;

import java.util.Scanner;



class Calculator {

    private double result;
    private double precision = 0.0001;
    double mem;

      static void start() {
        Calculator clerk = new Calculator();
        try {
            System.out.println("Calculator is on.");
            System.out.println("Format of each line: ");
            System.out.println("Operator space number");
            System.out.println("For example: + 3");
            System.out.println("To end enter the letter e.");
            System.out.println("c for clear");
            System.out.println("m for save in memory");
            System.out.println("r for recall memory");
       
            clerk.doCalculation();
        } catch (UnknownOpException e) {
            clerk.handleUnknownOpException(e);
        } catch (DivideByZeroException e) {
            clerk.handleDivideByZeroException(e);
        }
        System.out.println("The final result is"
                + clerk.getResult());
        System.out.println("Calculator program ending.");
    }

    public Calculator() {
        result = 0;
    }

    public void handleDivideByZeroException(
            DivideByZeroException e) {
        System.out.println("Dividing by zero.");
        System.out.println("Program aborted");
        System.exit(0);
    }

    public void handleUnknownOpException(
            UnknownOpException e) {
        System.out.println(e.getMessage());
        System.out.println("Try againg from the beginning");
        try {
          System.out.println("Calculator is on.");
            System.out.println("Format of each line: ");
            System.out.println("Operator space number");
            System.out.println("For example: + 3");
            System.out.println("To end enter the letter e.");
            System.out.println("c for clear");
            System.out.println("m for save in memory");
            System.out.println("r for recall memory");
            doCalculation();
        } catch (UnknownOpException e2) {
            System.out.println(e2.getMessage());
            System.out.println("Try again at some other time.");
            System.out.println("Program ending.");
            System.exit(0);
        } catch (DivideByZeroException e3) {
            handleDivideByZeroException(e3);
        }

    }

    public void doCalculation() throws DivideByZeroException, UnknownOpException {
        Scanner keyboard = new Scanner(System.in);
        boolean done = false;
        result = 0;
        System.out.println("result = " + result);
      
        while (!done) {
            char nextOp = (keyboard.next()).charAt(0);
            if ((nextOp == 'e') || (nextOp == 'E')) {
                done = true;
            }else if((nextOp == 'c')){
                result = 0;
                System.out.println("Result reset to 0");
            }else if((nextOp == 'm')){
                System.out.println("saved in memory");
               mem = result;
            }else if((nextOp == 'r')){
                System.out.println("recalled memory value = "+mem);
            }else {
                double nextNumber = keyboard.nextDouble();
                result = evaluate(nextOp, result, nextNumber);
                System.out.println("result " + nextOp + " "
                        + nextNumber + " = " + result);
                System.out.println("updated result = " + result);
            }
        }
    }

    public double evaluate(char op, double n1, double n2)
            throws DivideByZeroException, UnknownOpException {
        double answer;
        switch (op) {
            case '+':
                answer = n1 + n2;
                break;
            case '-':
                answer = n1 - n2;
                break;
            case '*':
                answer = n1 * n2;
                break;
            case '/':
                if ((precision < n2) && (n2 < precision)){
                    throw new DivideByZeroException();
                }
                answer = n1 / n2;
                    break;
            default:
            throw new UnknownOpException(op);
        }return answer;
    }
    public double getResult(){
         return result;
    }
}

 class UnknownOpException extends Exception{
        public UnknownOpException(){
            super("UnknownOpException");
        }

        public UnknownOpException(char op) {
             super(op + " is an unknown operator.");
        }
        public UnknownOpException(String message) {
        super(message);
     }
}
 class DivideByZeroException extends Exception{
         public DivideByZeroException(){  
            super("Dividing by Zero!");
        }
        public DivideByZeroException(String message){
            super(message);
       }
}
class AdvanceCalculator extends Calculator{
    public static void main(String[] args) {
      
        start();
    }
}