package admin.menu_panel;

import prototype.rounded_panel;

import javax.swing.*;
import java.awt.*;

public class Menu_mid_leftcorner_panel extends rounded_panel {

    public Menu_mid_leftcorner_panel(int radius, Color bgColor) {
        super(radius, bgColor);
        setBackground(Color.lightGray);

        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gbl);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.weighty = 1;

        JLabel infomation = new JLabel();
        infomation.setText("THÔNG TIN CHUNG");
        infomation.setFont(new Font(null, Font.BOLD, 25));
        JPanel p1 = new rounded_panel(4,Color.cyan);
        p1.setLayout(new FlowLayout(FlowLayout.CENTER));
        p1.setOpaque(false);
        p1.add(infomation);
        add(p1, gbc);

//        JLabel schoolname = new JLabel();
//        schoolname.setText("Tên trường: Trường Đại học Khoa học Tự nhiên, Đại học Quốc gia Hà Nội");
//        schoolname.setFont(new Font(null, Font.BOLD, 18));
//        JPanel p2 = new JPanel();
//        p2.setLayout(new FlowLayout(FlowLayout.LEFT));
//        p2.setOpaque(false);
//        p2.add(schoolname);
//        gbc.gridx = 0;
//        gbc.gridy = 1;
//        add(p2, gbc);

        JLabel type = new JLabel();
        type.setText("Loại: Đại học công lập");
        type.setFont(new Font(null, Font.BOLD, 18));
        type.setPreferredSize(new Dimension(200, 50));
        JPanel p3 = new JPanel();
        p3.setLayout(new FlowLayout(FlowLayout.LEFT));
        p3.setOpaque(false);
        p3.add(type);
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(p3, gbc);
        JLabel founded_year = new JLabel();
        founded_year.setText("Năm thành lập: 1993");
        founded_year.setFont(new Font(null, Font.BOLD, 18));
//        JLabel student_number = new JLabel();
//        student_number.setText("Tổng số sinh viên của trường:");
//        student_number.setFont(new Font(null, Font.BOLD, 18));

        JPanel p4 = new rounded_panel(4,Color.white);
        p4.setLayout(new FlowLayout(FlowLayout.LEFT));
        p4.setOpaque(false);
        p4.add(founded_year);
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(p4, gbc);

        JLabel principal = new JLabel();
        principal.setText("Hiệu trưởng: PGS. TSKH. Vũ Hoàng Linh");
        principal.setFont(new Font(null, Font.BOLD, 18));

        JPanel p5 = new JPanel();
        p5.setLayout(new FlowLayout(FlowLayout.LEFT));
        p5.setOpaque(true);
        p5.add(principal);
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(p5, gbc);

//        JLabel department_number = new JLabel();
//        department_number.setText("Tổng số khoa của trường:");
//        department_number.setFont(new Font(null, Font.BOLD, 18));

        JLabel student_number = new JLabel();
        student_number.setText("Tổng số sinh viên của trường:");
        student_number.setFont(new Font(null, Font.BOLD, 18));

        JPanel p6 = new JPanel();
        p6.setLayout(new FlowLayout(FlowLayout.LEFT));
        p6.setOpaque(false);
        p6.add(student_number);
        gbc.gridx = 0;
        gbc.gridy = 5;
        add(p6, gbc);


        JLabel teacher_number = new JLabel();
        teacher_number.setText("Tổng số giảng viên đang giảng dạy tại trường:");
        teacher_number.setFont(new Font(null, Font.BOLD, 18));


        JPanel p7 = new JPanel();
        p7.setLayout(new FlowLayout(FlowLayout.LEFT));
        p7.setOpaque(false);
        p7.add(teacher_number);
        gbc.gridx = 0;
        gbc.gridy = 6;
        add(p7, gbc);

        JLabel department_number = new JLabel();
        department_number.setText("Tổng số khoa của trường:");
        department_number.setFont(new Font(null, Font.BOLD, 18));


        JPanel p8 = new JPanel();
        p8.setLayout(new FlowLayout(FlowLayout.LEFT));
        p8.setOpaque(false);
        p8.add(department_number);
        gbc.gridx = 0;
        gbc.gridy = 6;
        add(p7, gbc);

        JLabel major_number = new JLabel();
        major_number.setText("Tổng số ngành đào tạo của trường:");
        major_number.setFont(new Font(null, Font.BOLD, 18));

        JPanel p9 = new JPanel();
        p9.setLayout(new FlowLayout(FlowLayout.LEFT));
        p9.setOpaque(false);
        p9.add(major_number);
        gbc.gridx = 0;
        gbc.gridy = 8;
        add(p9, gbc);

    }


}
