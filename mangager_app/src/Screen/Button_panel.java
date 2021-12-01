package Screen;

import javax.swing.*;
import java.awt.*;

public class Button_panel extends JPanel {
    rounded_button signin;
    rounded_button close;

    public Button_panel(){
        setPreferredSize(new Dimension(400, 100));
        setLayout(new FlowLayout(FlowLayout.CENTER, 30, 10));
        setOpaque(false);

        signin = new rounded_button("Sign in");
        signin.setPreferredSize(new Dimension(160, 60));
        signin.setFont(new Font(null, Font.BOLD, 20));

        add(signin);

        close = new rounded_button("Close");
        close.setPreferredSize(new Dimension(160, 60));
        close.setFont(new Font(null, Font.BOLD, 20));
        add(close);
    }
}
