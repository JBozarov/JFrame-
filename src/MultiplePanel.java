import javax.swing.*;
import java.awt.*;

public class MultiplePanel extends JFrame {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Practice");
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();

        JButton click = new JButton("CLICK");
        JButton click2 = new JButton("CLICK");
        JButton click3 = new JButton("CLICK");
        JButton click4 = new JButton("CLICK");
        JLabel text = new JLabel("Click to do ");

        p1.setBackground(Color.BLUE);
        p2.setBackground(Color.YELLOW);
        p1.add(click);
        p2.add(click2);
        p2.add(click3);
        p2.add(click4);

        jFrame.add(p1, BorderLayout.CENTER);
        jFrame.add(p2, BorderLayout.PAGE_END);

        jFrame.setSize(400, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);


//        jFrame.setSize(400, 400);
//        jFrame.setVisible(true);
//        jFrame.setBackground(Color.blue);
//        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        JButton b1 = new JButton("Click 1");
//        JButton b2 = new JButton("Click 2");

//        JPanel panel = new JPanel();
//        panel.setSize(200, 200);
//        panel.setVisible(true);
//        panel.add(b1);
//        panel.add(b2);
//
//        jFrame.add(panel);
//        jFrame.add(b1, BorderLayout.PAGE_END);
//        jFrame.add(b2);


    }
}
