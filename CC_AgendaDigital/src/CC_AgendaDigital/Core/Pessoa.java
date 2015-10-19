package CC_AgendaDigital.Core;

import java.util.ArrayList;

public class Pessoa{

	private final int PessoaId;
	private String Nome;
	private int Idade;
	private String DataNascimento;
	private ArrayList<Compromisso> Compromissos;

	public Pessoa(String Nome, String DataNascimento, int Idade) {
		this.PessoaId = 0;
		this.Nome = Nome;
		this.Idade = Idade;
		this.DataNascimento = DataNascimento;
		Compromissos = new ArrayList<Compromisso>();
	}

	public Pessoa(int PessoaId, int FamiliaId, String Nome, String DataNascimento, int Idade) {
		this.PessoaId = PessoaId;
		this.Nome = Nome;
		this.Idade = Idade;
		this.DataNascimento = DataNascimento;
		Compromissos = new ArrayList<Compromisso>();
	}

	public boolean adicionarCompromisso(Compromisso compromisso) {
		boolean addCompBool = false;
		Compromissos.add(compromisso);
		if (Compromissos.contains(compromisso)) {
			addCompBool = true;
		}
		return addCompBool;
	}

	public ArrayList<Compromisso> getCompromisso() {
		return Compromissos;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String Nome) {
		if (Nome != null || Nome != "") {
			this.Nome = Nome;
		}
	}

	public int getIdade() {
		return Idade;
	}

	public int getId() {
		return PessoaId;
	}


	public void setIdade(int idade) {
		if (idade > 5) {
			Idade = idade;
		}
	}

	public String getDataNascimento() {
		return DataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		if (dataNascimento != null) {
			DataNascimento = dataNascimento;
		}
	}

	public String toString() {

		return "�" + (PessoaId + 1)+ ".  " + Nome;
	}
}
