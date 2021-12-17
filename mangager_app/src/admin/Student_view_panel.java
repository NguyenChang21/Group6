package admin;
import prototype.rounded_panel;
import javax.swing.*;
import java.awt.*;

public class Student_view_panel extends rounded_panel  {


    public Student_view_panel(int radius) {
        super(radius);
    }

    public Student_view_panel(int radius, Color bgColor) {
        super(radius, bgColor);
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gbl);
        gbc.weightx=1;
        gbc.weighty=1;
        gbc.fill = GridBagConstraints.BOTH;
        JPanel p1 = new Student_view_toppanel(4,Color.cyan);
        p1.setBackground(Color.cyan);

        JPanel p2 = new Student_view_middlepanel(4,Color.cyan);
        p2.setBackground(Color.blue);


        JPanel p3 = new JPanel();
        p3.setBackground(Color.cyan);

        gbc.weighty = 0.08;
        gbc.gridy = 0;
        gbc.gridx = 0;
        add(p1,gbc);

        gbc.weighty = 1;
        gbc.gridx =0;
        gbc.gridy =1;
        add(p2,gbc);

        gbc.weighty = 0.01;
        gbc.gridy = 2;
        gbc.gridx = 0;
        add(p3,gbc);

    }
}
