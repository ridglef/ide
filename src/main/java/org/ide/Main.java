package org.ide;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting IDE!");
        JFrame frame = new JFrame("IDE Text Editor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new JScrollPane(new IdeTextPane().create("java")));
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
