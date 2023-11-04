import javax.swing.*;
import java.awt.*;
import Define.define;
public class Body extends JPanel {

    public Body(){
        this.setBounds(define.bodyX,define.bodyY,define.bodywidth,define.bodyheight);
        this.setBackground(Color.blue);
    }
}
