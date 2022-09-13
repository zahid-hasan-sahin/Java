package FileDemo;
import java.io.File;
class FileTest{
    public static void main(String [] args){
        
        File f = new File("C:/Users/Zahid/Desktop/Run");
        f.mkdir();
       
       boolean t = f.isDirectory();
       System.out.println(f.getName());
       System.out.println(t);
       String path = f.getAbsolutePath();
        System.out.println(path);
        f.delete();
       System.out.println(f.canExecute()); 
       System.out.println(f.exists()); 
       System.out.println(); 
       System.out.println(); 
            
        
        
       
        
        
        
    }
}
        