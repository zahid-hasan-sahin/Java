
package javaswing;

import java.io.File;

public class After {
    public static void main(String args[]){
        
        for(int i=0;i<=10;i++){
            File f = new File("C:/Users/Zahid/Desktop/sahin"+i);
        f.delete();
        }
       
        
    }
    
}
