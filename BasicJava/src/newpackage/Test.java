package newpackage;

import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String args[]){
      
        try{
        File f = new File("D:/programing/java/Java_Bangla_Tutorials_6___Comments.mp4");
        Scanner s = new Scanner(f);
        while(s.hasNext()){
            String id = s.next();
            String name = s.next();
            System.out.println("Id: "+id+"\tName: "+name);
            
            
        }
        s.close();
        
        }catch(Exception e ){          
            System.out.println(e);
        }
        
    }

    

}
