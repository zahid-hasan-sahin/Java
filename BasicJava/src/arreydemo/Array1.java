
package arreydemo;

public class Array1 {
    public static void main(String[] args){
        int[] num = new int[5];
        int r=0;
        num[0]=0;
        num[1]=1;
        num[2]=2;
        num[3]=3;
        num[4]=7;
        for (int i = 0; i <5; i++) {
                      
            r = r + num[i];
             
        }
        System.out.println(r);
        
       
       
    }
    
}
