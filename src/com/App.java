package com;

import javax.swing.*;

public class App extends JFrame {
    public App(){
        this.setSize(800,800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.add(new Point());
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new App();
    }
}
