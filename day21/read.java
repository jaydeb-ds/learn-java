import java.io.*;

public class read {
    public static void main(String[] args)
    {
		   try {
            FileInputStream fis = new FileInputStream("text.txt");

            int i=fis.read();
            // System.out.println("i = "+i);
            while (i != -1) {
                char c = (char)i;
                System.out.print(c);
                i = fis.read();
            }

            fis.close();
        } catch (Exception e) {
            System.out.println(e);
        }
	}
}
