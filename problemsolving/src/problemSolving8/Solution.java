package problemSolving8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    public static void main(String args[]) throws FileNotFoundException, IOException {
        File f = new File("C:\\Users\\zahid\\Desktop\\New folder\\input.txt");
        Scanner scan = new Scanner(f);
        int n = scan.nextInt();
        


        FileWriter fw = new FileWriter("C:\\Users\\zahid\\Desktop\\New folder\\output.txt");

    }
}
