package CC_AgendaDigital.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	private static String URL = "jdbc:sqlserver://localhost;databaseName=AgendaDigital;";
	private static String user = "sa";
	private static String password = "Asd143678925";

	public static Connection openConnection() throws SQLException {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection con = DriverManager.getConnection(URL, user, password);
			System.out.println("Conexão feita com sucesso!");
			return con;
		} catch (ClassNotFoundException e) {
			throw new SQLException(e.getMessage());
		}
	}
}
