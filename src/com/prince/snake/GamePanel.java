package com.prince.snake;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.*;

//游戏面板
public class GamePanel extends JPanel {

    //定义蛇的数据结构
    int length;
    int[] snakeX = new int[600]; //蛇的X坐标  25*25
    int[] snakeY = new int[600]; //蛇的Y坐标  25*25
    String fx; //头方向
    boolean isStart = false; //游戏默认不开始
    //构造器
    GamePanel() {
        init();
    }

    //初始化方法
    public void init() {
        length = 3;
        snakeX[0] = 100;snakeY[0] = 100; //头坐标
        snakeX[1] = 75;snakeY[1] = 100;//身体1坐标
        snakeX[2] = 50;snakeY[2] = 100;//身体2坐标
        fx = "R"; //初始头方向右
    }



    //绘制面板
    @Override
    protected void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        super.paintComponent(g);//清屏

        //绘制静态面板
        this.setBackground(Color.white);
        Data.body.paintIcon(this,g, 25,11);//头部广告

        g.fillRect(25, 75, 850, 600);//默认的游戏界面

        //画蛇
        if(fx.equals("R")){
            Data.right.paintIcon(this, g, snakeX[0], snakeY[0]);
        }else if (fx.equals("L")){
            Data.left.paintIcon(this, g, snakeX[0], snakeY[0]);
        }else if (fx.equals("U")){
            Data.up.paintIcon(this, g, snakeX[0], snakeY[0]);
        }else if (fx.equals("D")){
            Data.down.paintIcon(this, g, snakeX[0], snakeY[0]);
        }

        for(int i = 1; i < length; i ++){
            Data.body.paintIcon(this, g, snakeX[i], snakeY[i]);
        }

        //游戏状态
        if(isStart == false){
            g.setColor(Color.white);
            g.setFont(new Font("微软雅黑",Font.BOLD,40));
            g.drawString("按下空格开始游戏", 300, 300);
        }
    }
}
