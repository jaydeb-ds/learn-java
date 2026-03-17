
class student{
		String name;
		int rollno;

		float total, avg;

		int sub1, sub2, sub3 ,sub4, sub5; //subject marks;

		student(String n, int r)
		{
			name = n;
			rollno = r;
		}

		void stdmarks(int s1, int s2, int s3, int s4, int s5)
		{
			sub1 = s1;
			sub2 = s2;
			sub3 = s3;
			sub4 =s4;
			sub5 = s5;
		}

		void cal()
		{
			total = sub1 + sub2 + sub3 + sub4 + sub5;
			avg = total / 5;
		}


		void display()
		{
			System.out.println("Name of the student is : " +name);
			System.out.println("Roll No of the student is : " +rollno);
			System.out.println("Total mark : " +total);
			System.out.println("Average mark : " +avg);

		}
	}

public class itstd{
	public static void main(String[] args)
	{
		student s1 = new student("Jaydeb",7);
		s1.stdmarks(80, 78, 76, 55, 67);
		s1.cal();
		s1.display();
	}
}