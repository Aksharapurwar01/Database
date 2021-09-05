package data;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RetriveData {
	
	public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/payroll";
        String userName = "root";
        String password = "";
        String sql="select * from employee_payroll";
        Connection connection;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded!");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Cannot fine the driver in the Classpath!", e);
        }
        try {
            System.out.println("Connecting to the Database: "+jdbcURL);
            connection = DriverManager.getConnection(jdbcURL, userName, password);
            System.out.println("Connection is Successfully Established! "+connection);
            Statement stat = connection.createStatement();
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()) {
            	System.out.println(rs.getString("name")+ rs.getFloat("salary")+ rs.getInt("id")+ rs.getInt("startdate"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	

	



   
}