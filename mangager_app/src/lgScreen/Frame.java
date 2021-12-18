package lgScreen;

import admin.admin_panel;
import student.student_panel;
import teacher.teacher_panel;

import javax.swing.*;
import java.awt.*;
public class Frame extends JFrame {
    static JPanel constpanel;
    static login_screen loginScreen;
    static admin_panel adminPanel;
    static student_panel studentPanel;
    static teacher_panel teacherPanel;
    static CardLayout cl = new CardLayout();
    public Frame(){
        setMinimumSize(new Dimension(1000, 640));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        constpanel = new JPanel();
        constpanel.setLayout(cl);

        loginScreen = new login_screen();
        constpanel.add(loginScreen, "login");

        adminPanel = new admin_panel();
        constpanel.add(adminPanel, "admin");

        studentPanel = new student_panel();
        constpanel.add(studentPanel, "student");

        teacherPanel = new teacher_panel();
        constpanel.add(teacherPanel, "teacher");

        cl.show(constpanel, "login");
        add(constpanel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
