import java.util.Scanner;

public class sumscanner{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("enter the First number");
		int a = sc.nextInt();

		System.out.println("Enter the Second number");
		int b = sc.nextInt();

		System.out.println("result : "+(a+b));
	}
}