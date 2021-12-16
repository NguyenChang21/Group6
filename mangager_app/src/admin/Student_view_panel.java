package admin;
import prototype.rounded_panel;

import javax.swing.*;
import java.awt.*;

public class Student_view_panel extends rounded_panel{
    public Student_view_panel(int radius) {
        super(radius);
    }

    public Student_view_panel(int radius, Color bgColor) {
        super(radius, bgColor);
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gbl);

        gbc.fill = GridBagConstraints.BOTH;

        gbc.weighty = 1;
        gbc.weightx = 1;

        JPanel p1 = new JPanel();
        p1.setBackground(Color.YELLOW);
        JPanel p2 = new JPanel();
        p2.setBackground(Color.RED);
        JPanel p3 = new JPanel();
        p3.setBackground(Color.BLUE);
        JPanel p4 = new JPanel();
        p4.setBackground(Color.GREEN);
        JPanel cp = new JPanel();
        cp.setBackground(Color.GRAY);

        gbc.weightx = 0.01;
        gbc.gridheight = 3;
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(p1, gbc);

        gbc.weighty = 0.03;
        gbc.weightx = 1;
        gbc.gridheight = 1;
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(p2, gbc);

        gbc.weightx = 0.01;
        gbc.gridheight = 3;
        gbc.gridx = 2;
        gbc.gridy = 0;
        add(p3, gbc);

        gbc.weighty = 1;
        gbc.weightx = 1;
        gbc.gridheight = 1;
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(cp, gbc);

        gbc.weighty = 0.03;
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(p4, gbc);
    }
}
