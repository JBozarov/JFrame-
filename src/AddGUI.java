import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddGUI {

    public static void main(String[] args) {
        Addition obj = new Addition();

    }

}

class Addition extends JFrame implements ActionListener {
    JTextField t1, t2;
    JButton b, b2;
    JLabel l;

    public Addition() {

        t1 = new JTextField(20);
        t2 = new JTextField(20);
        b = new JButton("Ok");
        b2 = new JButton("SWITCH");
        l = new JLabel("Result");

        add(t1);
        add(t2);
        add(b);
        add(l);
        add(b2);

        b.addActionListener(this); // takes action listener when you call it every time it will call action performed
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new X();
                dispose();
            }
        });
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int n1 = Integer.parseInt(t1.getText());
        int n2 = Integer.parseInt(t2.getText());

        int value = n1 + n2;
        l.setText(String.valueOf(value));
    }
}

