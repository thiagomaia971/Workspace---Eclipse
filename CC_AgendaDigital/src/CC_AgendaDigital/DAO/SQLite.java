package CC_AgendaDigital.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import CC_AgendaDigital.Core.Familia;
import CC_AgendaDigital.Core.Pessoa;

public class SQLite {
	private Connection conn;
	private Statement stm;

	public SQLite(String arquivo) throws ClassNotFoundException, SQLException {
		try {
			Class.forName("org.sqlite.JDBC");
			this.conn = DriverManager.getConnection("jdbc:sqlite:" + arquivo);
			this.stm = this.conn.createStatement();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void insertPessoa(Pessoa pessoa) {
		try {
			this.stm = this.conn.createStatement();
			this.stm.executeUpdate("INSERT INTO Pessoa(Nome, DataNasc, Idade) " + "VALUES ('"
					+ pessoa.getNome() + "', '" + pessoa.getDataNascimento()
					+ "', " + pessoa.getIdade() + ")");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insertFamilia(Familia familia) {
		try {
			this.stm = this.conn.createStatement();
			this.stm.executeUpdate("INSERT INTO Familia(Nome) " + "VALUES ('"
					+ familia.getNomeDaFamilia() + "')");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Pessoa> getPessoas(){
		ArrayList<Pessoa> auxPessoas = new ArrayList<Pessoa>();
		ResultSet rs;
		try {
			rs = this.stm.executeQuery("SELECT * FROM Pessoa");
			while(rs.next()){
				auxPessoas.add(new Pessoa(rs.getString("Nome"), rs.getString("DataNasc"), rs.getInt("Idade")));
			}
			rs.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return auxPessoas;
	}
	
	public ArrayList<Familia> getFamilias(){
		ArrayList<Familia> auxPessoas = new ArrayList<Familia>();
		ResultSet rs;
		try {
			rs = this.stm.executeQuery("SELECT * FROM Familia");
			while(rs.next()){
				auxPessoas.add(new Familia(rs.getString("Nome")));
			}
			rs.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return auxPessoas;
	}
}