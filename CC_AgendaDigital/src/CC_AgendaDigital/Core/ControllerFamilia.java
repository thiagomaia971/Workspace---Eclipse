package CC_AgendaDigital.Core;

import java.util.ArrayList;

public class ControllerFamilia {

	private ArrayList<Familia> ListaDeFamilias;
	private int quantidadeDeFamilias;

	public ControllerFamilia() {
		ListaDeFamilias = new ArrayList<Familia>();
		quantidadeDeFamilias = 0;
	}

	public boolean registrarFamilia(Familia Familia) {
		ListaDeFamilias.add(Familia);
		if (ListaDeFamilias.contains(Familia)) {
			quantidadeDeFamilias++;
			return true;
		}
		return false;
	}

	public boolean listaDeFamilias_IsEmpty() {
		if (quantidadeDeFamilias == 0) {
			return true;
		}
		return false;
	}

	public boolean checkFamiliaPorNome(String nameFamily) {
		for (Familia familia : ListaDeFamilias) {
			if (familia.getNomeDaFamilia().equals(nameFamily)) {
				return true;
			}
		}
		return false;
	}

	public ArrayList<Pessoa> retornarTodasPessoasDaFamiliaPeloNome(String NameFamily) {
		ArrayList<Pessoa> pessoas = null;
		if (!listaDeFamilias_IsEmpty()) {
			for (Familia familia : ListaDeFamilias) {
				if (familia.getNomeDaFamilia().equals(NameFamily)) {
					pessoas = familia.retornarListaDePessoas();
				}
			}
		}
		return pessoas;
	}
}
