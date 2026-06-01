class box{
	int a, b, area;
	box()
	{
		a = 2;
		b = 3;
		area = a*b;
	}

	box(int a)
	{
		area = a*a;
	}

	box(int a, int b)
	{
		area = a * b;
	}

	void display()
	{
		System.out.println("Area of the box is "+area);
	}
}
public class cons{

	public static void main(String[] args)
	{
		box b1 = new box();
		box b2 = new box(5);
		box b3 = new box(5,6);
		b1.display();
		b2.display();
		b3.display();
	}
}