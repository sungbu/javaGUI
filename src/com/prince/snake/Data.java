package com.prince.snake;

import javax.swing.ImageIcon;

//数据中心
public class Data {
    private static java.net.URL bodyURL = Data.class.getResource("body.png");
    public static ImageIcon body = new ImageIcon(bodyURL);
    private static java.net.URL downURL = Data.class.getResource("down.png");
    public static ImageIcon down = new ImageIcon(downURL);
    private static java.net.URL foodURL = Data.class.getResource("food.png");
    public static ImageIcon food = new ImageIcon(foodURL);
    private static java.net.URL leftURL = Data.class.getResource("left.png");
    public static ImageIcon left = new ImageIcon(leftURL);
    private static java.net.URL rightURL = Data.class.getResource("right.png");
    public static ImageIcon right = new ImageIcon(rightURL);
    private static java.net.URL upURL = Data.class.getResource("up.png");
    public static ImageIcon up = new ImageIcon(upURL);
}
