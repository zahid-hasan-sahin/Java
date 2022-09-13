
package Oob;

public class StringToPrimitive {
    public static void main(String[] args){
        //Stirng To Primitve
        
        String name = "34";
        System.out.println(name+5);
        double a =Double.valueOf(name);
        System.out.println(a+5);
        
        //Primitive To String
        int i = 34;
        System.out.println(i+6);
        String m = Integer.toString(i); // String m = String.valueOf(i);
        System.out.println(m+6);
        
    }
    
}
