import Define.define;
import com.sun.tools.jconsole.JConsolePlugin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hat extends JPanel {

    private Timer timer; // the timer to control the animation
    public static int x = define.headX; // the initial x coordinate of the head
    public static int y = define.headY; // the initial y coordinate of the head
    private int delay = 10; // the delay of the timer in milliseconds

    private ImageIcon hat = new ImageIcon("images/santa.png");
    private JLabel label = new JLabel();

    private void updateHat() {
        if(define.hatStatus.equals("santa")){
            hat = new ImageIcon("images/santa.png");
            label.setIcon(hat);


            this.setBackground(Color.red);
        }
        if(define.hatStatus.equals("tophat")){
            hat = new ImageIcon("images/tophat.png");
            label.setIcon(hat);

            this.setBackground(Color.gray);
        }
        if(define.hatStatus.equals("witch")){
            hat = new ImageIcon("images/witch.png");
            label.setIcon(hat);

            this.setBackground(Color.yellow);
        }
        if(define.hatStatus.equals("amongus")){
            hat = new ImageIcon("images/amongus.png");
            label.setIcon(hat);

            this.setBackground(Color.pink);
        }
        if(define.hatStatus.equals("leaf")){
            hat = new ImageIcon("images/leaf.png");
            label.setIcon(hat);

            this.setBackground(Color.green);
        }
        if(define.hatStatus.equals("icecream")){
            hat = new ImageIcon("images/icecream.png");
            label.setIcon(hat);

            this.setBackground(Color.green);
        }
        if(define.hatStatus.equals("birthday")){
            hat = new ImageIcon("images/birthday.png");
            label.setIcon(hat);

            this.setBackground(Color.green);
        }
        if(define.hatStatus.equals("nohat")){
            hat = new ImageIcon("images/nohat.png");
            label.setIcon(hat);

            this.setBackground(Color.green);
        }


        this.setVisible(true);
        this.setLocation(Head.x+25, Head.y-10); // update the location of the head panel
        repaint(); // repaint the moving panel
    }


    // this method stops the animation
    public void stopAnimation() {
        timer.stop(); // stop the timer
    }

    public Hat(){

        this.setBounds(x,y,50,100);

        timer = new Timer(delay, new ActionListener() { // create the timer
            @Override
            public void actionPerformed(ActionEvent e) {
                updateHat(); // call the moveHat() method every delay milliseconds
            }
        });
        label.setIcon(hat);
        this.add(label);
        setOpaque(false);

        this.setVisible(true);
        timer.start();
    }

}
