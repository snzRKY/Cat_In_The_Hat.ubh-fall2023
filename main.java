

import Define.define;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class main {
    public static void main(String[] args){

        Head head = new Head();
        Body body = new Body();
        Hat hat = new Hat();
        MouseEvents mouse = new MouseEvents();
        HatOption wheel = new HatOption();

        //Main Window
        define.window.setSize(200,350);
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
        define.window.repaint();

        JScrollPane scrollPane = new JScrollPane (wheel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        scrollPane.setBounds(0,255,190,75);
        scrollPane.setBackground(Color.black);

        define.window.add(scrollPane);


        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setVisible(true);
        layeredPane.add(body,0);
        layeredPane.add(mouse,0);
        layeredPane.add(head,0);
        layeredPane.add(hat,0);



        define.window.add(layeredPane);
        define.window.revalidate();


    }
}
