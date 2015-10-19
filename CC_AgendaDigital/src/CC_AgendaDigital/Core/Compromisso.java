package CC_AgendaDigital.Core;

import java.util.ArrayList;

public class Compromisso {
	
	private final int Id;
	private final int PessoaId;
	private String NomeCompromisso;
	private ArrayList<Integer> Dias;
	private int[] horaInicial;
	private int[] horaFinal;

	public Compromisso(int Id, int PessoaId, String NomeCompromisso, int[] horaInicial,
			int[] horaFinal, int... dias) {
		
		this.Id = Id;
		this.PessoaId = PessoaId;
		this.NomeCompromisso = NomeCompromisso;
		this.horaInicial = new int[2];
		this.horaFinal = new int[2];
		
		if(horaInicial[0] >= 0 || horaInicial[0] <= 23 && horaInicial[1] >= 0 || horaInicial[1] <= 59){
			this.horaInicial = horaInicial;
		}
		if(horaFinal[0] >= 0 || horaFinal[0] <= 23 && horaFinal[1] >= 0 || horaFinal[1] <= 59){
			this.horaFinal = horaFinal;
		}
		
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

	public int getId(){
		return Id;
	}
	
	public int getPessoaId(){
		return PessoaId;
	}
	
	public void alterarDias(int... dias) {
		for (int i : dias) {
			Dias.add(i);
		}
	}

	public void alterarHoraInicial(int[] horaInicial) {
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
	}

}
