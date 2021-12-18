package lgScreen;

import database_connector.ConnectionUtils;
import database_connector.ExecuteSQL;
import student.Student;
import teacher.Teacher;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class main {
    public static Connection conn;
    public static void main(String[] args) throws ParseException {
        try {
            conn = ConnectionUtils.openConnection();

        } catch (Exception e){
            e.printStackTrace();
        }
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
