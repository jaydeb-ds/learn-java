import java.util.Scanner;


class Fibo {
	int r;
	void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range");
		r = sc.nextInt();
	}

	void cal(){
		int f = 0, s = 1, n;
		System.out.println("the Fibonaci Series :");
		for (int i = 1; i<=r; i++){
				System.out.println(+f);
				n=f+s;
				f=s;
				s=n;
			}
		}

}


public class fiboOops{
		public static void main(String[] args){
			Fibo f = new Fibo();
			f.input();
			f.cal();
		}

	}