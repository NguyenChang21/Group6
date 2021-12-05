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
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
