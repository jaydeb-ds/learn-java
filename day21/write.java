import java.io.*;

import java.io.FileOutputStream;

public class write {
    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("write.txt");

            String data = "Hello Java Stream";
            fos.write(data.getBytes());

            fos.close();

            System.out.println("Data written successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
