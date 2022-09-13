package problemSolving2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DivisorsofTwoIntegers {
    
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            nums.add(scan.nextInt());
            
        }
        Collections.sort(nums);
        
        if (nums.get(n - 1).equals(nums.get(n - 2))) {
            
            System.out.println(nums.get(n - 1) + " " + nums.get(n - 1));
        } else {
            int firstNum = nums.get(n - 1);
            int lastNum = 0;
            for (int i = nums.size() - 1; i >= 0; i--) {
                if (firstNum % nums.get(i) != 0 || nums.get(i) == nums.get(i - 1)) {
                    lastNum = nums.get(i);
                    break;
                }
            }
            System.out.println(firstNum + " " + lastNum);
            
        }
        
    }
}
