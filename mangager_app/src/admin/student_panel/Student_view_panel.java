package admin.student_panel;
import lgScreen.main;
import prototype.rounded_panel;
import database_connector.ExecuteSQL;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import database_connector.ExecuteSQL;
public class Student_view_panel extends rounded_panel implements ActionListener {
    Student_view_toppanel ptop;
    Student_view_middlepanel pmid;
    ExecuteSQL exe = new ExecuteSQL();

    public Student_view_panel(int radius) {
        super(radius);
    }

    public Student_view_panel(int radius, Color bgColor) {
        super(radius, bgColor);
        setOpaque(false);
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gbl);
        gbc.weightx=1;
        gbc.weighty=1;
        gbc.fill = GridBagConstraints.BOTH;
        ptop = new Student_view_toppanel();
        ptop.setOpaque(false);

        pmid = new Student_view_middlepanel();
        pmid.setOpaque(false);


        JPanel p3 = new JPanel();
        p3.setOpaque(false);

        gbc.weighty = 0.12;
        gbc.gridy = 0;
        gbc.gridx = 0;
        add(ptop,gbc);

        gbc.weighty = 0.8;
        gbc.gridx =0;
        gbc.gridy =1;
        add(pmid,gbc);

        gbc.weighty = 0.01;
        gbc.gridy = 2;
        gbc.gridx = 0;
        add(p3,gbc);

        ptop.find.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ptop.find){
            try {
                ResultSet rs = exe.searchStudent(main.conn,Integer.parseInt(ptop.getId.getText()) );
                while (rs.next()){
                    pmid.mini_middel_panel.leftcorner_panel.fname.setText(rs.getString("fname") + rs.getString("lname"));
                    pmid.mini_middel_panel.leftcorner_panel.fdob.setText( rs.getDate("date_of_birth").toString());
                    pmid.mini_middel_panel.leftcorner_panel.fgender.setText(rs.getString("gender"));
                    pmid.mini_middel_panel.leftcorner_panel.fhometown.setText(rs.getString("home_town"));
                    pmid.mini_middel_panel.leftcorner_panel.faddress.setText(rs.getString("address"));
                    pmid.mini_middel_panel.leftcorner_panel.femail.setText(rs.getString("email"));
                    pmid.mini_middel_panel.leftcorner_panel.fphonenumber.setText(rs.getString("phone_number"));


//                    System.out.println("Id: " + rs.getInt("msv"));
//                    System.out.println("Name: " + rs.getString("lname"));
//                    System.out.println("Address: " + rs.getString("address"));
//                    System.out.println("Year: " + rs.getInt("school year"));
//                    System.out.println("DOB: " + rs.getDate("date_of_birth"));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
