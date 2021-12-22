package student;

import lgScreen.main;
import prototype.rounded_panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Student_view_panel extends rounded_panel implements ActionListener {
    public Student_view_toppanel ptop;
    public Student_view_middlepanel pmid;

    public Student_view_panel(int radius) {
        super(radius);
    }

    public Student_view_panel(int radius, Color bgColor) {
        super(radius, bgColor);
        setOpaque(false);
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gbl);
        gbc.weightx=1;
        gbc.weighty=1;
        gbc.fill = GridBagConstraints.BOTH;
        ptop = new Student_view_toppanel();
        ptop.setOpaque(false);

        pmid = new Student_view_middlepanel();
        pmid.setOpaque(false);


        JPanel p3 = new JPanel();
        p3.setOpaque(false);

        gbc.weighty = 0.1;
        gbc.gridy = 0;
        gbc.gridx = 0;
        add(ptop,gbc);

        gbc.weighty = 0.8;
        gbc.gridx =0;
        gbc.gridy =1;
        add(pmid,gbc);

        gbc.weighty = 0.01;
        gbc.gridy = 2;
        gbc.gridx = 0;
        add(p3,gbc);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
