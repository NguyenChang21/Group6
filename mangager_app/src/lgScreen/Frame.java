package lgScreen;

import admin.student_panel.Student_view_panel;

import javax.swing.*;
import java.awt.*;
public class Frame extends JFrame {
    public Frame(){
        setMinimumSize(new Dimension(1000, 640));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new Student_view_panel(40, Color.WHITE));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
