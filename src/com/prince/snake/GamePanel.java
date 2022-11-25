package com.prince.snake;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.*;

import javax.swing.*;

//游戏面板
public class GamePanel extends JPanel implements KeyListener,ActionListener {

    //定义蛇的数据结构
    int length;
    int[] snakeX = new int[600]; //蛇的X坐标  25*25
    int[] snakeY = new int[600]; //蛇的Y坐标  25*25
    String fx; //头方向
    boolean isStart = false; //游戏默认不开始

    Timer timer = new Timer(100,this); //100毫秒执行一次

    //食物坐标
    int foodx;
    int foody;
    java.util.Random random = new java.util.Random();


    //构造器
    GamePanel() {
        init();
        //获得焦点和键盘事件
        this.setFocusable(true);
        this.addKeyListener(this); //获取键盘监听事件
        timer.start();

    }

    //初始化方法
    public void init() {
        length = 3;
        snakeX[0] = 100;snakeY[0] = 100; //头坐标
        snakeX[1] = 75;snakeY[1] = 100;//身体1坐标
        snakeX[2] = 50;snakeY[2] = 100;//身体2坐标
        fx = "R"; //初始头方向右

        //把食物随机分布在界面上
        foodx = 25 + 25 * random.nextInt(34);
        foody = 75 + 25 * random.nextInt(24);
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

        //画食物
        Data.food.paintIcon(this, g, foodx, foody);

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

    //键盘监听事件
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        if(keyCode == KeyEvent.VK_SPACE){
            isStart = ! isStart;
            repaint();
        }

        //小蛇移动
        if(keyCode == KeyEvent.VK_UP){
            fx = "U";
        }else if(keyCode == KeyEvent.VK_DOWN){
            fx = "D";
        }else if(keyCode == KeyEvent.VK_LEFT){
            fx = "L";
        }else if(keyCode == KeyEvent.VK_RIGHT){
            fx = "R";
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

    //事件监听 
    @Override
    public void actionPerformed(ActionEvent e) {
        if(isStart){ //如果游戏是开始状态，蛇动

            //吃食物
            if(snakeX[0] == foodx && snakeY[0] == foody){
                length ++;
                //再次随机食物
                foodx = 25 + 25 * random.nextInt(34);
                foody = 75 + 25 * random.nextInt(24);

            }

            //移动
            for(int i = length - 1; i > 0; i --){ //后一节移到前一节的位置
                snakeX[i] = snakeX[i - 1];
                snakeY[i] = snakeY[i - 1];
            }

            //走向
            if(fx.equals("R")){
                snakeX[0] = snakeX[0] + 25;
                //边界判断
                if(snakeX[0] > 850) snakeX[0] = 25;
            
            }else if(fx.equals("L")){
                snakeX[0] = snakeX[0] - 25;
                //边界判断
                if(snakeX[0] < 25) snakeX[0] = 850;
            
            }else if(fx.equals("D")){
                snakeY[0] = snakeY[0] + 25;
                //边界判断
                if(snakeY[0] > 650) snakeY[0] = 75;
            
            }else if(fx.equals("U")){
                snakeY[0] = snakeY[0] - 25;
                //边界判断
                if(snakeY[0] < 75) snakeY[0] = 650;
            
            }
            
            

            

            repaint();
        }
        timer.start(); //定时器开始

    }

}

