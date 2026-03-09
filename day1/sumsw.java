import javax.swing.JOptionPane;

public class sumsw {
    public static void main(String[] args) {
        // Get user input as strings
        String num1_str = JOptionPane.showInputDialog(null, "Enter the first number:");
        String num2_str = JOptionPane.showInputDialog(null, "Enter the second number:");

        // Convert strings to integers and calculate the sum
        int sum = Integer.parseInt(num1_str) + Integer.parseInt(num2_str);

        // Display the result
        JOptionPane.showMessageDialog(null, "The sum is: " + sum);
    }
}
