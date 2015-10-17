package CC_AgendaDigital.Core;

import java.util.ArrayList;

public class Pessoa extends Familia {

	private String Nome;
	private int Idade;
	private String DataNascimento;
	private ArrayList<Compromisso> Compromissos;

	public Pessoa() {
		this.Nome = "";
		this.Idade = 0;
		this.DataNascimento = "xx/xx/xxxx";
		Compromissos = new ArrayList<Compromisso>();
	}

	public Pessoa(String Nome) {
		this.Nome = Nome;
		this.Idade = 0;
		this.DataNascimento = "xx/xx/xxxx";
		Compromissos = new ArrayList<Compromisso>();
	}

	public Pessoa(String Nome, String DataNascimento, int Idade) {
		this.Nome = Nome;
		do {
			if (Idade < 6) {
				System.out.println("Idade muito baixo");
			} else {
				this.Idade = Idade;
			}
		} while (Idade < 6);
		
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
	
public String toString(){
		
		return Nome;
	}
}
