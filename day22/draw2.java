import java.awt.*;

public class draw2 extends Frame{

    public draw2()
    {
		setSize(600,400);
		setVisible(true);
	}

    public void paint(Graphics g)
    {
		g.drawLine(50,100,200,300);
	}

	public static void main(String[] args)
	{
		new draw2();
	}
}
