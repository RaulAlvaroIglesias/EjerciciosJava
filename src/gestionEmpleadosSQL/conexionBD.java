package gestionEmpleadosSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexionBD {

	private static final String JDBC_URL = "jdbc:mysql://sql7.freesqldatabase.com:3306/sql7739384";
	private static final String JDBC_USER = "sql7739384";
	private static final String JDBC_PASSWORD = "9ay7BhSVbA";
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);
	}
	
}
