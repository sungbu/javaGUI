package com.prince;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class TestTextDemo extends JFrame {
    TestTextDemo() {
        Container container = this.getContentPane();

        JTextField textField = new JTextField("hello");
        JTextField textField2 = new JTextField("world",20);

        container.add(textField,BorderLayout.NORTH);
        container.add(textField2,BorderLayout.SOUTH);

        

        this.setVisible(true);
        this.setSize(500,350);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestTextDemo();
    }
}
