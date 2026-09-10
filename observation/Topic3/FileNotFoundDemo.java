

import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class FileNotFoundDemo {

    public static void main(String[] args) {

        try {

            FileInputStream file =
                    new FileInputStream("student.txt");

            System.out.println("File Opened Successfully");

        }

        catch (FileNotFoundException e) {

            System.out.println("Exception Caught");
            System.out.println("File Not Found");
            System.out.println(e);

        }

        System.out.println("Program Continues");

    }

}

