package Models;

import java.sql.*;

public class User {
	public String login(String user, String pass) {
		
		Connection con = null;
		Statement stat = null;
		ResultSet rs = null;
		
		String unDB = "";
		String pwDB = "";
		
		try {
			con = DBConnection.createConnection();
			stat = con.createStatement();
			rs = stat.executeQuery("SELECT username, password FROM user");
		
			while(rs.next()) {
				unDB = rs.getString("username");
				pwDB = rs.getString("password");
				
				if(user.equals(unDB) && pass.contentEquals(pwDB)) {
					return "SUCCESS!";
				}		
			}			
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		return "Invalid user Credentials." ;
	}
}
