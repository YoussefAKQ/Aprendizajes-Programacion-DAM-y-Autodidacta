package bd4;

import java.sql.*;

public class MysqlCon {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employees","root","vistaalegre");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select first_name, last_name "+"from employees"+" where last_name = 'Perez' "+"and emp_no in (select emp_no "+ "from dept_emp "+"where dept_no = 'd007')");
				while(rs.next()){
					System.out.println(rs.getString(1)+" "+rs.getString(2));
				}
			con.close();
			}catch(Exception e) {
				System.out.println(e);
			}
			
		
	
		
	}
}
