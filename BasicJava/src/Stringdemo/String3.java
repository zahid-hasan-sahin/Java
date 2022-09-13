
package Stringdemo;

public class String3 {
    public static void main(String[] args){
        String  name = "Zahid Hasan Sahin";
        System.out.println(name.replace("Z","s"));
        String[] n = name.split("h");
        for(String x:n){
            System.out.println(x);
        }
    }
    
}
