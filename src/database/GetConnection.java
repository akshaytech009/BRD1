package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {

	private static Connection con = null;

	public static Connection getConnection() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// System.out.println("Driver is registered..");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@10.1.50.198:1521:orcl", "sh", "sh");
			//System.out.println("Connection Establish.....");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (Exception e) {

			e.printStackTrace();
		}

		return con;
	}

	public void closeConnection() {

		try {
			con.close();
		} catch (SQLException e) {

		}
	}

}
