package com.prince.snake;



import javax.swing.*;

public class StartGame {
    public static void main(String[] args) {
        JFrame jfarame = new JFrame();

        jfarame.setBounds(10,10,900,720);
        jfarame.setResizable(false);
        
        
        jfarame.add(new GamePanel());

        
        jfarame.setVisible(true);
        jfarame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // jfarame.add(new GamePanel());



    }


}
