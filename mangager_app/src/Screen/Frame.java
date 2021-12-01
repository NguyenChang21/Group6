package Screen;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    public Frame(){
//        setSize(800, 600);
        setMinimumSize(new Dimension(1000, 640));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new login_screen(), BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
