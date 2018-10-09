package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class ConnectionFactory 
{
	/*static 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) 
		{
			throw new RuntimeException(e);
		}
	}
	
	// Obtém conexão com o banco de dados
	public static Connection obtemConexao() throws SQLException 
	{
		return DriverManager
				.getConnection("jdbc:mysql://localhost/AulaLab?user=root&password=root");
	}*/

	public String testeconn()
	{
		return "Teste comp ConnectionFactory";
	}

}
