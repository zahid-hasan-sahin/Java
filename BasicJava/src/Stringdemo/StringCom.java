
package Stringdemo;

public class StringCom {
    public static void main(String[] args){
    String a = "SAhin1234";
    String b = "Sahin1234";
    String c = new String("Sahin1234");
    String d = new String("Sahin1234");
    System.out.println(a.equals(b));
    System.out.println(a==b);
    System.out.println();
    System.out.println(b.equals(c));
    System.out.println(b==c);  
    System.out.println();
    System.out.println(c.equals(d));
    System.out.println(c==d);
    System.out.println();
    System.out.println(a.equalsIgnoreCase(b));
    System.out.println(b==a);
    System.out.println();
   
    
    
    } 
}
