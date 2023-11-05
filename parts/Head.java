package parts;

import Define.define;

import javax.print.attribute.standard.Media;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Head extends JPanel {
    private Timer timer; // the timer to control the animation
    public static int x = define.headX; // the initial x coordinate of the head
    public static int y = define.headY; // the initial y coordinate of the head
    private int delay = 50; // the delay of the timer in milliseconds
    private int bounds = 15;
    private ImageIcon cat = new ImageIcon("images/cathead.png");
    private JLabel label = new JLabel();


    // moves head down
    private void moveHead() {
        this.setVisible(true);
        if(define.headMov == 1){ // up
            if(bounds < 15){
                if(bounds > 13){
                    cat = new ImageIcon("images/cathead.png");
                    label.setIcon(cat);
                }
                y--;
                bounds++;
                this.setLocation(x, y);
                repaint();
            }
        }
        else{ // down
            if(bounds > 0){
                cat = new ImageIcon("images/catheadblink.png");
                label.setIcon(cat);
                y++; // increment the y coordinate
                bounds--;
                this.setLocation(x, y); // update the location of the head panel
                repaint(); // repaint the moving panel

            }
        }
    }

    public Head() {

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
