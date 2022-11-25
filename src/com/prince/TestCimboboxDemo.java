package com.prince;

import java.awt.Container;

import javax.swing.*;

public class TestCimboboxDemo extends JFrame {
    TestCimboboxDemo() {

        Container container = this.getContentPane();

        JComboBox jComboBox = new JComboBox();

        jComboBox.addItem(null);
        jComboBox.addItem("正在上映");
        jComboBox.addItem("已下架");
        jComboBox.addItem("正在热映");

        
        container.add(jComboBox);



        this.setVisible(true);
        this.setSize(500,350);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new TestCimboboxDemo();
    }
}
