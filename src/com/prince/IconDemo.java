package com.prince;
import javax.swing.*;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.*;;

//图标，需要实现类、frame继承
public class IconDemo extends JFrame implements Icon {

    private int width;
    private int height;

    public IconDemo() {

    }
    public IconDemo(int width,int height) {
        this.width = width;
        this.height = height;
    }

    public void init() {
        IconDemo iconDemo = new IconDemo(15,15);
        //图标放在标签或者按钮
        JLabel label =  new JLabel("icon",iconDemo,SwingConstants.CENTER);

        Container container = getContentPane();
        container.add(label);

        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new IconDemo().init();
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        // TODO Auto-generated method stub
        g.fillOval(x, y, width, height);
        
    }

    @Override
    public int getIconWidth() {
        // TODO Auto-generated method stub
        return this.width;
    }

    @Override
    public int getIconHeight() {
        // TODO Auto-generated method stub
        return this.height;
    }
}
