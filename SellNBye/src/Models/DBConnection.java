package Models;

import java.sql.*;

public class DBConnection {
	public static Connection createConnection() {
		
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/it17146098";
		String username = "root";
		String password = "";
		
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			}
			catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			con = DriverManager.getConnection(url, username, password);
			System.out.println("Printing connection object" + con);
		}
		catch(Exception e) {
			e.printStackTrace();
		}	
		return con;
	}
}
