package com.prince.snake;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

//游戏面板
public class GamePanel extends JPanel {

    //绘制面板
    @Override
    protected void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        super.paintComponent(g);//清屏

        //绘制静态面板
        this.setBackground(Color.white);
        // Data.body.paintIcon(this,g, 25,11);//头部广告

        g.fillRect(25, 75, 850, 600);//默认的游戏界面


    }
}
