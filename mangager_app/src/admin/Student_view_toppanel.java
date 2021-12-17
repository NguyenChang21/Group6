package admin;

import prototype.rounded_button;
import prototype.textfield_type;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student_view_toppanel extends JPanel implements ActionListener {
    rounded_button find;
    public Student_view_toppanel(int radius, Color bgColor) {
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gbl);
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;

//        JPanel p1 = new JPanel();
//        p1.setBackground(Color.cyan);

        JLabel addId = new JLabel();
        addId.setText("Nhập mã sinh viên:");
        addId.setFont(new Font(null, Font.ITALIC, 35));
        gbc.fill = GridBagConstraints.NONE;
//
//        JPanel p2 = new JPanel();
//        p2.setBackground(Color.cyan);

        textfield_type getId = new textfield_type();
        getId.setFont(new Font(null, Font.ITALIC, 20));
        getId.setPreferredSize(new Dimension(600, 60));
        getId.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        getId.setHorizontalAlignment(JTextField.CENTER);
        add(getId);
//        JPanel p3 = new JPanel();
//        p3.setBackground(Color.cyan);

        find = new rounded_button("Tìm kiếm",
                new Color(245, 220, 100), new Color(220, 159, 56), "find");
        find.setPreferredSize(new Dimension(150, 55));
        find.setFont(new Font(null, Font.BOLD, 20));
        find.addActionListener(this);

//        JPanel p4 = new JPanel();
//        p4.setBackground(Color.cyan);
//
//        JPanel p5 = new JPanel();
//        p5.setBackground(Color.cyan);
//
//        JPanel p6 = new JPanel();
//        p6.setBackground(Color.cyan);

        JPanel p7 = new JPanel();
        p7.setBackground(Color.cyan);
        p7.add(addId);

        JPanel p8 = new JPanel();
        p8.setBackground(Color.cyan);
        p8.add(getId);

        JPanel p9 = new JPanel();
        p9.setBackground(Color.cyan);
        p9.add(find);

//        gbc.gridy = 0;
//        gbc.gridx = 0;
//        add(p1,gbc);

        gbc.weighty = 0.7;
        gbc.gridy = 0;
        gbc.gridx = 1;
        add(p7,gbc);

//        gbc.gridy = 0;
//        gbc.gridx = 2;
//        add(p2,gbc);
        gbc.weighty = 1;
        gbc.gridy = 0;
        gbc.gridx = 3;
        add(p8,gbc);

//        gbc.gridy = 0;
//        gbc.gridx = 4;
//        add(p3,gbc);

        gbc.gridy = 0;
        gbc.gridx = 5;
        add(p9,gbc);

//        gbc.gridy = 0;
//        gbc.gridx = 0;
//        add(p4,gbc);
//
//        gbc.gridy = 1;
//        gbc.gridx = 0;
//        add(p5,gbc);
//
//        gbc.gridy = 2;
//        gbc.gridx = 0;
//        add(p6,gbc);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

