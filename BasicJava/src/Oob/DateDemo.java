
package Oob;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateDemo {
    public static void main(String[] args){
        Date d = new Date();
        DateFormat f = new SimpleDateFormat("dd/MM/YYYY");
       String s =f.format(d);
        System.out.println(s);
        
        
        
    }
      
    }
    

