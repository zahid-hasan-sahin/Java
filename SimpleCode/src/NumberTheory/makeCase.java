package NumberTheory;

import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class makeCase {

    public static void main(String[] args) {
        try {
            FileWriter w = new FileWriter("C:\\Users\\zahid\\Desktop\\Problem\\9out.txt");
            int c = 0;
            String s = "8";
            for (int i = 0; i < 1000000; i++) {
                ++c;
                w.write(s + "\r\n");
            }
            System.out.println(c);
            w.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
