package sk.stuba.fei.uim.oop.gui;

import javax.swing.*;
import java.awt.*;

public class Window {
    public Window() {
        JFrame frame = new JFrame("ExamRT");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.getContentPane().setBackground(new Color(0x333333));
        frame.setResizable(false);
        frame.setFocusable(true);



        frame.setVisible(true);
    }
}
