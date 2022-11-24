package com.prince;
import java.awt.*;
import java.awt.event.*;

public class TestCalc {
    public static void main(String[] args) {
        new Calculator();
    }
}
// 计算器类
class Calculator extends Frame{
    public Calculator() {
        //3个文本
        TextField num1 = new TextField(10);//字符数
        TextField num2 = new TextField(10);
        TextField num3 = new TextField(20);


        //1个按钮

        Button btn = new Button("=");

        btn.addActionListener(new MyCalculatorListner(num1,num2,num3));
        //1个标签
        Label label = new Label("+");

        //布局
        setLayout(new FlowLayout());
        add(num1);
        add(label);
        add(num2);
        add(btn);
        add(num3);

        pack();
        setVisible(true);
    }
}
//监听器类
class MyCalculatorListner implements ActionListener{
    //获取三个变量
    private TextField num1,num2,num3;
    public MyCalculatorListner(TextField num1,TextField num2,TextField num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        //1.获得加数和被加数
        int n1 = Integer.parseInt(num1.getText());
        int n2 = Integer.parseInt(num2.getText());

        //2. 将这个值 +法运算 放到第三个框
        num3.setText("" + (n1 + n2));

        //3.清除两个框
        num1.setText("");
        num2.setText("");
    }

}
