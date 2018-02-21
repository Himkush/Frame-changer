package Himanshu1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateNewWindow extends JFrame implements ActionListener {
    private JLabel label;
    private JButton changeColorButton;
    private JButton newWindow;
    private CreateNewWindow[] child = new CreateNewWindow[12];
    private int i = 0;

    public CreateNewWindow() {

        super();

        JPanel p = new JPanel();

        this.add(p);
        this.changeColorButton = new JButton("Change Text");
        this.newWindow = new JButton("New Window");
        this.label = new JLabel("Hello World");

        p.add(this.changeColorButton);
        p.add(this.label);
        p.add(this.newWindow);

        this.newWindow.addActionListener(this);
        this.changeColorButton.addActionListener(this);
        this.setSize(500, 500);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.changeColorButton) {
            if (this.label.getForeground() == Color.RED) {
                this.label.setForeground(Color.GREEN);
                this.callChild(this);
//                  if (this.child.length>0) {
//                      for (int z = 0; z <= this.child.length; z++) {
//                          this.child[i].changeColorButton.addActionListener(child[i]);
//                      }
//                  }

            } else {
                this.callChild(this);
                this.label.setForeground(Color.red);
            }
        } else {
            CreateNewWindow f = new CreateNewWindow();
            this.child[i] = f;
            this.i++;
            //System.out.println(this.i);
            f.setVisible(true);
        }
    }

    private void callChild(CreateNewWindow w) {


        // if (w.child.length != 0) {
        for (int z = 0; z < w.child.length; z++) {
            if (w.child[z] != null) {
                
                child[z].callChild(child[z]);

                if (child[z].label.getForeground() == Color.RED) {
                    child[z].label.setForeground(Color.GREEN);

                } else {
                    child[z].label.setForeground(Color.RED);
                }
//               }
            }
        }
    }
        }
