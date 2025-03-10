package gestionEmpleadosSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class empleadoDAO {
	
    public empleadoDAO() {
        crearTablaSiNoExiste();
    }


    private void crearTablaSiNoExiste() {
        String sql = "CREATE TABLE IF NOT EXISTS empleados ("
                   + "id INT AUTO_INCREMENT PRIMARY KEY, "
                   + "nombre VARCHAR(100) NOT NULL, "
                   + "salario DOUBLE NOT NULL"
                   + ")";
        try (Connection connection = conexionPool.getConnection();
             Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabla 'empleados' verificada/creada correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al crear la tabla 'empleados': " + e.getMessage());
        }
    }

	public void crearEmpleado(empleado empleado)throws SQLException{
		
		String insertEmpleado = "INSERT INTO empleados (nombre, salario) VALUES (?, ?)";
		
		try(Connection connection = conexionBD.getConnection();
				PreparedStatement statement = connection.prepareStatement(insertEmpleado)) {
			
			statement.setString(1,  empleado.getNombre());
			statement.setDouble(2, empleado.getSalario());
			
			statement.executeUpdate();
			System.out.println("Empleado agregado exitosamente.");
			
		}		
	}
	
	public static List<empleado> obtenerTodosLosEmpleados() throws SQLException{
		
		String selectEmpleados = "SELECT * FROM empleados";
		List<empleado> listaEmpleados = new ArrayList<>();
		
		try(Connection connection = conexionBD.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(selectEmpleados)){
			
			while(resultSet.next()) {
				
				int id = resultSet.getInt("id");
				String nombre = resultSet.getString("nombre");
				double salario = resultSet.getDouble("salario");
				empleado empleado = new empleado(id,nombre,salario);
				
				listaEmpleados.add(empleado);
				
			}
					
		}
		
		return listaEmpleados;
		
	}
	
	public void actualizarEmpleado(empleado empleado) throws SQLException {
		
		String updateEmpleado = "UPDATE empleados SET nombre = ?, salario = ? WHERE id = ?";
		
		try( Connection connection = conexionBD.getConnection();
			PreparedStatement statement = connection.prepareStatement(updateEmpleado)){
			
			statement.setString(1, empleado.getNombre());
			statement.setDouble(2, empleado.getSalario());
			statement.setInt(3, empleado.getId());
			
			statement.executeUpdate();
			System.out.println("Empleado actualizado exitosamente.");
				
		}
		
	}
	
	public void eliminarEmpleado(int id) throws SQLException{
		
		String deleteEmpleado = "DELETE FROM empleados WHERE id = ?";
		
		try(Connection connection = conexionBD.getConnection();
			PreparedStatement statement = connection.prepareStatement(deleteEmpleado)){
			
			statement.setInt(1, id);
			
			statement.executeUpdate();
			 System.out.println("Empleado eliminado exitosamente.");
	
		}
					
	}
	
	
	
	
	
	
	
	
	
}
