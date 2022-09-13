
package Stringdemo;

public class String4 {
    public static void main(String[] args){
        String s = "zahid hasan sahin";
         
        StringBuffer name = new StringBuffer("zahid hasan sahin");
        name.append(" "+ (20+40));
        name.delete(0, 3);
        name.setLength(1);
        System.out.println(name);
    }
    
}
