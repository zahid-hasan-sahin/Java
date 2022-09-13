package FileDemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {

    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Zahid\\Desktop\\new.txt");
        FileWriter wr = new FileWriter(f);
        for (int i = 0; i < 100; i++) {
            wr.write("Hello java\r\n");
        }

        wr.close();

    }
}
