package lgScreen;

import prototype.rounded_button;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button_panel extends JPanel implements ActionListener {
    rounded_button signin;
    rounded_button close;
    private int clicked = 0;

    public Button_panel(){
        setPreferredSize(new Dimension(400, 100));
        setLayout(new FlowLayout(FlowLayout.CENTER, 30, 10));
        setOpaque(false);

        signin = new rounded_button("Sign in",
                new Color(234, 162, 115, 255),
                new Color(238, 104, 72));
        signin.setPreferredSize(new Dimension(160, 60));
        signin.setFont(new Font(null, Font.BOLD, 20));
        signin.addActionListener(this);
        add(signin);

        close = new rounded_button("Close",
                new Color(234, 162, 115, 255),
                new Color(238, 104, 72));
        close.setPreferredSize(new Dimension(160, 60));
        close.setFont(new Font(null, Font.BOLD, 20));
        close.addActionListener(this);
        add(close);
    }

    public int getClicked() {
        return clicked;
    }

    public void setClicked(int clicked) {
        this.clicked = clicked;
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
