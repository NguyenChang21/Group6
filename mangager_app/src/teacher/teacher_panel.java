package teacher;

import lgScreen.main;
import mainScreen.mainPanel;
import mainScreen.top_panel;
import prototype.rounded_button;
import student.class_panel.Class_panel;
import teacher.info_panel.Teacher_edit_panel;
import teacher.menu_panel.Menu_panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Format;
import java.text.SimpleDateFormat;

public class teacher_panel extends mainPanel implements ActionListener {
    private int button_width;

    rounded_button menu_button;
    rounded_button class_button;
    rounded_button info_button;

    Color c1 = new Color(234, 162, 133);
    Color c2 = new Color(240, 134, 84);

    CardLayout cl = new CardLayout();
    Teacher_edit_panel teacher_edit_panel;
    Menu_panel menu_panel;
    Class_panel class_panel;
    public teacher_panel(){
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


//        class_button = new rounded_button("Lớp học", c1, c2);
//        class_button.addActionListener(this);
//        class_button.setPreferredSize(new Dimension(100, 60));
//        class_button.setFont(new Font(null, Font.BOLD, 20));
//        class_button.setArc(25);
//        gbc.gridy = 1;
//        mid_panel.buttoncenter_panel.add(class_button, gbc);

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
        teacher_edit_panel = new Teacher_edit_panel(70, new Color(195, 175, 145));
        mid_panel.view_panel.add(menu_panel, "menu_panel");
        mid_panel.view_panel.add(class_panel, "class_panel");
        mid_panel.view_panel.add(teacher_edit_panel, "info_panel");

        cl.show(mid_panel.view_panel, "view_panel");

    }
    @Override
    public top_panel getToppanel(){
        return toppanel;
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
            try {
                while (main.rs_user.next()){

                    teacher_edit_panel.pmid.lpanel.faddress.setText(main.rs_user.getString("address"));

                    Format formatter = new SimpleDateFormat("dd/MM/yyyy");
                    teacher_edit_panel.pmid.lpanel.fdob.setText(formatter.format(main.rs_user.getDate("date_of_birth").getTime()));
                    teacher_edit_panel.pmid.lpanel.fethnic.setText(main.rs_user.getString("ethnic"));
                    teacher_edit_panel.pmid.lpanel.fgender.setText(main.rs_user.getString("gender"));
                    teacher_edit_panel.pmid.lpanel.fhometown.setText(main.rs_user.getString("hometown"));
                    teacher_edit_panel.pmid.lpanel.fname.setText(main.rs_user.getString("fname") + main.rs_user.getString("lname"));
                    teacher_edit_panel.pmid.lpanel.freligion.setText(main.rs_user.getString("religion"));
                    teacher_edit_panel.pmid.lpanel.fiD_number.setText(main.rs_user.getString("CMND"));

                    teacher_edit_panel.pmid.rpanel.fphonenumber.setText(main.rs_user.getString("phone_number"));
                    teacher_edit_panel.pmid.rpanel.femail.setText(main.rs_user.getString("email"));
                    teacher_edit_panel.pmid.rpanel.fdepartment.setText(main.rs_user.getString("department"));
                    teacher_edit_panel.pmid.rpanel.fpassword.setText(main.rs_user.getString("password"));
                    teacher_edit_panel.pmid.rpanel.fstatus.setText(main.rs_user.getString("status"));
                    teacher_edit_panel.pmid.rpanel.fqualification.setText(main.rs_user.getString("qualification"));

                    getToppanel().username_label.setText("Xin chào " + main.rs_user.getString("fname") + main.rs_user.getString("lname"));
                    teacher_edit_panel.pmid.rpanel.fusername.setText(main.rs_user.getString("username"));
                }

            } catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
