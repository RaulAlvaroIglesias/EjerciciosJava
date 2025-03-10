package gestionEmpleadosSQL;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class conexionPool {
	 private static HikariDataSource dataSource;

	    static {
	        HikariConfig config = new HikariConfig();
	        config.setJdbcUrl("jdbc:mysql://sql7.freesqldatabase.com:3306/sql7739384");
	        config.setUsername("sql7739384");
	        config.setPassword("9ay7BhSVbA");
	        config.setMaximumPoolSize(10); 

	        dataSource = new HikariDataSource(config);
	    }

	    public static Connection getConnection() throws SQLException {
	        return dataSource.getConnection();
	    }

	    public static void cerrarPool() {
	        if (dataSource != null) {
	            dataSource.close();
	        }
	    }
	}
