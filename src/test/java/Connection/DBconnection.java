package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBconnection {
	public static Connection connectDB() {
		Connection con=null;
		try {
		Class.forName("com.mysql.jdbc.Driver");  
		con=DriverManager.getConnection("jdbc:mysql://172.16.20.120:3306/accounts","user_test","Pruebas123$");  
		}catch(Exception e) {
			System.out.println("Error en la conexion "+e.getMessage());
		}
		return con;
	}
	public static void query(Connection con) {
		try{  
			Statement stmt=con.createStatement();  
			stmt.executeUpdate("DELETE a1, b1 FROM user as a1 inner join user_role as b1 WHERE a1.id = b1.user_id and a1.id = (SELECT id FROM (SELECT username, password, MAX(id) id FROM user) user);");  
			con.close();  
		}catch(Exception e){ 
		System.out.println("Error ejecutando el query "+e.getMessage());
		}  
	}
}
