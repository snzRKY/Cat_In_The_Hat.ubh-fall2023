import Define.define;

import javax.swing.*;
import java.awt.*;


public class HatOption extends JPanel{


    public HatOption(){
        this.setLayout(new GridLayout (1, 8)); //use a grid layout to arrange the buttons vertically

        JButton santa = new JButton ("santa"); //create a button with a label
        this.add (santa); //add the button to the panel
        santa.setVisible(true);

        JButton tophat = new JButton ("tophat"); //create a button with a label
        this.add (tophat); //add the button to the panel
        tophat.setVisible(true);

        JButton witch = new JButton ("witch"); //create a button with a label
        this.add (witch); //add the button to the panel
        witch.setVisible(true);

        JButton flower = new JButton ("flower"); //create a button with a label
        this.add (flower); //add the button to the panel
        flower.setVisible(true);

        JButton leaf = new JButton ("leaf"); //create a button with a label
        this.add (leaf); //add the button to the panel
        leaf.setVisible(true);

        JButton beanie = new JButton ("beanie"); //create a button with a label
        this.add (beanie); //add the button to the panel
        beanie.setVisible(true);

        JButton birthday = new JButton ("birthday"); //create a button with a label
        this.add (birthday); //add the button to the panel
        birthday.setVisible(true);

        JButton nohat = new JButton ("nohat"); //create a button with a label
        this.add (nohat); //add the button to the panel
        nohat.setVisible(true);

        this.setVisible(true);
    }

}
