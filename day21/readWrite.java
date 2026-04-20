import java.io.*;

public class readWrite
{
	public static void main(String[] args)
	{
		// read file
		String data = "";
		try{

			FileInputStream fis = new FileInputStream("read.txt");

			int i = fis.read();

			while( i != -1)
			{
				char c = (char) i;
				data = data + c;
				//System.out.print(c);
				i = fis.read();
			}

			System.out.print(data);
			fis.close();
		}
		catch(Exception e)
		{
			System.out.println("file read error");
		}

		// write file
		try
		{
			FileOutputStream fos = new FileOutputStream("write.txt");

			//String data = "hello i am jaydeb ";

			fos.write(data.getBytes());

			fos.close();

			System.out.println("data write in the file");
		}
		catch(Exception e)
		{
			System.out.println("\n Data write error");
		}

	}
}
