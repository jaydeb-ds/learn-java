import java.io.*;

public class sumbuffer{
	
	public static void main(String[] args) throws IOException 
	{
		int a, b;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the First number");
		System.out.println("Enter the Second number");
		
		a = Integer.parseInt(br.readLine());
		b = Integer.parseInt(br.readLine());
		
		System.out.println("Result : "+(a+b));
		 
	}
}