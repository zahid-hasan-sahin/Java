
package Stringdemo;

public class String5 {
    public static void main(String[] args){
        String name = "121";
        StringBuffer n = new StringBuffer(name);
        String f= n.reverse().toString();
        if (name.equals(f)){
            System.out.println("POlyndrome");
        }else{
            System.out.println("Not A Polyndrome");
        }
    }
    
}
