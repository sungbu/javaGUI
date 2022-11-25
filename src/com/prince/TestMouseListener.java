package com.prince;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;;

public class TestMouseListener {
    public static void main(String[] args) {
        new MyFrame("画图");

    }
}

class MyFrame extends Frame{
    ArrayList points;
    //画笔  监听鼠标位置  存储点
    public MyFrame(String title){
        super(title);
        setBounds(200,200,400,300);
        setVisible(true);
        //存鼠标的点
        points = new ArrayList<>();
        //鼠标监听器  正对这个窗口
        this.addMouseListener(new MyMouseListener());
    }

    @Override
    public void paint(Graphics g) {
        //监听鼠标事件
        Iterator iterator = points.iterator();
        while(iterator.hasNext()){
            Point point = (Point) iterator.next();
            g.setColor(Color.BLACK);
            g.fillOval(point.x, point.y, 10, 10);
        }

    }
    //添加一个点到界面
    public void addPaint(Point point) {
        points.add(point);
    }

    //适配器模式
    class MyMouseListener extends MouseAdapter{
        @Override
        public void mousePressed(MouseEvent e) {
            // TODO Auto-generated method stub
            MyFrame myFrame = (MyFrame) e.getSource();

            //点击时产生一个点
            myFrame.addPaint( new Point(e.getX(),e.getY()));
           
            //每次点击需要重画一次
            myFrame.repaint();
        }
    }

}