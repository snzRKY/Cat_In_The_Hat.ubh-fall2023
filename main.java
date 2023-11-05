

import Define.define;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.function.BiPredicate;


public class main {
    public static void main(String[] args){

        Head head = new Head();
        Body body = new Body();
        Hat hat = new Hat();
        MouseEvents mouse = new MouseEvents();

        //Main Window
        define.window.setSize(350,400);
        define.window.setVisible(true);
        define.window.setResizable(false);
        define.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        define.window.setAlwaysOnTop(true);
        define.window.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {

            }
            public void mousePressed(MouseEvent e) {

            }
            public void mouseReleased(MouseEvent e) {

            }

            public void mouseEntered(MouseEvent evt) {
                // do your action here when mouse enters the window
                define.inWindow = true;
            }

            public void mouseExited(MouseEvent evt) {
                // do your action here when mouse exits the window
                define.inWindow = false;
            }
        });





        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.add(head,0);
        layeredPane.add(body,1);
        layeredPane.add(hat,0);
        layeredPane.add(mouse,0);

        Hat.onOff = true;

        define.window.add(layeredPane);


    }
}
