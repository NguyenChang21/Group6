package Screen;

import javax.swing.*;
import java.awt.*;

public class login_panel extends rounded_panel {
    static textfield_type name_field;
    static textfield_type pass_field;
    JLabel username_label;
    JLabel password_label;
    JLabel forgot_pass;
    public login_panel(int radius, Color bgColor) {
        super(radius, bgColor);


        setLayout(new FlowLayout(FlowLayout.CENTER, 30, 10));
        username_label = new JLabel("User name: ");
        username_label.setFont(new Font(null, Font.ITALIC, 16));

        JPanel panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(320, 15));
        panel1.setLayout(new GridBagLayout());
        panel1.setOpaque(false);
        panel1.add(username_label, new GridBagConstraints(
                0, // gridx
                0, // gridy
                1, // gridwidth
                1, // gridheight
                1, // weightx
                1, // weighty
                GridBagConstraints.WEST, // anchor <------------
                GridBagConstraints.NONE, // fill
                new Insets(0, // inset top
                        0, // inset left
                        0, // inset bottom
                        0), // inset right
                0, // ipadx
                0)); // ipady

        add(panel1);

        name_field = new textfield_type();
        name_field.setFont(new Font(null, Font.ITALIC, 16));
        name_field.setPreferredSize(new Dimension(340, 45));
        name_field.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        name_field.setHorizontalAlignment(JTextField.CENTER);
        add(name_field);


        password_label = new JLabel("Password: ");
        password_label.setFont(new Font(null, Font.ITALIC, 16));
        forgot_pass = new JLabel("U forgot it????");
        forgot_pass.setFont(new Font(null, Font.ITALIC, 16));


        JPanel panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(320, 20));
        panel2.setLayout(new GridBagLayout());
        panel2.setOpaque(false);

        panel2.add(password_label, new GridBagConstraints(
                0, // gridx
                0, // gridy
                1, // gridwidth
                1, // gridheight
                1, // weightx
                1, // weighty
                GridBagConstraints.WEST, // anchor <------------
                GridBagConstraints.NONE, // fill
                new Insets(0, // inset top
                        0, // inset left
                        0, // inset bottom
                        0), // inset right
                0, // ipadx
                0)); // ipady

        panel2.add(forgot_pass, new GridBagConstraints(
                0, // gridx
                0, // gridy
                1, // gridwidth
                1, // gridheight
                1, // weightx
                1, // weighty
                GridBagConstraints.EAST, // anchor <------------
                GridBagConstraints.NONE, // fill
                new Insets(0, // inset top
                        0, // inset left
                        0, // inset bottom
                        0), // inset right
                0, // ipadx
                0)); // ipady

        add(panel2);
        pass_field = new textfield_type();
        pass_field.setPreferredSize(new Dimension(340, 45));
        pass_field.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        pass_field.setFont(new Font(null, Font.ITALIC, 16));
        pass_field.setHorizontalAlignment(JTextField.CENTER);

        add(pass_field);

        add(new Button_panel());
    }


}
