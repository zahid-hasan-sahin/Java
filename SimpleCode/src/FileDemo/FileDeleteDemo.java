package FileDemo;

import java.io.File;

public class FileDeleteDemo {

    public static void main(String[] args) {
        File f = new File("C:\\Users\\Zahid\\Desktop\\new.xlsx");
        f.delete();
    }
}
