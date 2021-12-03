package mainScreen;

import prototype.rounded_panel;
import javax.swing.*;
import java.awt.*;

public class mainPanel extends JPanel {
    public mainPanel(){
//        setPreferredSize(new Dimension(800, 600));
        setBackground(new Color(255, 255, 217));
        GridBagLayout gbl = new GridBagLayout();
        setLayout(gbl);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx = 1;
        gbc.weighty = 0.15f;
        JPanel p1 = new JPanel();
        p1.setBackground(Color.RED);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 0;
//        gbc.gridheight = 17;
        add(p1, gbc);

        JPanel p2 = new JPanel();
        p2.setBackground(Color.BLUE);
        gbc.weighty = 0.005f;
        gbc.gridy = 1;
        add(p2, gbc);

        middle_panel p3 = new middle_panel();
        p3.setBackground(Color.YELLOW);
        gbc.weighty = 0.9f;
        gbc.gridy = 2;
        add(p3, gbc);

        JPanel p4 = new JPanel();
        p4.setBackground(Color.BLUE);
        gbc.weighty = 0.02f;
        gbc.gridy = 3;
        add(p4, gbc);

    }
}
