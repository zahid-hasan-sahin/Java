
package Stringdemo;

public class Striong2 {
    public static void main(String[] args){
        String name = "    Zahid Hasan Sahin   ";
        System.out.println(name);
        name = name.trim();
        System.out.println(name);
        System.out.println(name.charAt(6));
        System.out.println(name.codePointAt(5));
        System.out.println(name.codePointBefore(6));
        System.out.println(name.lastIndexOf(" "));
    }
    
}
