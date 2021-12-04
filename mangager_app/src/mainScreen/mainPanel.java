package mainScreen;

import javax.swing.*;
import java.awt.*;

public class mainPanel extends JPanel {
    protected middle_panel mid_panel;
    public mainPanel(){
//        setPreferredSize(new Dimension(800, 600));
        setBackground(new Color(255, 255, 217));
        GridBagLayout gbl = new GridBagLayout();
        setLayout(gbl);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx = 1;
        gbc.weighty = 0.03f;
        top_panel p1 = new top_panel();
        p1.setBackground(Color.RED);
        p1.setOpaque(false);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 0;
//        gbc.gridheight = 17;
        add(p1, gbc);

        JPanel p2 = new JPanel();
        p2.setOpaque(false);
        gbc.weighty = 0.005f;
        gbc.gridy = 1;
        add(p2, gbc);

        mid_panel = new middle_panel();
        mid_panel.setBackground(Color.YELLOW);
        gbc.weighty = 0.9f;
        gbc.gridy = 2;
        add(mid_panel, gbc);

        JPanel p4 = new JPanel();
        p4.setBackground(Color.BLUE);
        p4.setOpaque(false);
        gbc.weighty = 0.02f;
        gbc.gridy = 3;
        add(p4, gbc);


    }
}
