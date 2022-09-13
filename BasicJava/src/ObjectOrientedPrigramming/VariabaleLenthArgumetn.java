
package ObjectOrientedPrigramming;

public class VariabaleLenthArgumetn {
     VariabaleLenthArgumetn(int ... num){
        int sum = 0;
         for (int i = 0; i <num.length; i++) {
             sum = sum+num[i];
             
         }
         System.out.println(sum);
        
        
    }
    
}
