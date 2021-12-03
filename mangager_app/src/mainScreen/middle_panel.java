package mainScreen;

import javax.swing.*;
import java.awt.*;

public class middle_panel extends JPanel {
    public middle_panel(){
        setOpaque(false);
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gbl);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weighty = 1;
        gbc.weightx = 0.01f;
        gbc.gridx = 0;
        JPanel p1 = new JPanel();
        p1.setOpaque(false);
        add(p1, gbc);

        gbc.weightx = 0.2f;
        gbc.gridx = 1;
        JPanel p2 = new JPanel();
        p2.setBackground(Color.GRAY);
        add(p2, gbc);

        gbc.weightx = 0.01f;
        gbc.gridx = 2;
        JPanel p3 = new JPanel();
        p3.setOpaque(false);
        add(p3, gbc);

        gbc.weightx = 1;
        gbc.gridx = 3;
        JPanel p4 = new JPanel();
        p4.setBackground(Color.GRAY);
        add(p4, gbc);

        gbc.weightx = 0.01f;
        gbc.gridx = 4;
        JPanel p5 = new JPanel();
        p5.setOpaque(false);
        add(p5, gbc);

    }
}
