import java.text.DecimalFormat;

public class nullExp
{
	public static void main(String[] args)
	{
		//DecimalFormat d = new DecimalFormat("#.00");
		DecimalFormat d = null;
		try
		{
			String num = d.format(123.456);
			System.out.println(num);
		}
		catch(Exception e)
		{
			System.out.println("DecimalFormat object is not initialized");
		}
	}
}