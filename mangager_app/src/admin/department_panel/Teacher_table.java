package admin.department_panel;

import lgScreen.main;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.ResultSet;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Vector;

public class Teacher_table extends JFrame {
    JTable table;
    public Teacher_table(String department ){
        setTitle("Danh sách giảng viên khoa " + department);
        setLayout(new FlowLayout());
        Vector vct_header = new Vector();
        Vector vct_data = new Vector();

        vct_header.add("STT");
        vct_header.add("Họ");
        vct_header.add("Tên ");
        vct_header.add("Giới tính");
        vct_header.add("Ngày sinh");
        vct_header.add("Email");
        vct_header.add("Số điện thoại");
        vct_header.add("Khoa");

//        vct_header.add();
//        vct_header.add();
//        vct_header.add();
//        vct_header.add();

        try {
            ResultSet rs = main.exe.searchTeacher_byDepartment(main.conn, department);

            while (rs.next()){
                Vector vct_row1 = new Vector();
                vct_row1.add("1");
                vct_row1.add(rs.getString("fname"));
                vct_row1.add(rs.getString("lname"));
                vct_row1.add(rs.getString("gender"));
                Format formatter = new SimpleDateFormat("dd/MM/yyyy");
                vct_row1.add(formatter.format(rs.getDate("date_of_birth").getTime()));
                vct_row1.add(rs.getString("email"));
                vct_row1.add(rs.getString("phone_number"));
                vct_row1.add(rs.getString("department"));
                vct_data.add(vct_row1);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        table = new JTable();
        table.setPreferredScrollableViewportSize(new Dimension(800, 250));
        table.setFillsViewportHeight(true);
        table.setModel(new DefaultTableModel(vct_data, vct_header));
        table.setFont(new Font(null, Font.PLAIN, 15));
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(27);
        table.getColumnModel().getColumn(1).setPreferredWidth(80);
        table.getColumnModel().getColumn(2).setPreferredWidth(100);
        table.getColumnModel().getColumn(3).setPreferredWidth(50);
        table.getColumnModel().getColumn(4).setPreferredWidth(90);
        table.getColumnModel().getColumn(5).setPreferredWidth(250);
        table.getColumnModel().getColumn(6).setPreferredWidth(120);
        table.getColumnModel().getColumn(7).setPreferredWidth(90);
        table.setEnabled(false);

        JScrollPane sp = new JScrollPane(table);
        add(sp);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
