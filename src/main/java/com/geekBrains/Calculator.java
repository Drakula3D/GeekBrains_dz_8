package com.geekBrains;

import javax.swing.*;

public class Calculator {
    public static void main(String[] args) {

    JFrame frame = new JFrame();
    frame.setTitle("калькулятор");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(800, 400, 640, 480);
    CalcPanel panel = new CalcPanel();
    frame.add(panel);
    frame.setVisible(true);
    }
}
