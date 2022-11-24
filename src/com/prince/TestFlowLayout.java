package com.prince;
import java.awt.*;;
public class TestFlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();

        Button btn1 = new Button("btn1");
        Button btn2 = new Button("btn2");
        Button btn3 = new Button("btn3");

        //设置流式布局
        // frame.setLayout(new FlowLayout());
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));

        frame.setSize(200,200);

        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);

        frame.setVisible(true);

    }
}
