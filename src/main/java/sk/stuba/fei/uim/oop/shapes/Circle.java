package sk.stuba.fei.uim.oop.shapes;

import java.awt.*;

public class Circle extends Shape {

    public Circle(int x, int y, int radius) {
        super(x, y, radius);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(x, y, radius, radius);
    }

}