package Temp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo11 implements ActionListener {

    private JLabel l1;
    private JButton b1;
    private JButton b2;
    private JTextField t1;
    private JButton b3;

    public static void main(String[] args) {
        Demo11.createNewWindow();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       this.l1.setForeground(Color.red);
    }

    private static void createNewWindow() {
        JFrame f1 = new JFrame();
        JPanel p1 = new JPanel();

        f1.add(p1);

        JFrame f2 = new JFrame();
        JPanel p2 = new JPanel();

        f2.add(p2);

        Demo11 d1 = new Demo11();
        d1.l1 = new JLabel("Hello World");
        d1.b1 = new JButton("Change Color");
        d1.b2 = new JButton("New Window");
        d1.b3 = new JButton("Submit");
        d1.t1 = new JTextField("Enter any Text");
        Demo11 d2 = new Demo11();
        d2.l1 = new JLabel("Hello World");
        d2.b1 = new JButton("Change Color");
        d2.b2 = new JButton("New Window");
        d2.b3 = new JButton("Submit");
        d2.t1 = new JTextField("Enter any Text");


        p1.add(d1.l1);
        p1.add(d1.b1);
        p1.add(d1.b2);
        p1.add(d1.t1);
        p1.add(d1.b3);

        p2.add(d2.l1);
        p2.add(d2.b1);
        p2.add(d2.b2);
        p2.add(d2.t1);
        p2.add(d2.b3);

        d1.b1.addActionListener(d2);
//        d1.b2.addActionListener(d1);
//        d1.b3.addActionListener(d1);
//
//        d2.b1.addActionListener(d2);
//        d2.b2.addActionListener(d2);
//        d2.b3.addActionListener(d2);
//
         f1.setSize(500, 600);

        f1.setVisible(true);
        f2.setSize(500, 600);

        f2.setVisible(true);
    }
}