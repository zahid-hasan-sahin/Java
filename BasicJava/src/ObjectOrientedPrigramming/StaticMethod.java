
package ObjectOrientedPrigramming;

public class StaticMethod {
   static int x;
    
    void m1(){
       
        System.out.println("This Is Not A Static Method ");
         m2();
          System.out.println( x);
    }
    static void m2(){
        System.out.println( x);
        
        System.out.println("This IS A Static Method");
    }

  
    
}
