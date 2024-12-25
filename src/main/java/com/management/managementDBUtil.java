package com.management;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class managementDBUtil {
	
	private static Connection con = null; //global varible
	private static Statement stmt = null;
	private static ResultSet rs = null;

	
//---------------------------------------insertAddmin function---------------------------------------------------------------------

	public static boolean insertAdmin(String nameDB, String emailDB, int phoneDB, int ageDB, String positionDB, String usernameDB, String passwordDB) {
		boolean adm = false;
		
			
			try {
				con = DBConect.getConnection();
				stmt = con.createStatement();
				
				String sql = "insert into admin values (0, '"+nameDB+"', '"+emailDB+"', '"+phoneDB+"', '"+ageDB+"', '"+positionDB+"', '"+usernameDB+"', '"+passwordDB+"')";
				int rs = stmt.executeUpdate(sql);
				
				if (rs > 0) {
					adm = true;
				} else {
					adm = false;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		return adm;
	}
	
	
	//--------------------------------------------adminValidate function------------------------------------------
	 
		public static boolean adminValidate(String usernameDB, String passwordDB) {
			boolean adm = false;
			
				
				try {
					con = DBConect.getConnection();
					stmt = con.createStatement();
					
					String sql = "select * from admin where username='"+usernameDB+"' and password='"+passwordDB+"'";
					rs = stmt.executeQuery(sql);
					
					if (rs.next()) {
						adm = true;
					} else {
						adm = false;
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			return adm;
		}
	
	
}
