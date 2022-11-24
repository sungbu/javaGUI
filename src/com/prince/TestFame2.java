package com.prince;
import java.awt.*;

public class TestFame2 {
    public static void main(String[] args) {
        //展示多个窗口
        MyFrame mf1 = new MyFrame(100, 100, 200, 200, Color.blue);
        MyFrame mf2 = new MyFrame(200, 200, 200, 200, Color.black);
        MyFrame mf3 = new MyFrame(300, 300, 200, 200, Color.yellow);
        MyFrame mf4 = new MyFrame(400, 400, 200, 200, Color.red);
    }
}

class MyFrame extends Frame{
    static int id = 0; //可能存在多个窗口，需要一个计数器
    public MyFrame(int x,int y,int w,int h, Color color) {
        super("MyFrame"+ (++id));
        setBackground(color);
        setBounds(x,y,w,h);
        setVisible(true);
    }
}
