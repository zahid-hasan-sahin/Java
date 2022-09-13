
package TypeCasting;

public class AnnoymouseTest {
    public static void main(String[] args){
        
        Annnoymouse ob = new Annnoymouse();
        ob.m();
        Annnoymouse ob1 = new Annnoymouse(){
           @Override
           void m(){
               System.out.println("THis IS From secound");
               
           }
           
    };
        ob1.m();
       
    }
    
    }
    

