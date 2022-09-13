
package arreydemo;

public class Array6 {
    public static void main(String[] args){
    int [][] x = new int[4][5];
    int k=0;
        for (int row = 0; row< 4; row++) {
            for (int col = 0; col <5; col++) {
                x[row][col]=k;
                k++;
               
            }
            
        }
        for (int row = 0; row <4; row++) {
            for (int col = 0; col <5; col++) {
                 System.out.print(" "+ x[row][col]);
            }
             System.out.println();
        }
        
}
}
