
package ProblemSolving;

public class Circel extends Shap {
    
    Circel(double num){
        super(num,num);
    }
    
    @Override
    void area(){
        double result =  Math.PI * num1 * num2;
         System.out.printf("Circel Area : %.2f ",result);
        
    }
  
    
}
