package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Connectionjdbc {


		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Statement stmt;
			String url="jdbc:mysql://localhost:3306/sys";
			Connection con=DriverManager.getConnection(url,"root","root");
			System.out.println(con);
			System.out.println("Database sys connection suceesfully establish");
			stmt = con.createStatement();
			String query="insert into mytable values(6,'Nishanthiguru','8.2','chennai')";
			stmt.executeUpdate(query);
			System.out.println("Query updated");

	}

}
