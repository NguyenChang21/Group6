package lgScreen;

import admin.admin_panel;
import admin.teacher_panel.Teacher_view_panel;
import student.info_panel.student_panel;
import teacher.teacher_panel;

import javax.swing.*;
import java.awt.*;
public class Frame extends JFrame {
    static JPanel constpanel;
    public static login_screen loginScreen;
    public static admin_panel adminPanel = new admin_panel();
    public static student_panel studentPanel;
    public static teacher_panel teacherPanel;
    public static CardLayout cl = new CardLayout();
    public Frame(){

        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
//        setMinimumSize(new Dimension(1100, 730));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        constpanel = new JPanel();
        constpanel.setLayout(cl);

        loginScreen = new login_screen();
        constpanel.add(loginScreen, "login");


        constpanel.add(adminPanel, "admin");

        studentPanel = new student_panel();
        constpanel.add(studentPanel, "student");

        teacherPanel = new teacher_panel();
        constpanel.add(teacherPanel, "teacher");

        cl.show(constpanel, "admin");
        add(constpanel);
        getContentPane().setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        pack();
        setLocationRelativeTo(null);

        setVisible(true);
    }
}
