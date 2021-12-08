package admin;
import prototype.rounded_panel;

import javax.swing.*;
import java.awt.*;

public class Menu_panel extends rounded_panel{
    static GridBagLayout gbl = new GridBagLayout();
    public Menu_panel(int radius, Color color){
        super(radius, color);
        setOpaque(false);
        setLayout(gbl);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 1;
//        add(new JPanel(), gbc);
    }
}
