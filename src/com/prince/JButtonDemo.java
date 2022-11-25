package com.prince;

import javax.print.DocFlavor.URL;
import javax.swing.*;
import java.awt.*;;

public class JButtonDemo extends JFrame {
    JButtonDemo() {
        Container Container = this.getContentPane();


        java.net.URL url = JButtonDemo.class.getResource("test.jpg");

        Icon icon = new ImageIcon(url);

        JButton btn = new JButton();
        btn.setIcon(icon);
        btn.setToolTipText("图片按钮");

        Container.add(btn);

        this.setVisible(true);
        this.setSize(500,300);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        
    }
    public static void main(String[] args) {
        new JButtonDemo();
    }
}
