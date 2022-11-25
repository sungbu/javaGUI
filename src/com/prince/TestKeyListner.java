package com.prince;
import java.awt.*;
import java.awt.event.*;

public class TestKeyListner {
    public static void main(String[] args) {
        new keyFrame();
    }
}

class keyFrame extends Frame{
    public keyFrame() {
        setBounds(1,2,300,400);
        setVisible(true);
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                //键盘按下事件
                System.out.println(e.getKeyCode());
                if(e.getKeyCode() == KeyEvent.VK_UP){
                    System.out.println("你按了上键");
                }
            }
        });
    }
}
