package paquete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionDB {

	public Cliente Conectar(String id){
	
		String query = "SELECT * FROM CLIENTES where ID = '"+id+"'";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (Exception e) {
			 e.printStackTrace();
			}
			try{
				Connection conn = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe","javi", "javi");
				 Statement stmt = conn.createStatement();
				 Cliente cl = null;
				 
				ResultSet rs = stmt.executeQuery(query);
				while (rs.next()) {
					
					String idcliente =(rs.getString(1));
					String nombre =(rs.getString(2));
					String apellido = (rs.getString(3));
					double saldo = (rs.getDouble(4)); 
					
					cl = new Cliente(idcliente, nombre, apellido, saldo);
				} 
				
				return cl;
				 	 
			 }
			 catch(SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
			}
		
		
		
		return null;
	}
}
