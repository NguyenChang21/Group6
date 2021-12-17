package admin;

import prototype.rounded_panel;

import javax.swing.*;
import java.awt.*;

public class Student_view_middlepanel extends rounded_panel {
    public Student_view_middlepanel(int radius) {
        super(radius);
    }

    public Student_view_middlepanel(int radius, Color bgColor) {
        super(radius, bgColor);
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gbl);
        gbc.weightx=1;
        gbc.weighty=1;
        gbc.fill = GridBagConstraints.BOTH;
        JPanel p1 = new JPanel();
        p1.setBackground(Color.cyan);

        JPanel p2 = new JPanel();
        p2.setBackground(Color.cyan);

        JPanel p3 = new JPanel();
        p3.setBackground(Color.cyan);

        JPanel p4 = new Student_view_mini_middel_panel(4,Color.DARK_GRAY);
        p4.setOpaque(false);

        JPanel p5 = new JPanel();
        p5.setBackground(Color.cyan);


        gbc.gridheight = 3;
        gbc.weightx = 0.01;
        gbc.gridy = 0;
        gbc.gridx = 0;
        add(p1,gbc);


        gbc.gridheight =1;
        gbc.weightx = 1;
        gbc.weighty = 0.01;

        gbc.gridx =1;
        gbc.gridy =0;
        add(p2,gbc);

        gbc.gridheight = 3;
        gbc.weightx = 0.01;
        gbc.weighty = 1;
        gbc.gridy = 0;
        gbc.gridx = 2;
        add(p3,gbc);

        gbc.gridheight = 1;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.gridx= 1;
        gbc.gridy = 1;
        add(p4,gbc);

        gbc.weightx = 1;
        gbc.weighty = 0.01;
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(p5,gbc);
    }
}

