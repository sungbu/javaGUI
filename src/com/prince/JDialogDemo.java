package com.prince;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

//主窗口
public class JDialogDemo extends JFrame {
    public void init() {
            this.setVisible(true);
            this.setSize(700,500);
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            //JFrame 放东西，容器
            Container container = this.getContentPane();
            //绝对布局
            container.setLayout(null);

            //按钮
            JButton btn = new JButton("点击弹出对话框");
            btn.setBounds(30,30,200,50);


            //点击按钮弹出弹窗
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new MyDialog();
                    
                }
            });

            container.add(btn);


    }
    public static void main(String[] args) {
        new JDialogDemo().init();
    }
}

//弹窗的窗口
class MyDialog extends JDialog{
    public MyDialog() {
        this.setVisible(true);
        this.setBounds(100,100,500,500);
        // this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        Container container = this.getContentPane();
        container.setLayout(null);

        container.add(new Label("带你学java"));
    }
}