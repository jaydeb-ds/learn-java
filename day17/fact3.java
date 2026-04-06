import java.io.*;

public class fact3{
	
	public static void main(String[] args) throws IOException 
	{
		int n, f=1;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the number : ");
		
		n = Integer.parseInt(br.readLine());
		
		 for(int i = 1; i <= n; i++) {
            f = f * i;
        }

        System.out.println("Factorial = " + f);
		 
	}
}