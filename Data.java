package data;

import java.sql.*;

public class Data {
	
	public static void main (String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/addressbook","root","");
		System.out.print("conect");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM address_book ");
		System.out.println(rs+"results");
		con.close();
	}

}
