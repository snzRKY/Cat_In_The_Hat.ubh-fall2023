package parts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Define.define;

public class Head extends JPanel {
    private Timer timer; // the timer to control the animation
    public static int x = define.headX; // the initial x coordinate of the head
    public static int y = define.headY; // the initial y coordinate of the head
    private int delay = 50; // the delay of the timer in milliseconds
    private int bounds = 15;
    // this method moves the head panel down by one pixel
    private void moveHead() {
        this.setVisible(true);
        if(define.headMov == 1){
            if(bounds < 15){
                y--;
                bounds++;
                this.setLocation(x, y); // update the location of the head panel
                repaint(); // repaint the moving panel
            }
        }
        else{
            if(bounds > 0){
                y++; // increment the y coordinate
                bounds--;
                this.setLocation(x, y); // update the location of the head panel
                repaint(); // repaint the moving panel
            }
        }
    }

    public Head() {
        ImageIcon cat = new ImageIcon("images/cathead.png");
        JLabel label = new JLabel();
        label.setIcon(cat);
        setOpaque(false);
        this.add(label);

        this.setBounds(x, y, define.headwidth, define.headheight); // set its initial bounds

        timer = new Timer(delay, new ActionListener() { // create the timer
            @Override
            public void actionPerformed(ActionEvent e) {
                moveHead(); // call the moveHead method every delay milliseconds
            }
        });

        timer.start();
    }

}
