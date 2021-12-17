package admin;

import prototype.rounded_panel;

import javax.swing.*;
import java.awt.*;

public class Student_view_zone1 extends rounded_panel {

    public Student_view_zone1(int radius) {
        super(radius);
    }

    public Student_view_zone1(int radius, Color bgColor) {
        super(radius, bgColor);
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gbl);
        gbc.weightx=1;
        gbc.weighty=1;

        JLabel name = new JLabel();
        name.setText("Họ và tên:");
        name.setFont(new Font(null, Font.BOLD, 20));

        JTextField fname = new JTextField();
        fname.setFont(new Font(null, Font.BOLD, 20));
        fname.setPreferredSize(new Dimension(350, 40));
        fname.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        fname.setHorizontalAlignment(JTextField.CENTER);

        JLabel dob = new JLabel();
        dob.setText("Ngày sinh:");
        dob.setFont(new Font(null, Font.BOLD, 20));

        JTextField fdob = new JTextField();
        fdob.setFont(new Font(null, Font.BOLD, 20));
        fdob.setPreferredSize(new Dimension(350, 40));
        fdob.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        fdob.setHorizontalAlignment(JTextField.CENTER);

        JLabel gender = new JLabel();
        gender.setText("Giới tính:");
        gender.setFont(new Font(null, Font.BOLD, 20));

        JTextField fgender = new JTextField();
        fgender.setFont(new Font(null, Font.BOLD, 20));
        fgender.setPreferredSize(new Dimension(350, 40));
        fgender.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        fgender.setHorizontalAlignment(JTextField.CENTER);

        JLabel origin = new JLabel();
        origin.setText("Quê quán:");
        origin.setFont(new Font(null, Font.BOLD, 20));

        JTextField forigin = new JTextField();
        forigin.setFont(new Font(null, Font.BOLD, 20));
        forigin.setPreferredSize(new Dimension(350, 40));
        forigin.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        forigin.setHorizontalAlignment(JTextField.CENTER);

        JLabel address = new JLabel();
        address.setText("Địa chỉ:");
        address.setFont(new Font(null, Font.BOLD, 20));


        JTextField faddress = new JTextField();
        faddress.setFont(new Font(null, Font.BOLD, 20));
        faddress.setPreferredSize(new Dimension(350, 40));
        faddress.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        faddress.setHorizontalAlignment(JTextField.CENTER);

        JLabel email = new JLabel();
        email.setText("Email:");
        email.setFont(new Font(null, Font.BOLD, 20));

        JTextField fmail = new JTextField();
        fmail.setFont(new Font(null, Font.BOLD, 20));
        fmail.setPreferredSize(new Dimension(350, 40));
        fmail.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        fmail.setHorizontalAlignment(JTextField.CENTER);

        JLabel phone_number = new JLabel();
        phone_number.setText("Số điện thoại:");
        phone_number.setFont(new Font(null, Font.BOLD, 20));

        JTextField fphone_number = new JTextField();
        fphone_number.setFont(new Font(null, Font.BOLD, 20));
        fphone_number.setPreferredSize(new Dimension(350, 40));
        fphone_number.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        fphone_number.setHorizontalAlignment(JTextField.CENTER);

        JPanel p1 = new JPanel();
        p1.add(name);

        JPanel p2 = new JPanel();
        p2.add(fname);

        JPanel p3 = new JPanel();
        p3.add(gender);

        JPanel p4 = new JPanel();
        p4.add(fgender);

        JPanel p5 = new JPanel();
        p5.add(dob);

        JPanel p6 = new JPanel();
        p6.add(fdob);

        JPanel p7 = new JPanel();
        p7.add(origin);

        JPanel p8 = new JPanel();
        p8.add(forigin);

        JPanel p9 = new JPanel();
        p9.add(address);

        JPanel p10 = new JPanel();
        p10.add(faddress);

        JPanel p11 = new JPanel();
        p11.setBackground(Color.cyan);
        p11.add(email);

        JPanel p12 = new JPanel();
        p12.add(fmail);

        JPanel p13 = new JPanel();
        p13.add(phone_number);

        JPanel p14 = new JPanel();
        p14.add(fphone_number);

        gbc.gridy = 0;
        gbc.gridx = 0;
        add(p1,gbc);

        gbc.gridx =1;
        gbc.gridy =0;
        add(p2,gbc);

        gbc.gridx = 0;
        gbc.gridy =1;
        add(p3,gbc);

        gbc.gridx= 1;
        gbc.gridy = 1;
        add(p4,gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(p5,gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        add(p6,gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(p7,gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        add(p8,gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        add(p9,gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        add(p10,gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        add(p11,gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
        add(p12,gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        add(p13,gbc);

        gbc.gridx = 1;
        gbc.gridy = 6;
        add(p14,gbc);

    }
}
