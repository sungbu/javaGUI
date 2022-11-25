package com.prince;
import java.awt.*;
import java.awt.event.*;

public class TestWIndow {
    public static void main(String[] args) {
        new WindowFrame();
    }
}

class WindowFrame extends Frame{
    WindowFrame() {
        setBackground(Color.blue);
        setBounds(100,100,200,200);
        setVisible(true);
        // addWindowListener(new MyWIndowListener());
        this.addWindowListener(new WindowAdapter() {

            //关闭窗口
            @Override
            public void windowClosing(WindowEvent e) {
                setVisible(false); //隐藏窗口
                // TODO Auto-generated method stub
                System.exit(0);
            }

            //激活窗口
            @Override
            public void windowActivated(WindowEvent e) {
                // TODO Auto-generated method stub
                super.windowActivated(e);
            }
        });
    }
}
