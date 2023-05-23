package sk.stuba.fei.uim.oop.controls;

import sk.stuba.fei.uim.oop.gui.Canvas;
import sk.stuba.fei.uim.oop.shapes.Circle;
import sk.stuba.fei.uim.oop.shapes.Rectangle;
import sk.stuba.fei.uim.oop.shapes.Shape;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

public class GameLogic extends UniversalAdapter {
    private final JFrame mainWindow;
    private final Canvas canvas;

    private int radius;


    private String shape;

    public GameLogic(JFrame window) {
        this.mainWindow = window;
        this.canvas = new Canvas();
        this.mainWindow.add(canvas);
        this.canvas.addMouseListener(this);
        this.canvas.addMouseMotionListener(this);
        this.radius = 5;
        this.shape = "CIRCLE";
    }



    @Override
    public void mouseMoved(MouseEvent e) {
        if (shape.equals("CIRCLE")) {
            this.canvas.getShapes().add(new Circle(e.getX(), e.getY(), radius));
        } else if (shape.equals("SQUARE")) {
            this.canvas.getShapes().add(new Rectangle(e.getX(), e.getY(), radius));
        }
        this.canvas.removeShapes();
        this.mainWindow.repaint();
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (((JSlider) e.getSource()).getMajorTickSpacing() == 2) {
            this.canvas.setSpacing(((JSlider) e.getSource()).getValue());
        } else if (((JSlider) e.getSource()).getMajorTickSpacing() == 1) {
            this.radius = ((JSlider) e.getSource()).getValue();
            this.canvas.changeRadius(this.radius);
        } else if (((JSlider) e.getSource()).getMajorTickSpacing() == 10) {
            this.canvas.setLength(((JSlider) e.getSource()).getValue());
        }
        this.mainWindow.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.shape = ((JComboBox) e.getSource()).getSelectedItem().toString();
        this.canvas.changeShapes(this.shape);
        this.mainWindow.repaint();
    }


}
