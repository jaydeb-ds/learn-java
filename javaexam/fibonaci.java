package javaexam;
import javax.swing.JOptionPane;
public class fibonaci {
    public static void main(String[] args)
    {
        	int num = Integer.parseInt(JOptionPane.showInputDialog("Enter the number"));

        	int f = 0, s = 1, n;

        	for(int i=1; i<= num; i++)
        	{
				System.out.println(+f);
				n = f+s;
				f=s;
				s=n;
			}
    }
}
