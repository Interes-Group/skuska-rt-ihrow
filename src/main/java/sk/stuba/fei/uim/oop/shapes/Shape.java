package sk.stuba.fei.uim.oop.shapes;

import lombok.Data;

import javax.swing.*;
import java.awt.*;

@Data
public abstract class Shape extends JPanel {
    protected int x;
    protected int y;
    protected int radius;

    public Shape(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

}
