package book2.chapter8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileException1 {
    public static void main(String[] args) {
        openFile("c:/test.txt");
    }

    public static void openFile(String file) {
        try {
            FileInputStream f = new FileInputStream(file);
        } catch (FileNotFoundException error) {
        }catch(Exception error){
            System.out.println("file not found");
        }
    }
}
