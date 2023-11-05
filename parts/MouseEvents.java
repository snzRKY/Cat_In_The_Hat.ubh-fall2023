package parts;

import Define.define;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MouseEvents extends JPanel{

    private Timer timer;
    private int delay = 1;
    public static int reactXLeft = define.headX - 30;
    public static int reactXRight = define.headX +define.headwidth + 30;

    public static int reactYUp = 50;
    public static int reactYDown = 200;

    private static void recordMouse() {
        Point mousePos = define.window.getMousePosition();
        if (mousePos != null) {
            define.mousePosX = mousePos.x;
            define.mousePosY = mousePos.y;
        }
        if((((define.mousePosX >= reactXLeft) && (define.mousePosX <= reactXRight)) &&
                ((define.mousePosY >= reactYUp) && (define.mousePosY <= reactYDown)) &&
                (define.inWindow == true))){
            define.headMov = -1;
        }else{
            define.headMov = 1;
        }
    }

    public MouseEvents(){
        this.setVisible(false);
        this.setBackground(Color.red);
        //define.headX - 50
        //
        this.setBounds(reactXRight,reactYDown,10,10);
        timer = new Timer(delay, new ActionListener() { // create the timer
            @Override
            public void actionPerformed(ActionEvent e) {
                recordMouse(); // call the moveHead method every delay milliseconds
            }
        });

        timer.start();
    }

}
