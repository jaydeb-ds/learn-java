

public class ArrExp {
 	public static void main(String[] args)
 	{
		int x[] = new int[10];

		try {
			x[20] = 200;
			System.out.println("Value of x[20] is : "+x[20]);
		}
		catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index is out of range");
        }
        finally
        {
            System.out.println("program Continue....");
        }
	}
}
 