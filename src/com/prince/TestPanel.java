package com.prince;
import java.awt.*;
import java.awt.event.*;

//panel面板  可以看成一个空间，但是不能单独存在
public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame();

        //布局概念
        Panel panel = new Panel();
        //设置布局
        frame.setLayout(null);

        //坐标
        frame.setBounds(300,300,500,500);
        frame.setBackground(new Color(40,161,35));
        
        //panel设置坐标 相对于frame
        panel.setBounds(50, 50, 400, 400);
        panel.setBackground(new Color(193,15,60));

        //frame.add(panel)
        frame.add(panel);

        frame.setVisible(true);

        //监听窗口关闭事件
        // frame.addWindowListener(new wi );
        //适配器模式:WindowAdapter
        frame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                // TODO Auto-generated method stub
                super.windowClosing(e);
                //结束程序
                System.exit(0);
            }
        });
    }
}
