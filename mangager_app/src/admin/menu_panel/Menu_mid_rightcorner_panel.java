package admin.menu_panel;

import prototype.rounded_panel;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Menu_mid_rightcorner_panel extends rounded_panel {


    public Menu_mid_rightcorner_panel(int radius, Color bgColor) {
        super(radius, bgColor);
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gbl);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.weighty = 1;

        JLabel infomation = new JLabel();
        infomation.setText("THÔNG TIN LIÊN LẠC");
        infomation.setFont(new Font(null, Font.BOLD, 25));
        infomation.setBorder(new LineBorder(Color.YELLOW));
        JPanel p1 = new rounded_panel(4,Color.cyan);
        p1.setLayout(new FlowLayout(FlowLayout.CENTER));
        p1.setOpaque(false);
        p1.add(infomation);
        add(p1, gbc);


//        jLabel.setText("<html>dong 1<br>dong 2<br>dong 3");

        JLabel address = new JLabel();
        address.setOpaque(false);
//        address.setLineWrap(true);
//        address.setPreferredSize(new Dimension(610, 125));
        address.setText("<html> Địa chỉ: số 334 đường Nguyễn Trãi,<br> phường Thanh Xuân Trung, <br> quận Thanh Xuân, thành phố Hà Nội <br> " +
                "Số điện thoại: (84) 0243-8584615/8581419 <br> Địa chỉ email: hus@vnu.edu.vn hoặc <br>admin@hus.edu.vn <br> FAX: 0243-85843016 ");
        address.setFont(new Font(null, Font.BOLD, 18));
        address.setBorder(new LineBorder(Color.YELLOW));
        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout(FlowLayout.LEFT));
//        p2.setPreferredSize(new Dimension(250, 100));
        p2.setOpaque(false);
        p2.add(address);
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(p2, gbc);

//        JLabel phone_number = new JLabel();
//        phone_number.setText("Số điện thoại: (84) 0243-8584615/8581419");
//        phone_number.setFont(new Font(null, Font.BOLD, 18));
//        JPanel p3 = new rounded_panel(4,Color.cyan);
//        p3.setLayout(new FlowLayout(FlowLayout.LEFT));
//        p3.setOpaque(false);
//        p3.add(phone_number);
//        gbc.gridx = 0;
//        gbc.gridy = 2;
//        add(p3, gbc);
//
//        JLabel email = new JLabel();
//        email.setText("<html>Địa chỉ email: hus@vnu.edu.vn <br> hoặc admin@hus.edu.vn");
//        email.setFont(new Font(null, Font.BOLD, 18));
//        JPanel p4 = new rounded_panel(4,Color.cyan);
//        p4.setLayout(new FlowLayout(FlowLayout.LEFT));
//        p4.setOpaque(false);
//        p4.add(email);
//        gbc.gridx = 0;
//        gbc.gridy = 3;
//        add(p4, gbc);
//
//        JLabel fax = new JLabel();
//        fax.setText("FAX: 0243-85843016");
//        fax.setFont(new Font(null, Font.BOLD, 18));
//        JPanel p5 = new rounded_panel(4,Color.cyan);
//        p5.setLayout(new FlowLayout(FlowLayout.LEFT));
//        p5.setOpaque(false);
//        p5.add(fax);
//        gbc.gridx = 0;
//        gbc.gridy = 4;
//        add(p5, gbc);

    }
}
