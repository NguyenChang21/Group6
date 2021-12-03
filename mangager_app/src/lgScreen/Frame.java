package lgScreen;

import javax.swing.*;
import java.awt.*;
import mainScreen.mainPanel;
public class Frame extends JFrame {
    public Frame(){
        setMinimumSize(new Dimension(1000, 640));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new mainPanel());
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
