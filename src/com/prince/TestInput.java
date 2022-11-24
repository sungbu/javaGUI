package com.prince;
import java.awt.*;
import java.awt.event.*;;

public class TestInput {
    public static void main(String[] args) {
        new MyFrame();
    }
}

class MyFrame extends Frame{
    MyFrame() {
        TextField textField = new TextField();
        add(textField);

        //监听文本框输入
        MyActionListener myActionListener = new MyActionListener();
        //按下回车就会触发输入框事件
        textField.addActionListener(myActionListener);

        //设置替换编码
        textField.setEchoChar('*');

        setVisible(true);
        pack();
    }
}
class MyActionListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        TextField field =  (TextField) e.getSource(); //获得一些资源,返回一个对象
        field.getText(); //获得输入框中的文本
        System.out.println(field.getText() );
        field.setText("");
    }

}
