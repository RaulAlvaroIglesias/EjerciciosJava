package MYSQL_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class intermedio {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://sql7.freesqldatabase.com:3306/sql7739384";
        String username = "sql7739384";
        String password = "9ay7BhSVbA";

        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            
          
            connection.setAutoCommit(false);
            
            Statement statement = connection.createStatement();
            String sql1 = "INSERT INTO personas (nombre) VALUES ('Carlos')";
            String sql2 = "INSERT INTO personas (nombre) VALUES ('Ana')";

            statement.executeUpdate(sql1);
            statement.executeUpdate(sql2);

            connection.commit();
            System.out.println("Transacción completada con éxito.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
