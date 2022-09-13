
package basicjava;
public class BreakDemo {
    public static void main(String [] args){
        for (int i=1;i<=10;i=i+2){
            System.out.println(i);
            if(i>5){
                break;
            }
        }
    }
    
}
