package Oob;
import java.util.Scanner;
public class DecimalToBinary {

    public static void main(String[] args){
        //Decimal To Binary
        Scanner input = new Scanner(System.in);
        System.out.print("Plese Enter The Number: ");
        int d = input.nextInt();
            
            String b = Integer.toBinaryString(d);
            System.out.println("Binary: "+b);
        //Decimal TO Octal
             
              String n = Integer.toOctalString(d);
              System.out.println("Octal: "+ n);
        //Decimal To HexaDecimal
              
              String s = Integer.toHexString(d);
              System.out.println("HexaDesimel: "+s);

}
    
}
