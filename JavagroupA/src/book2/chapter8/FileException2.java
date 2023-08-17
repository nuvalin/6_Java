package book2.chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileException2 {

    public static void main(String[] args) {
        try {
            openFile("c:/test.txt");
        } catch (FileNotFoundException error) {
            System.out.println("File not found");
        }

    }

    public static void openFile(String file) throws FileNotFoundException{

            FileInputStream f = new FileInputStream(file);

    }
}
