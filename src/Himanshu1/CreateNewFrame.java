package Himanshu1;

import Himanshu.Demo11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateNewFrame extends JFrame implements ActionListener{

    private JButton changeColorButton;
    private JLabel label;
    private CreateNewFrame sibling;

    public CreateNewFrame(){
        super();

        JPanel p1 = new JPanel();
        this.add(p1);
        this.changeColorButton = new JButton("Change Color");
        this.label = new JLabel("Hello World");
        p1.add(this.changeColorButton);
        p1.add(this.label);

        this.changeColorButton.addActionListener(this);


        this.setSize(500,500);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
            if (this.sibling.label.getForeground()== Color.RED) {
                this.sibling.label.setForeground(Color.GREEN);
            }
             else{
                this.sibling.label.setForeground(Color.RED);

            }



    }

    public void setSibling(CreateNewFrame f){
        this.sibling = f;
        f.sibling = this;
    }
}
