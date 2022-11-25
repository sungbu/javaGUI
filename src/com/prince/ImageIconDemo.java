package com.prince;
import javax.print.DocFlavor.URL;
import javax.swing.*;
import java.awt.*;

public class ImageIconDemo extends JFrame {

    public ImageIconDemo() {
        //获取图片地址
        java.net.URL url = ImageIconDemo.class.getResource("test.jpg");

        ImageIcon imageIcon = new ImageIcon(url);
        
        JLabel lable = new JLabel("ImgIcon");

        lable.setIcon(imageIcon);
        lable.setHorizontalAlignment(SwingConstants.CENTER);

        Container container = getContentPane();
        container.add(lable);

        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
    
    public static void main(String[] args) {
        new ImageIconDemo();
    }
}
