
package FileDemo;
import java.io.File;

public class CreateFile {
    public static void main(String [] args){
        
        File c = new File("D:/A.zip");
       try{
           c.createNewFile();
       }catch(Exception e){
           System.out.println(e);
       }
       
        
        
        
    }
    
}
