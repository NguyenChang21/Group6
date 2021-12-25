package student.info_panel;

import prototype.rounded_button;
import prototype.textfield_type;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student_view_toppanel extends JPanel implements ActionListener {
    public rounded_button find;
    public rounded_button delete;
    public textfield_type getId;
    public Student_view_toppanel() {
        setOpaque(false);

        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(new FlowLayout(FlowLayout.CENTER, 200, 5));
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;

        JLabel addId = new JLabel();
        addId.setText("Xem và chỉnh sửa thông tin bản thân");
        addId.setFont(new Font(null, Font.ITALIC, 30));
        gbc.fill = GridBagConstraints.NONE;


//        JPanel p3 = new JPanel();
//        p3.setBackground(Color.cyan);

        add(addId);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

