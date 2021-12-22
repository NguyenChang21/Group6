package student;
import mainScreen.mainPanel;

import prototype.rounded_button;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class student_panel extends mainPanel implements ActionListener {
    private int button_width;

    rounded_button menu_button;
    rounded_button class_button;
    rounded_button info_button;

    Color c1 = new Color(234, 162, 133);
    Color c2 = new Color(240, 134, 84);

    CardLayout cl = new CardLayout();
    Student_view_panel student_view_panel;
    Menu_panel menu_panel;
    Class_panel class_panel;
    public student_panel(){
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        mid_panel.buttoncenter_panel.setLayout(gbl);


        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.weighty = 0.1f;

        menu_button = new rounded_button("Trang chủ", c1, c2);
        menu_button.addActionListener(this);
        menu_button.setPreferredSize(new Dimension(100, 60));
        menu_button.setFont(new Font(null, Font.BOLD, 20));
        menu_button.setArc(25);
        gbc.gridy = 0;
        mid_panel.buttoncenter_panel.add(menu_button, gbc);


        class_button = new rounded_button("Lớp học", c1, c2);
        class_button.addActionListener(this);
        class_button.setPreferredSize(new Dimension(100, 60));
        class_button.setFont(new Font(null, Font.BOLD, 20));
        class_button.setArc(25);
        gbc.gridy = 1;
        mid_panel.buttoncenter_panel.add(class_button, gbc);

        info_button = new rounded_button("Thông tin", c1, c2);
        info_button.addActionListener(this);
        info_button.setPreferredSize(new Dimension(100, 60));
        info_button.setFont(new Font(null, Font.BOLD, 20));
        info_button.setArc(25);
        gbc.gridy = 2;
        mid_panel.buttoncenter_panel.add(info_button, gbc);

        gbc.fill = GridBagConstraints.BOTH;
        JPanel p1 = new JPanel();
        p1.setOpaque(false);
        gbc.weighty = 1;
        gbc.gridy = 7;
        mid_panel.buttoncenter_panel.add(p1, gbc);

        mid_panel.view_panel.setLayout(cl);
        menu_panel = new Menu_panel(70, new Color(195, 175, 145));
        class_panel = new Class_panel(70, new Color(195, 175, 145));
        student_view_panel = new Student_view_panel(70, new Color(195, 175, 145));
        mid_panel.view_panel.add(menu_panel, "menu_panel");
        mid_panel.view_panel.add(class_panel, "class_panel");
        mid_panel.view_panel.add(student_view_panel, "info_panel");

        cl.show(mid_panel.view_panel, "view_panel");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == menu_button){
            cl.show(mid_panel.view_panel, "menu_panel");
        }
        if (e.getSource() == class_button){
            cl.show(mid_panel.view_panel, "class_panel");
        }
        if (e.getSource() == info_button){
            cl.show(mid_panel.view_panel, "info_panel");
        }
    }
}
