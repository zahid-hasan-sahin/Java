package basicjava;
import java.util.Scanner;
public class UserInput{
    public static void main(String [] args){
      Scanner Input = new Scanner(System.in);
      String name;
      System.out.print("ENTER YOUR NAME: ");
      name = Input.nextLine();
      System.out.println(name);
    }
    
}