package sk.stuba.fei.uim.oop.gui;

import sk.stuba.fei.uim.oop.controls.GameLogic;

import javax.swing.*;
import java.awt.*;

public class Window {


    public Window() {
        JFrame frame = new JFrame("ExamRT");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.getContentPane().setBackground(new Color(0xC2BFBF));
        frame.setResizable(false);
        frame.setFocusable(true);

        GameLogic logic = new GameLogic(frame);

        JPanel menu = new JPanel(new BorderLayout());
        JPanel labelsPanel = new JPanel(new GridLayout(1, 3));

        JLabel lengthLabel = new JLabel("Length");
        labelsPanel.add(lengthLabel);
        JLabel radiusLabel = new JLabel("Radius");
        labelsPanel.add(radiusLabel);
        JLabel spacingLabel = new JLabel("Spacing");
        labelsPanel.add(spacingLabel);
        menu.add(labelsPanel, BorderLayout.PAGE_START);

        JPanel sliders = new JPanel(new GridLayout(1, 3));
        JSlider length = new JSlider(JSlider.VERTICAL, 20, 200, 50);
        length.setMajorTickSpacing(10);
        length.setSnapToTicks(true);
        length.setPaintTicks(true);
        length.setPaintLabels(true);
        length.addChangeListener(logic);
        sliders.add(length);


        JSlider radius = new JSlider(JSlider.VERTICAL, 1, 20, 5);
        radius.setMajorTickSpacing(1);
        radius.setSnapToTicks(true);
        radius.setPaintTicks(true);
        radius.setPaintLabels(true);
        radius.addChangeListener(logic);
        sliders.add(radius);


        JSlider spacing = new JSlider(JSlider.VERTICAL, 1, 20, 5);
        spacing.setMajorTickSpacing(2);
        spacing.setSnapToTicks(true);
        spacing.setPaintTicks(true);
        spacing.setPaintLabels(true);
        spacing.addChangeListener(logic);
        sliders.add(spacing);


        String shapes[] = {"CIRCLE", "SQUARE", "HOURGLASS"};
        JComboBox box = new JComboBox(shapes);
        box.addActionListener(logic);

        menu.add(sliders);
        menu.add(box, BorderLayout.PAGE_END);

        frame.add(menu, BorderLayout.EAST);

        frame.setVisible(true);
    }
}
