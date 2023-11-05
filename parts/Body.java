package parts;

import javax.swing.*;
import java.awt.*;
import Define.define;
public class Body extends JPanel {

    public Body(){
        this.setBounds(define.bodyX,define.bodyY - 10,define.bodywidth,define.bodyheight + 50);
        ImageIcon body = new ImageIcon("images/body.png");
        JLabel label = new JLabel();
        label.setIcon(body);
        setOpaque(false);
        this.add(label);

        this.setVisible(true);
    }
}
