package com.prince;
import java.awt.*;

public class TestFame {
    public static void main(String[] args) {

        //Frame
        Frame frame = new Frame("我的第一个java图形界面窗口");

        //设置可见性
        frame.setVisible(true);
        //设置窗口大小
        frame.setSize(400,400);
        //设置背景颜色
        frame.setBackground(Color.black);
        //弹出的初始位置
        frame.setLocation(200,200);
        //设置大小固定
        frame.setResizable(false);
    }
}
