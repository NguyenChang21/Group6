package prototype;

import javax.swing.JPanel;
import java.awt.*;

public class option_panel extends JPanel {
    rounded_button view_button;
    rounded_button edit_button;

    Color c1 = new Color(234, 162, 133);
    Color c2 = new Color(240, 134, 84);
    public option_panel(){
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gbl);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.weighty = 1;
        gbc.weightx = 1;

        gbc.gridy = 0;
        view_button = new rounded_button("Xem ", c1, c2);
        add(view_button, gbc);

        gbc.gridy = 1;
        edit_button = new rounded_button("Chỉnh sửa", c1, c2);
        add(edit_button, gbc);

    }
}
