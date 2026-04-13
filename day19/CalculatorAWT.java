import java.awt.*;
import java.awt.event.*;

public class CalculatorAWT extends Frame implements ActionListener {

    Label l1, l2, l3;
    TextField t1, t2, t3;
    Button b1, b2, b3, b4;

    public CalculatorAWT() {

        // Labels
        l1 = new Label("Enter First Number:");
        l2 = new Label("Enter Second Number:");
        l3 = new Label("Result:");

        // TextFields
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();

        // Buttons
        b1 = new Button("Add");
        b2 = new Button("Subtract");
        b3 = new Button("Multiply");
        b4 = new Button("Divide");

        // Set Layout
        setLayout(new GridLayout(5, 2));

        // Add components
        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(b1); add(b2);
        add(b3); add(b4);

        // Add Action Listener
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        // Frame settings
        setSize(300, 300);
        setTitle("Simple Calculator");
        setVisible(true);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {

        double num1 = Double.parseDouble(t1.getText());
        double num2 = Double.parseDouble(t2.getText());
        double result = 0;

        if (e.getSource() == b1) {
            result = num1 + num2;
        } 
        else if (e.getSource() == b2) {
            result = num1 - num2;
        } 
        else if (e.getSource() == b3) {
            result = num1 * num2;
        } 
        else if (e.getSource() == b4) {
            if (num2 != 0)
                result = num1 / num2;
            else {
                t3.setText("Cannot divide by zero");
                return;
            }
        }

        t3.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        new CalculatorAWT();
    }
}