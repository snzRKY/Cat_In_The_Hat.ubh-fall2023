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
    public static boolean onOff = false;


    private void moveHat() {

        if(onOff == true){
            this.setVisible(true);
            this.setLocation(Head.x+25, Head.y-30); // update the location of the head panel
            repaint(); // repaint the moving panel
        }
        else{
            this.setVisible(false);
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

    public Hat(){
        this.setBounds(x,y,50,50);
        this.setBackground(Color.red);

        timer = new Timer(delay, new ActionListener() { // create the timer
            @Override
            public void actionPerformed(ActionEvent e) {
                moveHat(); // call the moveHat() method every delay milliseconds
            }
        });

        this.startAnimation();
    }

}
