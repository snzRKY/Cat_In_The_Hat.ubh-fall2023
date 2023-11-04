import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Define.define;

public class Head extends JPanel {
    private Timer timer; // the timer to control the animation
    public static int x = define.headX; // the initial x coordinate of the head
    public static int y = define.headY; // the initial y coordinate of the head
    private int delay = 50; // the delay of the timer in milliseconds

    private int movement = -1; //1 = up -1 = down
    private int bounds = 10;
    // this method moves the head panel down by one pixel
    private void moveHead() {
        if(movement == 1){
            if(bounds < 10){
                y--;
                bounds++;
                this.setLocation(x, y); // update the location of the head panel
                repaint(); // repaint the moving panel
            }
            else{
                movement = -1;
            }
        }
        else{
            if(bounds > 0){
                y++; // increment the y coordinate
                bounds--;
                this.setLocation(x, y); // update the location of the head panel
                repaint(); // repaint the moving panel
            }
            else{
                movement = 1;
            }
        }
    }

    // this method starts the animation in a background thread
    public void startAnimation() {
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                timer.start(); // start the timer
                return null;
            }
        };
        worker.execute(); // execute the worker
    }

    // this method stops the animation
    public void stopAnimation() {
        timer.stop(); // stop the timer
    }


    public Head() {
        this.setBounds(x, y, define.headwidth, define.headheight); // set its initial bounds
        this.setBackground(Color.black); // set its background color
        timer = new Timer(delay, new ActionListener() { // create the timer
            @Override
            public void actionPerformed(ActionEvent e) {
                moveHead(); // call the moveHead method every delay milliseconds
            }
        });

        this.startAnimation();
    }

}
