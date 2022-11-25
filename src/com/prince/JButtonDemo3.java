package com.prince;

import javax.print.DocFlavor.URL;
import javax.swing.*;
import java.awt.*;;

public class JButtonDemo3 extends JFrame {
    JButtonDemo3() {
        Container Container = this.getContentPane();


        java.net.URL url = JButtonDemo.class.getResource("test.jpg");

        JCheckBox checkBox1 = new JCheckBox("1");
        JCheckBox checkBox2 = new JCheckBox("2");
        JCheckBox checkBox3 = new JCheckBox("3");




        Container.add(checkBox1,BorderLayout.CENTER);
        Container.add(checkBox2,BorderLayout.NORTH);
        Container.add(checkBox3,BorderLayout.SOUTH);

        this.setVisible(true);
        this.setSize(500,300);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        
    }
    public static void main(String[] args) {
        new JButtonDemo3();
    }
}
