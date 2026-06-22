import java.text.DecimalFormat;

public class Test{
	public static void main(String[] args)
	{
		int x[] = new int[10];

		try
		{
			x[20] = 20;
			System.out.println(x[20]);
		}
		catch(Exception e)
		{
			System.out.println("ERROR");
		}
	}
}