import javax.swing.JOptionPane;

class prime{
	int num;
	int f=0;
	void input(){
		num = Integer.parseInt(JOptionPane.showInputDialog("Enter any number"));
		}

	void check(){
		for(int i = 2; i<= num/2; i++){
				if(num%i == 0){
						f= 1;
						break;
					}
			}
			if(f == 0){
				System.out.println("Prime");
			}
			else{
				System.out.println("not prime");
			}
		}

	}

public class primeOops{

	public static void main(String[] args){
		prime p = new prime();

		p.input();
		p.check();
		}

	}