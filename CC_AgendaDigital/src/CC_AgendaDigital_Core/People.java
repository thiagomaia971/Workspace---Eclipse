package CC_AgendaDigital_Core;

import java.util.ArrayList;

public class People {
	private String Nome;
	private int Idade;
	private String DataNascimento;
	private ArrayList<Compromisso> Compromissos;

	public People() {
		this.Nome = "";
		this.Idade = 0;
		this.DataNascimento = "xx/xx/xxxx";
		Compromissos = new ArrayList<Compromisso>();
	}
	
	public People(String Nome){
		this.Nome = Nome;
		Compromissos = new ArrayList<Compromisso>();
	}

	public People(String Nome, int Idade, String DataNascimento) {
		this.Nome = Nome;
		this.Idade = Idade;
		this.DataNascimento = DataNascimento;
		Compromissos = new ArrayList<Compromisso>();
	}

	public boolean AdicionarCompromisso(Compromisso compromisso) {
		boolean addCompBool = false;
		Compromissos.add(compromisso);
		if (Compromissos.contains(compromisso)) {
			addCompBool = true;
		}
		return addCompBool;
	}
	
	public ArrayList<Compromisso> ReturnCompromisso(){
		return Compromissos;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		if (nome != null) {
			Nome = nome;
		}
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		if (idade > 1) {
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
}
