import java.awt.*;

public class draw extends Frame {

	public draw(){
		setSize(600, 400);
		setVisible(true);
	}

	public void paint(Graphics g){
		g.drawLine(50, 100, 300, 300);
	}

	public static void main(String[] args){
		new draw();
	}
}

