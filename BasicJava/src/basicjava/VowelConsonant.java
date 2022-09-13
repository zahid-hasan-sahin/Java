
package basicjava;
import java.util.Scanner;
public class VowelConsonant {
    public static void main(String [] args){
        char ch;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Charactar : ");
        ch = input.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u' || ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u' ){
            System.out.println("THIS IS VOWEL");
            
            
        }else{
            System.out.println("THIS IS CONTIONATNT");
        }
    }
}
