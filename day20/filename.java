import java.io.*;

public class filename
{
	public static void main(String[] args)
	{
		File dir = new File("C:\\Users\\das29\\OneDrive\\Desktop\\learnJava\\day20\\test");

		String[] files = dir.list();

		System.out.println("files in this Directory");

		for(String filename : files)
		{
			if(filename.endsWith(".java"))
			{
				System.out.println(filename);
			}
		}
	}
}