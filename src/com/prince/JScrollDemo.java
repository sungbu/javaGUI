package com.prince;

import javax.swing.*;
import java.awt.*;

public class JScrollDemo extends JFrame {
    JScrollDemo() {
        Container container = this.getContentPane();

        //文本域
        JTextArea textArea = new JTextArea(20,50);
        textArea.setText("欢迎学习");


        //Scroll面板
        JScrollPane jScrollPane = new JScrollPane(textArea);

        container.add(jScrollPane);


        this.setVisible(true);
        this.setBounds(100,100,300,350);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JScrollDemo();
    }
}
