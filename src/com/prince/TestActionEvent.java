package com.prince;
import java.awt.*;
import java.awt.event.*;;

public class TestActionEvent {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Button button = new Button();

        //由于 addActionListener() 需要一个ActionListener，所以构造一个
        MyActionListener myActionListener = new MyActionListener();
        button.addActionListener(myActionListener);

        frame.add(button,BorderLayout.CENTER);
        frame.pack();

        windowClose(frame);
        frame.setVisible(true);
    }

    //事件监听
    private static void windowClose(Frame f){
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // TODO Auto-generated method stub
                System.exit(0);
            }
        });
    }
}

class MyActionListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        System.out.println("111");
    }
    
}
