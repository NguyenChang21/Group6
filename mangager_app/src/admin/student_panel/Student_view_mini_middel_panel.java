package admin.student_panel;

import prototype.rounded_panel;

import javax.swing.*;
import java.awt.*;

public class Student_view_mini_middel_panel extends JPanel {
    public Student_view_mini_middel_panel() {
        setOpaque(false);
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gbl);
        gbc.weightx=1;
        gbc.weighty=1;

        gbc.fill = GridBagConstraints.BOTH;

        Student_leftcorner_panel pn1 = new Student_leftcorner_panel(50,Color.BLACK);
        pn1.setOpaque(false);

        JPanel p2 = new JPanel();
        p2.setOpaque(false);

        Student_rightcorner_panel p3 = new Student_rightcorner_panel(50,Color.DARK_GRAY);
        p3.setOpaque(false);

        JPanel p4 = new JPanel();
        p4.setOpaque(false);

        JPanel p5 = new rounded_panel(50,Color.DARK_GRAY);
        p5.setOpaque(false);



        gbc.gridy = 0;
        gbc.gridx = 0;
        add(pn1,gbc);

        gbc.weightx = 0.01;
        gbc.gridheight = 3;
        gbc.gridx =1;
        gbc.gridy =0;
        add(p2,gbc);

        gbc.weightx = 0.7;
        gbc.gridy = 0;
        gbc.gridx = 2;
        add(p3,gbc);
        gbc.gridheight = 1;
        gbc.weighty=0.01;
        gbc.gridx= 0;
        gbc.gridy = 1;
        add(p4,gbc);
        gbc.weightx = 1;
        gbc.weighty=0.3;
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(p5,gbc);





    }
}
