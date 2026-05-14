import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Calculation extends Applet implements ActionListener
{
    TextField T1, T2, T3;
    Label L1, L2, L3;
    Button B1, B2, B3, B4;

    String msg = " ";

    public void init()
    {
        L1 = new Label("Enter First Number");
        add(L1);

        T1 = new TextField(15);
        add(T1);

        L2 = new Label("Enter Second Number");
        add(L2);

        T2 = new TextField(15);
        add(T2);

        L3 = new Label("Result");
        add(L3);

        T3 = new TextField(15);
        add(T3);

        B1 = new Button("Add");
        add(B1);

        B2 = new Button("Sub");
        add(B2);

        B3 = new Button("Mul");
        add(B3);

        B4 = new Button("Div");
        add(B4);

        B1.addActionListener(this);
        B2.addActionListener(this);
        B3.addActionListener(this);
        B4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        int x = Integer.parseInt(T1.getText());
        int y = Integer.parseInt(T2.getText());

        if(e.getSource() == B1)
        {
            int sum = x + y;
            T3.setText(" " + sum);
        }

        if(e.getSource() == B2)
        {
            int sub = x - y;
            T3.setText(" " + sub);
        }

        if(e.getSource() == B3)
        {
            int mul = x * y;
            T3.setText(" " + mul);
        }

        if(e.getSource() == B4)
        {
            int div = x / y;
            T3.setText(" " + div);
        }

        showStatus("Result is Displayed");
        repaint();
    }
}