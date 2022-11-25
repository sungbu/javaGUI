package com.prince;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class TestTextDemo2 extends JFrame {
    TestTextDemo2() {
        Container container = this.getContentPane();

        JPasswordField textField = new JPasswordField("hello");
        textField.setEchoChar('*');

        container.add(textField,BorderLayout.NORTH);

        

        this.setVisible(true);
        this.setSize(500,350);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestTextDemo2();
    }
}
