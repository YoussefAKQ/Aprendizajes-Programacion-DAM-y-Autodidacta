package bd3;

import java.sql.*;

public class MysqlCon {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employees","root","vistaalegre");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from departments order by 1 asc");
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2));
			}
			con.close();
		}catch(Exception ex) {
			System.out.println(ex);
		}
	}
}
