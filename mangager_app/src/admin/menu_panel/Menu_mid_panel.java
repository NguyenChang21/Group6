package admin.menu_panel;

import admin.student_panel.Student_edit_leftcorner_panel;
import admin.student_panel.Student_edit_rightcorner_panel;
import prototype.rounded_panel;

import javax.swing.*;
import java.awt.*;

public class Menu_mid_panel extends rounded_panel {

    public Menu_mid_leftcorner_panel lpanel;
    public Menu_mid_rightcorner_panel rpanel;

    public Menu_mid_panel(int radius, Color bgColor) {
        super(radius, bgColor);
        setBackground(Color.lightGray);

        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gbl);
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;

        JPanel p1 = new JPanel();
        p1.setOpaque(false);

        lpanel = new Menu_mid_leftcorner_panel(40,Color.WHITE);
        lpanel.setOpaque(false);

        JPanel p3 = new JPanel();
        p3.setOpaque(false);

        rpanel = new Menu_mid_rightcorner_panel(40,Color.WHITE);
        rpanel.setOpaque(false);

        JPanel p5 = new JPanel();
        p5.setOpaque(false);

        gbc.weightx=0.01;
        gbc.gridy = 0;
        gbc.gridx = 0;
        add(p1,gbc);

        gbc.weightx=0.3;
        gbc.gridy = 0;
        gbc.gridx = 1;
        add(lpanel,gbc);

        gbc.weightx=0.01;
        gbc.gridx= 2;
        gbc.gridy = 0;
        add(p3,gbc);

        gbc.weightx=0.3;
        gbc.gridx = 3;
        gbc.gridy = 0;
        add(rpanel,gbc);

        gbc.weightx=0.01;
        gbc.gridx = 4;
        gbc.gridy = 0;
        add(p5,gbc);













    }
}
