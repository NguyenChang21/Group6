package admin.student_panel;
import prototype.rounded_panel;

import javax.swing.*;
import java.awt.*;

public class Student_edit_middle_panel extends rounded_panel {
    public Student_edit_middle_panel(int radius, Color Cyan) {
        super(radius, Color.cyan);
    GridBagLayout gbl = new GridBagLayout();
    GridBagConstraints gbc = new GridBagConstraints();
    setLayout(gbl);
    gbc.weightx=1;
    gbc.weighty=1;
    gbc.fill = GridBagConstraints.BOTH;

//        JLabel name = new JLabel();
//        name.setText("Họ và tên:");
//        name.setFont(new Font(null, Font.BOLD, 20));
//
//        JTextField fname = new JTextField();
//        fname.setFont(new Font(null, Font.BOLD, 20));
//        fname.setPreferredSize(new Dimension(350, 40));
//        fname.setAlignmentY(Component.BOTTOM_ALIGNMENT);
//        fname.setHorizontalAlignment(JTextField.CENTER);
//
//        JLabel dob = new JLabel();
//        dob.setText("Ngày sinh:");
//        dob.setFont(new Font(null, Font.BOLD, 20));
//
//        JTextField fdob = new JTextField();
//        fdob.setFont(new Font(null, Font.BOLD, 20));
//        fdob.setPreferredSize(new Dimension(350, 40));
//        fdob.setAlignmentY(Component.BOTTOM_ALIGNMENT);
//        fdob.setHorizontalAlignment(JTextField.CENTER);
//
//        JLabel gender = new JLabel();
//        gender.setText("Giới tính:");
//        gender.setFont(new Font(null, Font.BOLD, 20));
//
//        JTextField fgender = new JTextField();
//        fgender.setFont(new Font(null, Font.BOLD, 20));
//        fgender.setPreferredSize(new Dimension(350, 40));
//        fgender.setAlignmentY(Component.BOTTOM_ALIGNMENT);
//        fgender.setHorizontalAlignment(JTextField.CENTER);
//
//        JLabel origin = new JLabel();
//        origin.setText("Quê quán:");
//        origin.setFont(new Font(null, Font.BOLD, 20));
//
//        JTextField forigin = new JTextField();
//        forigin.setFont(new Font(null, Font.BOLD, 20));
//        forigin.setPreferredSize(new Dimension(350, 40));
//        forigin.setAlignmentY(Component.BOTTOM_ALIGNMENT);
//        forigin.setHorizontalAlignment(JTextField.CENTER);
//
//        JLabel address = new JLabel();
//        address.setText("Địa chỉ:");
//        address.setFont(new Font(null, Font.BOLD, 20));
//
//
//        JTextField faddress = new JTextField();
//        faddress.setFont(new Font(null, Font.BOLD, 20));
//        faddress.setPreferredSize(new Dimension(350, 40));
//        faddress.setAlignmentY(Component.BOTTOM_ALIGNMENT);
//        faddress.setHorizontalAlignment(JTextField.CENTER);
//
//        JLabel email = new JLabel();
//        email.setText("Email:");
//        email.setFont(new Font(null, Font.BOLD, 20));
//
//        JTextField fmail = new JTextField();
//        fmail.setFont(new Font(null, Font.BOLD, 20));
//        fmail.setPreferredSize(new Dimension(350, 40));
//        fmail.setAlignmentY(Component.BOTTOM_ALIGNMENT);
//        fmail.setHorizontalAlignment(JTextField.CENTER);
//
//        JLabel phone_number = new JLabel();
//        phone_number.setText("Số điện thoại:");
//        phone_number.setFont(new Font(null, Font.BOLD, 20));
//
//        JTextField fphone_number = new JTextField();
//        fphone_number.setFont(new Font(null, Font.BOLD, 20));
//        fphone_number.setPreferredSize(new Dimension(350, 40));
//        fphone_number.setAlignmentY(Component.BOTTOM_ALIGNMENT);
//        fphone_number.setHorizontalAlignment(JTextField.CENTER);
//
//        JLabel religion = new JLabel();
//        religion.setText("Quốc tịch:");
//        religion.setFont(new Font(null, Font.BOLD, 20));
//
//        JTextField freligion = new JTextField();
//        freligion.setFont(new Font(null, Font.BOLD, 20));
//        freligion.setPreferredSize(new Dimension(350, 40));
//        freligion.setAlignmentY(Component.BOTTOM_ALIGNMENT);
//        freligion.setHorizontalAlignment(JTextField.CENTER);
//
//        JLabel ethnic_group = new JLabel();
//        ethnic_group.setText("Dân tộc:");
//        ethnic_group.setFont(new Font(null, Font.BOLD, 20));
//
//        JTextField fethnic_group = new JTextField();
//        fethnic_group.setFont(new Font(null, Font.BOLD, 20));
//        fethnic_group.setPreferredSize(new Dimension(350, 40));
//        fethnic_group.setAlignmentY(Component.BOTTOM_ALIGNMENT);
//        fethnic_group.setHorizontalAlignment(JTextField.CENTER);
//
//        JLabel id_number = new JLabel();
//        id_number.setText("Số CMND,CCCD:");
//        id_number.setFont(new Font(null, Font.BOLD, 20));
//
//        JTextField fid_number = new JTextField();
//        fid_number.setFont(new Font(null, Font.BOLD, 20));
//        fid_number.setPreferredSize(new Dimension(350, 40));
//        fid_number.setAlignmentY(Component.BOTTOM_ALIGNMENT);
//        fid_number.setHorizontalAlignment(JTextField.CENTER);
//
//        JLabel status = new JLabel();
//        status.setText("Trạng thái:");
//        status.setFont(new Font(null, Font.BOLD, 20));
//
//        JTextField fstatus = new JTextField();
//        fstatus.setFont(new Font(null, Font.BOLD, 20));
//        fstatus.setPreferredSize(new Dimension(350, 40));
//        fstatus.setAlignmentY(Component.BOTTOM_ALIGNMENT);
//        fstatus.setHorizontalAlignment(JTextField.CENTER);
//
//        JLabel username = new JLabel();
//        username.setText("Username:");
//        username.setFont(new Font(null, Font.BOLD, 20));
//
//        JTextField fusername = new JTextField();
//        fusername.setFont(new Font(null, Font.BOLD, 20));
//        fusername.setPreferredSize(new Dimension(350, 40));
//        fusername.setAlignmentY(Component.BOTTOM_ALIGNMENT);
//        fusername.setHorizontalAlignment(JTextField.CENTER);
//
//        JLabel password = new JLabel();
//        password.setText("Password:");
//        password.setFont(new Font(null, Font.BOLD, 20));
//
//        JTextField fpassword = new JTextField();
//        fpassword.setFont(new Font(null, Font.BOLD, 20));
//        fpassword.setPreferredSize(new Dimension(350, 40));
//        fpassword.setAlignmentY(Component.BOTTOM_ALIGNMENT);
//        fpassword.setHorizontalAlignment(JTextField.CENTER);
//
//        JLabel department = new JLabel();
//        department.setText("Username:");
//        department.setFont(new Font(null, Font.BOLD, 20));
//
//        JTextField fdepartment = new JTextField();
//        fdepartment.setFont(new Font(null, Font.BOLD, 20));
//        fdepartment.setPreferredSize(new Dimension(350, 40));
//        fdepartment.setAlignmentY(Component.BOTTOM_ALIGNMENT);
//        fdepartment.setHorizontalAlignment(JTextField.CENTER);
//
//        JLabel schoolyear = new JLabel();
//        username.setText("Username:");
//        username.setFont(new Font(null, Font.BOLD, 20));
//
//        JTextField fusername = new JTextField();
//        fusername.setFont(new Font(null, Font.BOLD, 20));
//        fusername.setPreferredSize(new Dimension(350, 40));
//        fusername.setAlignmentY(Component.BOTTOM_ALIGNMENT);
//        fusername.setHorizontalAlignment(JTextField.CENTER);


    JPanel p1 = new JPanel();
    p1.setBackground(Color.cyan);

//    JPanel p2 = new JPanel();
//    p2.setBackground(Color.cyan);

    rounded_panel p2 = new Student_edit_leftcorner_panel(40,Color.pink);
    p2.setOpaque(false);

    JPanel p3 = new JPanel();
    p3.setBackground(Color.cyan);

    rounded_panel p4 = new rounded_panel(40,Color.pink);
    p4.setOpaque(false);

    JPanel p5 = new JPanel();
    p5.setBackground(Color.cyan);

//    JPanel p7 = new JPanel();
//    p7.setBackground(Color.cyan);

    gbc.weightx=0.1;
    gbc.gridy = 0;
    gbc.gridx = 0;
    add(p1,gbc);
    gbc.weightx=1;
    gbc.gridy = 0;
    gbc.gridx = 1;
    add(p2,gbc);
    gbc.weightx=0.05;
    gbc.gridx= 2;
    gbc.gridy = 0;
    add(p3,gbc);
    gbc.weightx=1;
    gbc.gridx = 3;
    gbc.gridy = 0;
    add(p4,gbc);

    gbc.weightx=0.1;
    gbc.gridx = 4;
    gbc.gridy = 0;
    add(p5,gbc);

//    gbc.gridx = 0;
//    gbc.gridy = 2;
//    add(p6,gbc);


}

}
