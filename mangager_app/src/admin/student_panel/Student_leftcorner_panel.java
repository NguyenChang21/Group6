package admin.student_panel;
import prototype.rounded_panel;

import javax.swing.*;
import java.awt.*;

public class Student_leftcorner_panel extends rounded_panel {
    public Student_leftcorner_panel(int radius, Color bgColor) {
        super(radius, bgColor);



        JTextField fname = new JTextField();
        fname.setFont(new Font(null, Font.BOLD, 20));
        fname.setPreferredSize(new Dimension(350, 40));
        fname.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        fname.setHorizontalAlignment(JTextField.CENTER);


        JLabel name = new JLabel();
        name.setText("Họ và tên:");
        name.setFont(new Font(null, Font.BOLD, 20));
        name.setLabelFor(fname);
        add(name);
        add(fname);




        JTextField fdob = new JTextField();
        fdob.setFont(new Font(null, Font.BOLD, 20));
        fdob.setPreferredSize(new Dimension(350, 40));
        fdob.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        fdob.setHorizontalAlignment(JTextField.CENTER);

        JLabel dob = new JLabel();
        dob.setText("Ngày sinh:");
        dob.setFont(new Font(null, Font.BOLD, 20));
        dob.setLabelFor(fdob);
        add(dob);
        add(fdob);

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

    }
}
