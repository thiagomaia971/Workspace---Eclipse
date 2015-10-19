package CC_AgendaDigital.Core;

import java.util.ArrayList;

import CC_AgendaDigital.DAO.SQLite;

public class Compromisso {
	
	private final int CompromissoId;
	private final int PessoaId;
	private String NomeCompromisso;
	private ArrayList<Integer> Dias;
	private String horaInicial;
	private String horaFinal;

	public Compromisso(Pessoa Pessoa, String NomeCompromisso, String horaInicial,
			String horaFinal, int... dias) {
		
		this.PessoaId = Pessoa.getId();
		this.CompromissoId = SQLite.qtdeCompromissos();
		this.NomeCompromisso = NomeCompromisso;
		this.horaInicial = horaInicial;
		this.horaFinal = horaFinal;
		
		Dias = new ArrayList<Integer>();
		for (int i : dias) {
			Dias.add(i);
		}
	}

	public String getNomeCompromisso() {
		return NomeCompromisso;
	}

	public void setNomeCompromisso(String nomeCompromisso) {
		if (nomeCompromisso != null) {
			NomeCompromisso = nomeCompromisso;
		}
	}

	public int getCompromissoId(){
		return CompromissoId;
	}
	
	public int getPessoaId(){
		return PessoaId;
	}
	
	public ArrayList<Integer> getDias(){
		return Dias;
	}
	
	public void alterarDias(int... dias) {
		for (int i : dias) {
			Dias.add(i);
		}
	}

	public String getHoraInicial(){
		return horaInicial;
	}
	
	public String getHoraFinal(){
		return horaFinal;
	}
	
	/*public void alterarHoraInicial(int[] horaInicial) {
		this.horaInicial = horaInicial;
	}

	public void alterarHoraFinal(int[] horaFinal) {
		this.horaFinal = horaFinal;
	}

	public int[] getHoraInicial() {
		return horaInicial;
	}

	public int[] getHoraFinal() {
		return horaFinal;
	}*/

}
