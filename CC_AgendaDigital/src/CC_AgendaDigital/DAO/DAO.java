package CC_AgendaDigital.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import CC_AgendaDigital.Core.Familia;

public class DAO {
	private static String URL = "jdbc:sqlserver://localhost;databaseName=AgendaDigital;";
	private static String user = "sa";
	private static String password = "Asd143678925";
	static Connection con = null;
	
	private static Statement stmt = null;
	private static ResultSet resultado = null;

	public static Connection openConnection() throws SQLException {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(URL, user, password);
			System.out.println("Conexão feita com sucesso!");
			return con;
		} catch (ClassNotFoundException e) {
			throw new SQLException(e.getMessage());
		}
	}
	
	public void closeConnection(){
		try {
			con.close();
			stmt.close();
			resultado.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public ArrayList<Familia> receberTodasFamilias(){
		ArrayList<Familia> familias = new ArrayList<Familia>();
		String query = "SELECT * FROM dbo.Familia";
		try {
			stmt = con.createStatement();
			resultado = stmt.executeQuery(query);
			if(resultado != null){
				int cont = 0;
				while(resultado.next()){
					//familias.add(resultado.g(cont)));
					cont++;
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return familias;
	}
}
