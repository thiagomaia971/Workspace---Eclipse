package CC_AgendaDigital.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	private static String URL = "jdbc:sqlserver://localhost;databaseName=AgendaDigital;";
	private static String usuario = "sa";
	private static String password = "Asd143678925";
	private static String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	
	public static Connection openConnection() throws SQLException{
		try {
			Class.forName(DRIVER);
			Connection con = DriverManager.getConnection(URL, usuario, password);
			return con;
		} catch (ClassNotFoundException e) {
			throw new SQLException(e.getMessage());
		}
	}
}
