package lgScreen;

import database_connector.ConnectionUtils;
import database_connector.ExecuteSQL;
import student.Student;
import teacher.Teacher;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class main {
    public static void main(String[] args) throws ParseException {
//        Connection conn;
//        PreparedStatement stm;
//
//        try {
//            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//            ExecuteSQL exe = new ExecuteSQL();
//            Student st1 = new Student();
//            st1.setFirstname("trang");
//            st1.setStudent_id(20001737);
//            st1.setDate_of_birth( sdf.parse("25/12/2002"));
//            conn = ConnectionUtils.openConnection();
//
//            ResultSet rs = exe.searchStudent(conn, 20001737);
//            while(rs.next()){
//                showUserInfo(rs);
//            }
//        } catch (Exception e){
//            e.printStackTrace();
//        }
        new Frame();

    }
    private static void showUserInfo(ResultSet rs) throws SQLException {
        System.out.println("Id: " + rs.getInt("msv"));
        System.out.println("Name: " + rs.getString("lname"));
        System.out.println("Address: " + rs.getString("address"));
        System.out.println("Year: " + rs.getInt("school year"));
        System.out.println("DOB: " + rs.getDate("date_of_birth"));
    }
}
