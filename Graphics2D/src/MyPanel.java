import javax.swing.*;
import java.awt.*;
// MyPanel extends JPanel, which will be placed in a JFrame


public class MyPanel extends JPanel {
    // custom painting is performed by paintComponent method
    @Override
    public void paintComponent(Graphics g) {
        // clear the previous painting
        super.paintComponent(g);
        // cast Graphics to Graphics2D
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.RED); // sets Graphics2D color
        // draw the rectangle
        g2.drawRect(0, 0, 100, 100);
        g2.setColor(Color.BLUE);
        g2.fillRect(200, 0, 100, 100);
        g2.drawOval(0, 0, 20, 20);
        g2.fillOval(50, 50, 20, 20);
    }
}
