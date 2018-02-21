package Himanshu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo implements ActionListener {
    private static JLabel uField;



    public static void main(String[] args) {
        JFrame f1 = new JFrame();
        JPanel p1 = new JPanel();
        f1.add(p1);

        Demo.uField = new JLabel("Hello World");
        JButton b1 = new JButton("Change Text");
        JButton b2 = new JButton("New Window");
        p1.add(Demo.uField);
        //p1.add(Demo.pField);
        p1.add(b1);
        b1.addActionListener(new Demo());
        p1.add(b2);
        b1.setForeground(Color.red);

        f1.setSize(500, 600);
        f1.setVisible(true);

        f1.setSize(500,600);
        f1.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Demo.uField.setForeground(Color.red);

    }
}
