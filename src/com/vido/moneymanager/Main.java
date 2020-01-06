package com.vido.moneymanager;

import com.vido.moneymanager.view.MainFrame;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setTitle("Money Manager");
        mainFrame.setPreferredSize(new Dimension(500, 600));
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
}
