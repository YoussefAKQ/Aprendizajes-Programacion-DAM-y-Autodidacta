package bd5;

import java.sql.*;

public class MysqlCon {
	public static void main(String[] args) {
		

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","vistaalegre");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select co.Name as Pais, co.Continent as Continente "+"from country co "+"join countrylanguage cl on co.code = cl.CountryCode "+"and cl.language='German' "+"order by 2, 1");
			while(rs.next()) {
				System.out.println("Pais: "+rs.getString(1)+" - Continente: "+rs.getString(2));
			}
		con.close();
		}catch (Exception e){
		System.out.println(e);
		}	
	}
}
