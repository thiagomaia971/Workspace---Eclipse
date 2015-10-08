package CC_AgendaDigital_Core;

import java.util.ArrayList;

public class Compromisso {
	private String NomeCompromisso;
	private String Descricao;
	private ArrayList<String> Dias;

	public String getNomeCompromisso() {
		return NomeCompromisso;
	}

	public void setNomeCompromisso(String nomeCompromisso) {
		if (nomeCompromisso != null) {
			NomeCompromisso = nomeCompromisso;
		}
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		if (descricao != null) {
			Descricao = descricao;
		}
	}

}
