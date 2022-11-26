package com.prince.snake;

import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.*;


public class Monster extends JPanel implements ActionListener {

    int eyesX;
    String eyesFx;

    int bodyY;
    String bodyFx;

    Timer timer = new Timer(60,this);

    Monster() {
        init();
    }
    public void init () {
        eyesX = 490;
        timer.start();
        eyesFx = "L";
        bodyY = 450;
        bodyFx = "T";
    }

    @Override
    protected void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        super.paintComponent(g);

        this.setBackground(new Color(219,77,109));

        drawMonster(g);


    }

    private void drawMonster (Graphics g) {

        //文字
        g.setColor(Color.white);
        g.setFont(new Font("微软雅黑",Font.BOLD,40));
        g.drawString("I am", 300, 300);
        g.drawString("CAMERA", 300, 350);

        g.setColor(new Color(255,255,255,50));
        g.setFont(new Font("微软雅黑",Font.BOLD,20));
        g.drawString("Ahhhh I saw you!!!", 300, 380);
        

        //身体
        g.setColor(new Color(229,90,84));
        g.fillRoundRect(425, bodyY, 150, 100, 20, 20);
        //眼睛
        g.setColor(new Color(255,255,255));
        g.fillOval(480, 470, 40, 40);
        g.setColor(new Color(12,68,117));
        g.fillOval(eyesX, 480, 20, 20);

        //嘴巴
        g.setColor(new Color(255,255,255));
        g.fillRoundRect(483, 520, 35, 12, 12, 12);


        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        // if(eyesX < 460){
        //     eyesX ++;
        // }
        // if(eyesX > 480){
        //     eyesX --;
        // }

        if(eyesFx.equals("L")){
            eyesX --;
            if(eyesX < 480){
                eyesFx = "R";
            }
        }

        if(eyesFx.equals("R")){
            eyesX ++;
            if(eyesX > 500){
                eyesFx = "L";
            }
        }

        if(bodyFx.equals("T")){
            bodyY --;
            if(bodyY < 400){
                bodyFx = "D";
            }
        }

        if(bodyFx.equals("D")){
            bodyY ++;
            if(bodyY > 450){
                bodyFx = "T";
            }
        }
        repaint();
        timer.start();
    }
    
}
