package CC_AgendaDigital.Core;

import java.util.ArrayList;

public class Compromisso {
	private String NomeCompromisso;
	private ArrayList<Integer> Dias;
	private String horaInicial;
	private String horaFinal;

	public Compromisso(String NomeCompromisso, String horaInicial,
			String horaFinal, int... dias) {
		this.NomeCompromisso = NomeCompromisso;
		this.horaInicial = horaInicial;
		this.horaFinal = horaFinal;
		for (int i : dias) {
			Dias.add(i);
		}
		Dias = new ArrayList<Integer>();
	}

	public String getNomeCompromisso() {
		return NomeCompromisso;
	}

	public void setNomeCompromisso(String nomeCompromisso) {
		if (nomeCompromisso != null) {
			NomeCompromisso = nomeCompromisso;
		}
	}

	public void alterarDias(int... dias) {
		for (int i : dias) {
			Dias.add(i);
		}
	}

	public void alterarHoraInicial(String horaInicial) {
		this.horaInicial = horaInicial;
	}

	public void alterarHoraFinal(String horaFinal) {
		this.horaFinal = horaFinal;
	}

	public String getHoraInicial() {
		return horaInicial;
	}

	public String getHoraFinal() {
		return horaFinal;
	}

}
