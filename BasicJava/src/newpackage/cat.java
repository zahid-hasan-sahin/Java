
package newpackage;
import java.io.File;
import java.io.PrintStream;
public class cat {
    public static void main(String args[]){
        int[][][] f = new int[3][4][5];
        int p = 0;
        System.out.println(f.length);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                     f[i][j][k] = p;
                     p++;
                    }
                }
            }
         for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                     System.out.print(f[i][j][k]);
                    }
                System.out.println();
                }
            }
        
        
        
        
    }

    
    
}
