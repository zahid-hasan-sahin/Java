
package OopAbout;

public class PolymorphismTest {
    public static void main(String [] args){
        PolymorphesmShap[] s = { new PolymorphismTriangle(10,20),new PolymorphismRectaangle(10,20)};
  
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].Shap());
            
        }
    
        
        
        
    }
    
}
