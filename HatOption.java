import Define.define;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class HatOption extends JPanel{
    ImageIcon icon = new ImageIcon("images/santa.png");


    public HatOption(){
        this.setLayout(new GridLayout (1, 8)); //use a grid layout to arrange the buttons vertically

        JButton santa = new JButton (); //create a button with a label
        this.add (santa); //add the button to the panel
        santa.setVisible(true);
        santa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                define.hatStatus = "santa";
            }
        });
        icon = new ImageIcon("images/santa.png");
        santa.setIcon(icon);
        santa.setUI(new BasicButtonUI());
        santa.setFocusable(true);



        JButton tophat = new JButton (); //create a button with a label
        this.add (tophat); //add the button to the panel
        tophat.setVisible(true);
        tophat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                define.hatStatus = "tophat";
            }
        });
        icon = new ImageIcon("images/tophat.png");
        tophat.setIcon(icon);
        tophat.setUI(new BasicButtonUI());

        JButton witch = new JButton (); //create a button with a label
        this.add (witch); //add the button to the panel
        witch.setVisible(true);
        witch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                define.hatStatus = "witch";
            }
        });
        icon = new ImageIcon("images/witch.png");
        witch.setIcon(icon);
        witch.setUI(new BasicButtonUI());

        JButton amongus = new JButton (); //create a button with a label
        this.add (amongus); //add the button to the panel
        amongus.setVisible(true);
        amongus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                define.hatStatus = "amongus";
            }
        });
        icon = new ImageIcon("images/amongus.png");
        amongus.setIcon(icon);
        amongus.setVisible(true);
        amongus.setUI(new BasicButtonUI());

        JButton leaf = new JButton (); //create a button with a label
        this.add (leaf); //add the button to the panel
        leaf.setVisible(true);
        leaf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                define.hatStatus = "leaf";
            }
        });
        icon = new ImageIcon("images/leaf.png");
        leaf.setIcon(icon);
        leaf.setVisible(true);
        leaf.setUI(new BasicButtonUI());


        JButton icecream = new JButton (); //create a button with a label
        this.add (icecream); //add the button to the panel
        icecream.setVisible(true);
        icecream.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                define.hatStatus = "icecream";
            }
        });
        icon = new ImageIcon("images/icecream.png");
        icecream.setIcon(icon);
        icecream.setVisible(true);
        icecream.setUI(new BasicButtonUI());

        JButton birthday = new JButton (); //create a button with a label
        this.add (birthday); //add the button to the panel
        birthday.setVisible(true);
        birthday.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                define.hatStatus = "birthday";
            }
        });
        icon = new ImageIcon("images/birthday.png");
        birthday.setIcon(icon);
        birthday.setVisible(true);
        birthday.setUI(new BasicButtonUI());

        JButton nohat = new JButton ("No Hat"); //create a button with a label
        this.add (nohat); //add the button to the panel
        nohat.setVisible(true);
        nohat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                define.hatStatus = "nohat";
            }
        });
        nohat.setUI(new BasicButtonUI());

        this.setVisible(true);
    }

}
