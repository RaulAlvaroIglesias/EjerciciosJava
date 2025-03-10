package MYSQL_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class basico {
	public static void main(String[] args) {
       
        String jdbcURL = "jdbc:mysql://sql7.freesqldatabase.com:3306/sql7739384";
        String username = "sql7739384";
        String password = "9ay7BhSVbA";
		
		try {
			
			Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("Conexión exitosa a la base de datos.");

            String personas ="CREATE TABLE IF NOT EXISTS personas (" +
            			"id INT AUTO_INCREMENT PRIMARY KEY, "+
            			"nombre VARCHAR(100) NOT NULL)";
            
           Statement statement = connection.createStatement();
           statement.execute(personas);
           
           System.out.println("Tabla 'personas' creada o ya existe.");

           
           String juan = "INSERT INTO personas (nombre) VALUES ('Juan Perez')";
           String raul = "INSERT INTO personas (nombre) VALUES ('Raul Alvaro')";
           String paula = "INSERT INTO personas (nombre) VALUES ('Paula Susana')";
           String jorge= "INSERT INTO personas (nombre) VALUES ('Jorge Juan')";
           
           
           int rows = statement.executeUpdate(juan);
            rows += statement.executeUpdate(raul);
            rows += statement.executeUpdate(paula);
            rows += statement.executeUpdate(jorge);
           
           if(rows > 0) {
        	   System.out.println(rows+" nuevos registros han sido insertados.");
           }else {
        	   System.out.println("Registro fallido.");
           }
           
           
           
           
           String maria = "UPDATE personas SET nombre='Maria Gomez' WHERE id=2";
           rows=statement.executeUpdate(maria);
           
           if(rows>0) {
        	   
        	   System.out.println("El registro ha sido actualizado.");
        	   
           }
           
           String borrar = "DELETE FROM personas WHERE id=1";
           
           rows = statement.executeUpdate(borrar);
           
           if (rows > 0) {
               System.out.println("El registro ha sido eliminado.");
           }
           
           
           
           String selectPersonas = "SELECT * FROM personas";
           
           ResultSet resultset = statement.executeQuery(selectPersonas);
           
           while(resultset.next()) {
        	   
        	   int id = resultset.getInt("id");
        	   String nombre = resultset.getString("nombre");
        	   
        	   System.out.println("ID: "+id+", Nombre: "+nombre);
        	   
           }
           
           String borrarTabla = "DROP TABLE IF EXISTS personas";
           
           statement.executeUpdate(borrarTabla);
           
           System.out.println("La tabla 'personas' ha sido eliminada.");
           
           
           connection.close();
		}catch(SQLException e) {
            System.out.println("Error al conectar a la base de datos");
            e.printStackTrace();
		}
    }
}
