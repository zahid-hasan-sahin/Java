
package FileDemo;
import java.io.File;
import java.util.Formatter;

public class Test {
    public static void main(String[] args){
        File f = new File("C:/Users/Zahid/Desktop/Test");
        try{
           
            if(f.mkdir()){
                System.out.println("Folder Has Been Created");
            }
            String path = f.getAbsolutePath();
          File t = new File(path+"/File.txt");
          if(t.createNewFile()){
              System.out.println("File Hasa Been Created In "+path);
          }
          Formatter w = new Formatter("C:/Users/Zahid/Desktop/Test/File.txt");
          w.format("%s %s\r\n","100","sahi jkjsd khkjsahdkfhkl jhksjhkfjlh kjhskjhfkjlsa hjkhkjashfkljhashsjkldf n");
          w.format("%d",4);
          w.close();
          
          
        
          
          
      
        }catch(Exception e){
            System.out.println("New Exception"+e);
        }
        
        
        
        
    }
    
}
