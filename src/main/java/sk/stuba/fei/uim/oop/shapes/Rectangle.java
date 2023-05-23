package sk.stuba.fei.uim.oop.shapes;

import java.awt.*;

public class Rectangle extends Shape {

    public Rectangle(int x, int y, int radius) {
        super(x, y, radius);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(x, y, radius, radius);
    }

}
