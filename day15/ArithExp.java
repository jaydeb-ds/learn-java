public class ArithExp{
	public static void main(String[] args)
	{
		int a = 10, b = 0;

		try{
            int d = a/b;
			System.out.println("Value of D is : "+d);
		}
		catch(Exception e)
        {
            System.out.println("can't divide by zero");
        }

	}
}
