package com.prince;
import java.awt.Color;
import java.awt.Container;

import javax.swing.*;

public class JFrameDemo {
    public void init() {
        JFrame frame = new JFrame("这是一个Jframe窗口");
        frame.setVisible(true);
        frame.setBounds(100,100,200,200);

        JLabel label = new JLabel("欢迎来到");

        label.setHorizontalAlignment(SwingConstants.CENTER);

        //设置颜色
        Container container = frame.getContentPane();
        container.setBackground(Color.blue);

        frame.add(label);

        //关闭事件
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new JFrameDemo().init();
    }
}
