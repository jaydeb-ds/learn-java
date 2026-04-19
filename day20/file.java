import java.io.*;

public class file
{
	public static void main(String[] args)
	{
		File f = new File("test.txt");

		System.out.println("Exists: "+f.exists());
		System.out.println("Readable: "+f.canRead());
		System.out.println("Writable: "+f.canWrite());
		System.out.println("is File: "+f.isFile());
		// System.out.println("is Directory: "+f.isDirectory());
		System.out.println("File Size: "+f.length());


		File dir = new File("test");

		System.out.println("is F1 Directory: "+dir.isDirectory());

		String[] files = dir.list();
		//  System.out.println("Files in directory:");
		 for(String name : files) {
			 System.out.println(name);
        }

	}
}