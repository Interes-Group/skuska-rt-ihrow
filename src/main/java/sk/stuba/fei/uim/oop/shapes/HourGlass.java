package sk.stuba.fei.uim.oop.shapes;

import java.awt.*;

public class HourGlass extends Shape {

    public HourGlass(int x, int y, int radius) {
        super(x, y, radius);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        int xPoints[] = {this.x - radius, this.x + radius, this.x};
        int yPointsTop[] = {this.y - radius/2,this.y - radius/2,this.y};
        int yPointsBottom[] = {this.y + radius/2,this.y + radius/2,this.y};

        g.fillPolygon(xPoints, yPointsTop, 3);
        g.fillPolygon(xPoints, yPointsBottom, 3);
    }

}