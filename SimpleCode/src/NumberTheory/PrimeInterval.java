
package NumberTheory;

import java.util.Scanner;

public class PrimeInterval {
    public static boolean isPrime(int n){
        if(n==1)return false;
        for (int i = 2; i*i <=n; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int r = scan.nextInt();
        for (int i = l; i <=r; i++) {
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        
    }
    
}
