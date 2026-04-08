import javax.swing.JOptionPane;

public class fact4 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter the Number"));
        int f= 1;

        for(int i = 1; i <= n; i++) {
            f = f * i;
        }

        System.out.println("Factorial is = " +f);
    }
}