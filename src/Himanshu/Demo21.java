package Himanshu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo21 implements ActionListener {
    private static JLabel l1;
    private static JLabel l2;
    private static JButton b1;
    private static JButton b2;


    public static void main(String[] args) {
        JFrame f1 = new JFrame();
        JPanel p1 = new JPanel();

        f1.add(p1);

        JFrame f2 = new JFrame();
        JPanel p2 = new JPanel();

        f2.add(p2);
        f1.setTitle("Frame 1");

        f2.setTitle("Frame 2");

        Demo21.l1 = new JLabel("Hello World");
        Demo21.l2 = new JLabel("Hello World");

        p1.add(Demo21.l1);
        p2.add(Demo21.l2);

        Demo21.b1 = new JButton("Change Text");
        Demo21.b2 = new JButton("Change Text");

        p1.add(Demo21.b1);
        p2.add(Demo21.b2);
        Demo21.b1.addActionListener(new Demo21());
        Demo21.b2.addActionListener(new Demo21());

        f1.setSize(500, 600);

        f1.setVisible(true);
        f2.setSize(500, 600);

        f2.setVisible(true);


    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==Demo21.b1){
            if(Demo21.l2.getForeground()== Color.red){
                Demo21.l2.setForeground(Color.blue);
            }
            else{
                Demo21.l2.setForeground(Color.red);
            }
        }
        else {
            if(Demo21.l1.getForeground()== Color.red){
                Demo21.l1.setForeground(Color.blue);
            }
            else{
                Demo21.l1.setForeground(Color.red);
            }

        }

    }
}
