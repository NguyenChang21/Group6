package Screen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button_panel extends JPanel implements ActionListener {
    rounded_button signin;
    rounded_button close;

    public Button_panel(){
        setPreferredSize(new Dimension(400, 100));
        setLayout(new FlowLayout(FlowLayout.CENTER, 30, 10));
        setOpaque(false);

        signin = new rounded_button("Sign in");
        signin.setPreferredSize(new Dimension(160, 60));
        signin.setFont(new Font(null, Font.BOLD, 20));
        signin.addActionListener(this);
        add(signin);

        close = new rounded_button("Close");
        close.setPreferredSize(new Dimension(160, 60));
        close.setFont(new Font(null, Font.BOLD, 20));
        close.addActionListener(this);
        add(close);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == signin){
            String username = login_panel.name_field.getText();
            String password = login_panel.pass_field.getText();
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
        }
        if (e.getSource() == close){
            System.exit(0);
        }
    }
}
