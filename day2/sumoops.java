import java.util.Scanner;

class Sum {
	int a,b,s=0;

	void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number ");
		a = sc.nextInt();
		System.out.println("Enter the Second number ");
		b = sc.nextInt();
		sc.close();
	}
	void cal(){
		s= a+b;
	}
	void display(){
			System.out.println("The sum is "+s);
		}
}

public class sumoops{
	public static void main(String[] args){
		   Sum s=new Sum();
		   s.input();
		   s.cal();
		   s.display();
		}
}