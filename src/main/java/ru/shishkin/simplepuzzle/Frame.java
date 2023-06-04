package ru.shishkin.simplepuzzle;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    public Frame() {
        Panel np = new Panel();
        Container cont = getContentPane();
        cont.add(np);
        setBounds(0, 0, 640, 360);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
