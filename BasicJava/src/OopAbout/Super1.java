
package OopAbout;

public class Super1 extends Supar {
    int gear;
    Super1(String n,int w,int g){
       super(n,w); 
       gear = g;       
    }
    @Override
    void m(){
        super.m();
        System.out.println(gear);
        
    }
    
   
    
}
