package student.info_panel;

import javax.swing.*;
import java.awt.*;

public class Student_edit_middle_panel extends JPanel {
    public Student_edit_leftcorner_panel lpanel;
    public Student_edit_rightcorner_panel rpanel;
    public Student_edit_middle_panel() {
        setOpaque(false);
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gbl);
        gbc.weightx=1;
        gbc.weighty=1;
        gbc.fill = GridBagConstraints.BOTH;

        JPanel p1 = new JPanel();
        p1.setOpaque(false);

        lpanel = new Student_edit_leftcorner_panel(40,Color.WHITE);
        lpanel.setOpaque(false);

        JPanel p3 = new JPanel();
        p3.setOpaque(false);

        rpanel = new Student_edit_rightcorner_panel(40,Color.WHITE);
        rpanel.setOpaque(false);

        JPanel p5 = new JPanel();
        p5.setOpaque(false);

        gbc.weightx=0.01;
        gbc.gridy = 0;
        gbc.gridx = 0;
        add(p1,gbc);

        gbc.weightx=0.2;
        gbc.gridy = 0;
        gbc.gridx = 1;
        add(lpanel,gbc);

        gbc.weightx=0.01;
        gbc.gridx= 2;
        gbc.gridy = 0;
        add(p3,gbc);

        gbc.weightx=0.4;
        gbc.gridx = 3;
        gbc.gridy = 0;
        add(rpanel,gbc);

        gbc.weightx=0.01;
        gbc.gridx = 4;
        gbc.gridy = 0;
        add(p5,gbc);



    }

}
