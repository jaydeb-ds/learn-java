import java.awt.*;

public class draw extends Frame {

    public draw() {
        setSize(400, 500);
        setVisible(true);
    }

    public void paint(Graphics g) {
        Color c = new Color(22, 34, 200);
        
        g.setColor(c);
        g.drawLine(50, 100, 300, 100);
    }

    public static void main(String[] args) {
        new draw();
    }
}