package com.prince;
import java.awt.*;
import java.awt.event.*;

public class TestCalc2 {
    public static void main(String[] args) {
        new Calculator().loadFrame();
    }
}
// 计算器类
class Calculator extends Frame{
    TextField num1,num2,num3;
    public void loadFrame() {
         //3个文本
         num1 = new TextField(10);//字符数
         num2 = new TextField(10);
         num3 = new TextField(20);
 
 
         //1个按钮
 
         Button btn = new Button("=");
         Label label = new Label("+");
 
         Calculator calc = new Calculator();
         btn.addActionListener(new MyCalculatorListner(calc));
         //1个标签
 
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
    //获取计算器这个对象
    Calculator calculator = null;
    public MyCalculatorListner(Calculator calculator) {
        this.calculator = calculator;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        //1.获得加数和被加数
        int n1 = Integer.parseInt(calculator.num1.getText());
        int n2 = Integer.parseInt(calculator.num1.getText());

        
        //2. 将这个值 +法运算 放到第三个框
        calculator.num3.setText("" + (n1 + n2));

        //3.清除两个框
        calculator.num1.setText("");
        calculator.num2.setText("");
        
    }

}
