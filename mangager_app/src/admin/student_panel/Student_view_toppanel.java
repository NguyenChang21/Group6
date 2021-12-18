package admin.student_panel;

import prototype.rounded_button;
import prototype.textfield_type;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student_view_toppanel extends JPanel implements ActionListener {
    public rounded_button find;
    public textfield_type getId;
    public Student_view_toppanel() {
        setOpaque(false);

        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(new FlowLayout(FlowLayout.LEFT, 0, 20));
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;

//        JPanel p1 = new JPanel();
//        p1.setBackground(Color.cyan);

        JLabel addId = new JLabel();
        addId.setText("   Nhập mã sinh viên:  ");
        addId.setFont(new Font(null, Font.ITALIC, 24));
        gbc.fill = GridBagConstraints.NONE;
//
//        JPanel p2 = new JPanel();
//        p2.setBackground(Color.cyan);

        getId = new textfield_type();
        getId.setFont(new Font(null, Font.ITALIC, 20));
        getId.setPreferredSize(new Dimension(320, 50));
        getId.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        getId.setHorizontalAlignment(JTextField.CENTER);
        add(getId);
//        JPanel p3 = new JPanel();
//        p3.setBackground(Color.cyan);

        find = new rounded_button("Tìm kiếm",
                new Color(245, 220, 100), new Color(220, 159, 56), "find");
        find.setPreferredSize(new Dimension(140, 50));
        find.setFont(new Font(null, Font.BOLD, 20));
        find.addActionListener(this);

        JPanel p4 = new JPanel();
        p4.setOpaque(false);


        add(addId);

        add(getId);
        add(p4);

        add(find);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

