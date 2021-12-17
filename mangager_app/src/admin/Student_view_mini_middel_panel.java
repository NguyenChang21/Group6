package admin;

import prototype.rounded_panel;

import javax.swing.*;
import java.awt.*;

public class Student_view_mini_middel_panel extends JPanel {
    public Student_view_mini_middel_panel(int radius, Color bgColor) {
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gbl);
        gbc.weightx=1;
        gbc.weighty=1;

        gbc.fill = GridBagConstraints.BOTH;

        JPanel p1 = new rounded_panel(50,Color.BLACK);
        p1.setOpaque(false);

        JPanel p2 = new JPanel();
        p2.setBackground(Color.cyan);

        JPanel p3 = new rounded_panel(50,Color.DARK_GRAY);
        p3.setOpaque(false);

        JPanel p4 = new JPanel();
        p4.setBackground(Color.cyan);

        JPanel p5 = new rounded_panel(50,Color.DARK_GRAY);
        p5.setOpaque(false);


        JLabel name = new JLabel();
        name.setText("Họ và tên:");
        name.setFont(new Font(null, Font.BOLD, 20));
        p1.add(name);
        JTextField fname = new JTextField();
        fname.setFont(new Font(null, Font.BOLD, 20));
        fname.setPreferredSize(new Dimension(350, 40));
        fname.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        fname.setHorizontalAlignment(JTextField.CENTER);
        p1.add(fname);
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

        gbc.gridy = 0;
        gbc.gridx = 0;
        add(p1,gbc);

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
