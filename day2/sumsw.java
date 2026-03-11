import javax.swing.JOptionPane;

public class sumsw {
    public static void main(String[] args){
		int a = Integer.parseInt(JOptionPane.showInputDialog("Enter the first Number"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Enter the second Number"));
		int s = a+b;

		System.out.println("the Result is "+s);
		JOptionPane.showMessageDialog(null,"The result is "+s);
	}
}
