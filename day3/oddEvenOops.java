import javax.swing.JOptionPane;

class OddEven{
	int n;
	void input(){
		 n = Integer.parseInt(JOptionPane.showInputDialog("Enter the number"));
		}
	void check(){
		if(n%2 == 0){
			JOptionPane.showMessageDialog(null,"Number is Even");
			}
		else{
			JOptionPane.showMessageDialog(null,"Number is Odd");
		}
	}
}

public class oddEvenOops{
	public static void main(String[] args){
		OddEven oe = new OddEven();
		oe.input();
		oe.check();
	}

}