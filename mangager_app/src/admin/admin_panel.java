package admin;

import mainScreen.mainPanel;
import prototype.rounded_button;
import prototype.option_panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class admin_panel extends mainPanel implements ActionListener, MouseListener {
    JPanel p1;
    Color c1 = new Color(234, 162, 133);
    Color c2 = new Color(240, 134, 84);

    private int button_posy = 0;
    private int index;
    CardLayout cl;

    GridBagLayout gbl;
    GridBagConstraints gbc;

    Menu_panel menu_panel;
    Student_panel student_panel;
    Teacher_panel teacher_panel;
    Class_panel class_panel;
    Department_panel department_panel;
    Schoolyear_panel schoolyear_panel;
    Info_panel info_panel;

    rounded_button menu_button = new rounded_button("Trang chủ", c1, c2, "menu");
    rounded_button student_button = new rounded_button("Sinh viên", c1, c2, "student");
    rounded_button teacher_button = new rounded_button("Giảng viên", c1, c2, "teacher");
    rounded_button class_button = new rounded_button("Lớp học", c1, c2, "class");
    rounded_button department_button = new rounded_button("Khoa", c1, c2, "department");
    rounded_button schoolyear_button = new rounded_button("Khóa", c1, c2, "schoolyear");
    rounded_button info_button = new rounded_button("Thông tin", c1, c2, "info");

    rounded_button[] rbt = {menu_button, student_button, teacher_button
            , class_button, department_button, schoolyear_button, info_button};

    option_panel op = new option_panel();
    boolean optionpanel_opened = false;
    int optionpanel_posy;

    public admin_panel(){
        init();
    }
    public void init(){

        gbl = new GridBagLayout();
        gbc = new GridBagConstraints();
        mid_panel.buttoncenter_panel.setLayout(gbl);


        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.weighty = 0.1f;



        op.edit_button.addActionListener(this);
        op.view_button.addActionListener(this);

        for (rounded_button item:rbt ) {
            item.addActionListener(this);
            item.setPreferredSize(new Dimension(100, 60));
            item.setFont(new Font(null, Font.BOLD, 20));
            item.setArc(25);
            gbc.gridy = button_posy++;
            mid_panel.buttoncenter_panel.add(item, gbc);
        }

        gbc.fill = GridBagConstraints.HORIZONTAL;
        p1 = new JPanel();
        p1.setOpaque(false);
        gbc.weighty = 1;
        gbc.gridy = button_posy++;
        mid_panel.buttoncenter_panel.add(p1, gbc);

        cl = new CardLayout();
        mid_panel.view_panel.setLayout(cl);

        menu_panel = new Menu_panel(70, Color.RED);
        student_panel = new Student_panel(70, Color.BLUE);
        teacher_panel = new Teacher_panel(70, Color.GREEN);
        class_panel = new Class_panel(70, Color.PINK);
        department_panel = new Department_panel(70, Color.lightGray);
        schoolyear_panel = new Schoolyear_panel(70, Color.ORANGE);
        info_panel = new Info_panel(70, Color.YELLOW);

        mid_panel.view_panel.add(menu_panel, menu_button.getName());
        mid_panel.view_panel.add(student_panel, student_button.getName());
        mid_panel.view_panel.add(teacher_panel, teacher_button.getName());
        mid_panel.view_panel.add(class_panel, class_button.getName());
        mid_panel.view_panel.add(department_panel, department_button.getName());
        mid_panel.view_panel.add(schoolyear_panel, schoolyear_button.getName());
        mid_panel.view_panel.add(info_panel, info_button.getName());
        cl.show(mid_panel.view_panel,menu_button.getName());
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == menu_button){
            cl.show(mid_panel.view_panel, menu_button.getName());

        }
        if (e.getSource() == student_button){
            removeTheother(mid_panel.buttoncenter_panel, e);
        }
        if (e.getSource() == teacher_button){
            removeTheother(mid_panel.buttoncenter_panel, e);

        }
        if (e.getSource() == class_button){
            removeTheother(mid_panel.buttoncenter_panel,e);
        }
        if (e.getSource() == department_button){
            removeTheother(mid_panel.buttoncenter_panel, e);

        }
        if (e.getSource() == schoolyear_button){
            removeTheother(mid_panel.buttoncenter_panel, e);

        }
        if (e.getSource() == info_button){
            removeTheother(mid_panel.buttoncenter_panel, e);

        }

        if (e.getSource() == op.view_button){
            for (rounded_button item:rbt) {
                if(item.getClicked() == 1){
                    cl.show(mid_panel.view_panel, item.getName());
                }
            }
        }
        if (e.getSource() == op.edit_button){
            for (rounded_button item:rbt) {
                if(item.getClicked() == 1){
                    cl.show(mid_panel.view_panel, item.getName());
                }
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    public void removeTheother(Container container, ActionEvent e){
        if (optionpanel_opened){
            for (rounded_button item:rbt) {
                item.setClicked(0);
                if (e.getSource() == item){
                    item.setClicked(1);
                }
            }


            removeObject(container, (Component) op);
            for (int i = index; i < 7; i++) {
                removeObject(container, (Component) rbt[i]);
            }
            for (int i = index; i < 7; i++){
                gbc.gridy = i + 1;
                container.add(rbt[i], gbc);
                container.revalidate();
                container.repaint();
            }
            index = checkin((rounded_button) e.getSource()) + 1;
            for (int i = index; i < 7; i++) {
                removeObject(container, (Component) rbt[i]);
            }
            gbc.gridy = index + 1;
            gbc.weighty = 0.1f;
            container.add(op, gbc);
            for (int i = index; i < 7; i++){
                gbc.gridy = i + 2;
                container.add(rbt[i], gbc);
                container.revalidate();
                container.repaint();
            }
        } else {
            for (rounded_button item:rbt) {
                if (e.getSource() == item){
                    item.setClicked(1);
                }
            }
            menu_button.setClicked(1);
            removeObject(container, p1);
            index = checkin((rounded_button) e.getSource()) + 1;
            for (int i = index; i < 7; i++) {
                removeObject(container, (Component) rbt[i]);
            }
            gbc.gridy = index;
            gbc.weighty = 0.1f;
            container.add(op, gbc);
            for (int i = index; i < 7; i++){
                gbc.gridy= i + 1;
                container.add(rbt[i], gbc);
                container.revalidate();
                container.repaint();
            }
            optionpanel_opened = true;
        }
    }
    public void removeObject(Container container, Component e){
            container.remove(e);
            container.revalidate();
            container.repaint();
    }
    public int checkin(rounded_button ex){
        int index = 0;
        for (int i = 0; i < 7; i++) {
            if(ex == rbt[i]){
                index = i;
                break;
            }
        }
        return index;
    }
}
