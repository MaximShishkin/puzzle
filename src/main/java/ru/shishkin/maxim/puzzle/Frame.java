package ru.shishkin.maxim.puzzle;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    public Frame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Simple Puzzle");
        setResizable(false);
        add(new Panel(4, 550, 30), BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
