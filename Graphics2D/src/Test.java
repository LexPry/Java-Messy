import javax.swing.*;
import java.awt.*;

public class Test {
    JFrame f;
    MyPanel p;
    public Test() {
        f = new JFrame();
        // get the content area of panel
        Container c = f.getContentPane();
        // set the layout manager
        c.setLayout(new BorderLayout());
        p = new MyPanel();
        // add MyPanel object into container
        c.add(p);
        // set the size of the JFrame
        f.setSize(400, 400);
        // make the JFrame visible
        f.setVisible(true);
        // sets the close behaviour; EXIT_ON_CLOSE invokes System.exit(0) on closing the JFrame
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main( String[] args) {
        new Test();
    }
}