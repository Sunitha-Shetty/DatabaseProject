package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ecommerce", "root", "root");
		
		Statement stn = con.createStatement();
		
		ResultSet result = stn.executeQuery("select * from eproduct");
		
		while(result.next())
		{
			System.out.println(result.getInt("ID"));
			System.out.println(result.getString("name"));
			
		}
		
		con.close();
		
	}

}
