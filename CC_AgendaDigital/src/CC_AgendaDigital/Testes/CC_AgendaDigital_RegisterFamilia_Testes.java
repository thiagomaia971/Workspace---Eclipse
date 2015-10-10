package CC_AgendaDigital.Testes;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import CC_AgendaDigital.Core.Compromisso;
import CC_AgendaDigital.Core.ControllerFamilia;
import CC_AgendaDigital.Core.Familia;
import CC_AgendaDigital.Core.Pessoa;

public class CC_AgendaDigital_RegisterFamilia_Testes {
	/*
	 * Cadastrar_a_Familia_Maia_e_Verificar_se_essa_familia_esta_na_lista_de_Familias
	 * Cadastrar_a_Familia_Maia_e_adicionar_2_pessoas_nela_e_Verificar_quantas_pessoas_existem_na_Familia_Maia
	 * Cadastrar_a_Familia_Maias_e_Verificar_se_a_Familia_esta_Cadastrada_caso_estiver_cadastrada_receber_todas_as_pessoas_dessa_familia
	 * Cadastrar_A_Familia_Maias_e_a_Familia_Freitas_e_adicionar_2_pessoas_na_Maias_e_1_na_freitas_e_verificar_qual_Familia_a_pessoa_1_esta
	*/

	@Test
	public void Cadastrar_a_Familia_Maia_e_Verificar_se_essa_familia_esta_na_lista_de_Familias() {
		// Arrange
		Familia familia = new Familia("Maia");
		ControllerFamilia controller = new ControllerFamilia();

		// Act
		controller.registrarFamilia(familia);

		// Assert
		assertTrue(controller.checkFamiliaPorNome(familia.getNomeDaFamilia()));
	}
	
	@Test
	public void Cadastrar_a_Familia_Maia_e_adicionar_2_pessoas_nela_e_Verificar_quantas_pessoas_existem_na_Familia_Maia() {
		// Arrange
		Familia familia = new Familia("Maia");
		
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		ControllerFamilia controlFamilia = new ControllerFamilia();

		// Act
		controlFamilia.registrarFamilia(familia);
		familia.registrarPessoa(p1);
		familia.registrarPessoa(p2);

		// Assert
		assertEquals(2, familia.getQuantidadeDePessoas());
	}
	
	@Test
	public void Cadastrar_A_Familia_Maias_e_a_Familia_Freitas_e_adicionar_2_pessoas_na_Maias_e_1_na_freitas_e_verificar_qual_Familia_a_pessoa_1_esta() {
		// Arrange
		Familia familia1 = new Familia("Maia");
		Familia familia2 = new Familia("Freitas");
		
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa();
		
		ControllerFamilia controlFamilia = new ControllerFamilia();

		// Act
		controlFamilia.registrarFamilia(familia1);
		controlFamilia.registrarFamilia(familia2);
		
		familia1.registrarPessoa(p1);
		familia1.registrarPessoa(p2);
		
		familia2.registrarPessoa(p3);

		// Assert
		assertEquals(2, p1.getNomeDaFamilia());
	}
	
	@Test
	public void Criar_() {
		// Arrange
		Pessoa thiago = new Pessoa("Thiago");
		Compromisso compromisso1 = new Compromisso("Colegio", "7:30", "12:00", 2, 4, 6);

		Compromisso compromisso2 = new Compromisso("Curso de Ingles", "8:00", "11:00", 7);
		// Act
		thiago.adicionarCompromisso(compromisso1);
		thiago.adicionarCompromisso(compromisso2);

		// Assert
		ArrayList<Compromisso> compromissos = thiago.getCompromisso();
		for (Compromisso c : compromissos) {
			System.out.println(c.getNomeCompromisso());
		}
		
		//assertEquals(2, familia.getQuantidadeDePessoas());
	}
	
}
