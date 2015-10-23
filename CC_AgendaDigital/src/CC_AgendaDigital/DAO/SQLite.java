package CC_AgendaDigital.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import CC_AgendaDigital.Core.Compromisso;
import CC_AgendaDigital.Core.Pessoa;

public class SQLite {
	private static Connection conn;
	private static Statement stm;

	public SQLite(String arquivo) {
		try {
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection("jdbc:sqlite:" + arquivo);
			//stm = conn.createStatement();
		} catch (Exception e) {
			e.getMessage();
		}
		createTables();
	}

	/**
	 * Test
	 * 
	 * @param pessoa
	 */
	public static void insertPessoa(Pessoa pessoa) {
		try {
			stm = conn.createStatement();
			stm.executeUpdate("INSERT INTO Pessoa (Nome, DataNasc, Idade) " + "VALUES ('" + pessoa.getNome() + "', '"
					+ pessoa.getDataNascimento() + "', " + pessoa.getIdade() + ")");
			// stm.cancel();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<Pessoa> getPessoas() {
		ArrayList<Pessoa> auxPessoas = new ArrayList<Pessoa>();
		ResultSet rs;

		try {

			rs = stm.executeQuery("SELECT * FROM Pessoa");
			while (rs.next()) {
				auxPessoas.add(new Pessoa(rs.getString("Nome"), rs.getString("DataNasc"), rs.getInt("Idade")));
			}

			rs.close();

		} catch (Exception e) {
			// TODO: handle exception
		}

		return auxPessoas;
	}

	public static void insertCompromisso(Compromisso Compromisso) {

		try {
			stm = conn.createStatement();
			stm.executeUpdate(
					"INSERT INTO [Compromisso](CompromissoId, PessoaId, NomeCompromisso, Dias, HoraInicial, HoraFinal) "
							+ "VALUES (" + Compromisso.getCompromissoId() + ", " + Compromisso.getPessoaId() + ", '"
							+ Compromisso.getNomeCompromisso() + "', " + Compromisso.getDias() + ", '"
							+ Compromisso.getHoraInicial() + "', '" + Compromisso.getHoraFinal() + "')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static int pessoasId(Pessoa pessoa) {
		int qtdePessoas = 0;
		ResultSet rs;
		try {
			rs = stm.executeQuery("SELECT PessoaId FROM Pessoa WHERE Nome = '" + pessoa.getNome() + "'");
			while (rs.next()) {
				qtdePessoas = rs.getInt("PessoaId");
			}

			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return qtdePessoas;
	}

	public static int qtdeCompromissos() {
		int qtdeCompromissos = 0;
		ResultSet rs;
		try {
			rs = stm.executeQuery("SELECT * FROM Compromisso");
			while (rs.next()) {
				qtdeCompromissos = rs.getInt("CompromissoId");
			}

			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return qtdeCompromissos;
	}

	private void createTables() {
		try {
			stm = conn.createStatement();
			stm.executeUpdate("CREATE TABLE IF NOT EXISTS Pessoa (PessoaId INTEGER PRIMARY KEY NOT NULL"
					+ ", Nome VARCHAR(30) NOT NULL, DataNasc VARCHAR(10) NOT NULL, Idade INTEGER NOT NULL)");

			stm.executeUpdate("CREATE TABLE IF NOT EXISTS [Compromisso] (CompromissoId INTEGER PRIMARY KEY"
					+ ", PessoaId INTEGER, NomeCompromisso VARCHAR(20) NOT NULL, Dias INTEGER NOT NULL"
					+ ", HoraInicial VARCHAR(5) NOT NULL, HoraFinal VARCHAR(5) NOT NULL" + ", FOREIGN KEY ([PessoaId]) "
					+ "  REFERENCES [Pessoa] ([PessoaId]))");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
