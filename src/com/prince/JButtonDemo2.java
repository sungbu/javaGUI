package com.prince;

import javax.print.DocFlavor.URL;
import javax.swing.*;
import java.awt.*;;

public class JButtonDemo2 extends JFrame {
    JButtonDemo2() {
        Container Container = this.getContentPane();


        java.net.URL url = JButtonDemo.class.getResource("test.jpg");

        JRadioButton radioButton1 = new JRadioButton("1");
        JRadioButton radioButton2 = new JRadioButton("2");
        JRadioButton radioButton3 = new JRadioButton("3");

        //一个组中只能选一个
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);




        Container.add(radioButton1,BorderLayout.CENTER);
        Container.add(radioButton2,BorderLayout.NORTH);
        Container.add(radioButton3,BorderLayout.SOUTH);

        this.setVisible(true);
        this.setSize(500,300);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        
    }
    public static void main(String[] args) {
        new JButtonDemo2();
    }
}
