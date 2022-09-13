
package ObjectOrientedPrigramming;

public class StaticVariable {
    static int count = 0;
    StaticVariable(){
        count++;
    }
    StaticVariable(int y){
        count++;
        
    }
    void printResult(){
        System.out.println(count);
    }
    
    
}
