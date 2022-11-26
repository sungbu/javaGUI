package com.prince.snake;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Product {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setBounds(10,10,1000,1000);
        jFrame.setResizable(false);


        jFrame.add(new Monster());
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
