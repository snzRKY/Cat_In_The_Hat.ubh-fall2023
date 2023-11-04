

import javax.swing.*;
import java.util.function.BiPredicate;


public class main {
    public static void main(String[] args){

        Head head = new Head();
        Body body = new Body();
        Hat hat = new Hat();

        //Main Window
        JFrame window = new JFrame();
        window.setSize(350,500);
        window.setVisible(true);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.add(head,0);
        layeredPane.add(body,1);
        layeredPane.add(hat,0);

        Hat.onOff = true;

        window.add(layeredPane);


    }
}
