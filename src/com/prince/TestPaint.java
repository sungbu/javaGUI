package com.prince;
import java.awt.*;;

public class TestPaint {
    public static void main(String[] args) {
        new MyPaint().loadFrame();
    }
}

class MyPaint extends Frame{
    public void loadFrame() {
        setBounds(200,200,600,500);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        //画笔颜色
        g.setColor(Color.red);
        g.drawOval(100, 100, 100, 100);
        g.fillOval(100, 100, 100, 100); //实心圆

        g.setColor(Color.green);
        g.fillRect(150, 200, 200, 200);

        //画笔用完还原最初的颜色
        g.setColor(Color.black);
    }
}