package com.prince;

import java.awt.Container;

import javax.swing.*;

public class TestCimboboxDemo2 extends JFrame {
    TestCimboboxDemo2() {

        Container container = this.getContentPane();

        //生成列表内容
        String[] content = {"1","2","3"};

        JList hJList = new JList(content);

        container.add(hJList);




        this.setVisible(true);
        this.setSize(500,350);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new TestCimboboxDemo2();
    }
}
