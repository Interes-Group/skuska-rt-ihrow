package sk.stuba.fei.uim.oop.gui;

import lombok.Data;
import sk.stuba.fei.uim.oop.shapes.Circle;
import sk.stuba.fei.uim.oop.shapes.HourGlass;
import sk.stuba.fei.uim.oop.shapes.Rectangle;
import sk.stuba.fei.uim.oop.shapes.Shape;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

@Data
public class Canvas extends JPanel {

    private ArrayList<Shape> shapes;
    private int length;
    private int spacing;

    public Canvas() {
        this.shapes = new ArrayList<>();
        this.length = 70;
        this.spacing = 5;
    }

    public void removeShapes() {
        if (this.shapes.size() > this.length) {
            this.shapes.remove(0);
        }
    }

    public void changeShapes(String shape) {
        ArrayList<Shape> newShapeList = new ArrayList<>();

        for (Shape s : this.shapes) {
            switch (shape) {
                case "CIRCLE":
                    newShapeList.add(new Circle(s.getX(), s.getY(), s.getRadius()));
                    break;
                case "SQUARE":
                    newShapeList.add(new Rectangle(s.getX(), s.getY(), s.getRadius()));
                    break;
                case "HOURGLASS":
                    newShapeList.add(new HourGlass(s.getX(), s.getY(), s.getRadius()));
                    break;
            }
         }

        this.shapes = newShapeList;
    }

    public void changeRadius(int radius) {
        for (Shape s : this.shapes) {
            s.setRadius(radius);
        }
    }



    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        this.removeShapes();
        for (int i = 0; i < this.shapes.size(); i++) {
            g.setColor(new Color((i) % 255, 0, 0));
            if (i == 0 || i == this.shapes.size() - 1 || i % this.spacing == 0) {
                this.shapes.get(i).paintComponent(g);
            }
        }
    }
}

