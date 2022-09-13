
package arreydemo;

public class Array7 {
  public static void main(String[] args){  
      int k=1;
     int[][] num = new int[4][];  
     for (int i = 0; i < 4; i++) {
          num [i] = new int[i+1];
      }
            
      for (int row = 0; row <4; row++) {
          for (int col = 0; col <row+1; col++) {
              num[row][col] = k;
              k++;
          }
      }
           
      for (int row = 0; row <4; row++) {
          for (int col = 0; col <row+1; col++) {
              System.out.print(num[row][col]);
          }
          System.out.println();
      }
      
  }
}
