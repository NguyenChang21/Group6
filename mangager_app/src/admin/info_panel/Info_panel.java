package admin.info_panel;
import prototype.rounded_panel;

import javax.swing.*;
import java.awt.*;

public class Info_panel extends rounded_panel{
    public info_pleft infoPleft;
    public info_pright infoPright;
    public Info_panel(int radius, Color color){
        super(radius, color);
        setOpaque(false);

        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gbl);

        gbc.fill = GridBagConstraints.BOTH;


        JPanel p1 = new JPanel();
        p1.setOpaque(false);
        gbc.weightx = 1;
        gbc.weighty = 0.07;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 5;
        add(p1, gbc);

        JPanel p2 = new JPanel();
        p2.setOpaque(false);
        gbc.weightx = 0.15;
        gbc.weighty = 1;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        add(p2, gbc);

        infoPleft = new info_pleft();
        gbc.weightx = 0.5;
        gbc.weighty = 0.9;
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridheight = 1;
        add(infoPleft, gbc);

        JPanel p4 = new JPanel();
        p4.setOpaque(false);
        gbc.weightx = 0.1;
        gbc.weighty = 1;
        gbc.gridx = 2;
        gbc.gridy = 1;
        add(p4, gbc);

        infoPright = new info_pright();
        gbc.weightx = 0.5;
        gbc.weighty = 1;
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.gridheight = 1;
        add(infoPright, gbc);

        JPanel p6 = new JPanel();
        p6.setOpaque(false);
        gbc.weightx = 0.15;
        gbc.weighty = 1;
        gbc.gridx = 4;
        gbc.gridy = 1;
        add(p6, gbc);

        JPanel p7 = new JPanel();
        p7.setOpaque(false);
        gbc.weightx = 1;
        gbc.weighty = 0.07;
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 5;
        add(p7, gbc);
    }
}
