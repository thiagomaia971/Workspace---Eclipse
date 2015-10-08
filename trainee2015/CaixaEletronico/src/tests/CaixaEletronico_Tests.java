package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import entities.CaixaEletronico;

public class CaixaEletronico_Tests {

	@Test
	public void Quando_passo_o_valor_10_de_saque_receber_1_nota_de_10() throws Exception {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		int valorSaque = 10;
		
		String resultado = CaixaEletronico.RetornarCedulas(valorSaque);
		assertEquals("1 nota de 10, 0 nota de 20, 0 nota de 50, 0 nota de 100", resultado);
	}
	
	@Test
	public void Quando_passo_o_valor_20_de_saque_receber_1_nota_de_20() throws Exception {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		int valorSaque = 20;
		
		String resultado = CaixaEletronico.RetornarCedulas(valorSaque);
		assertEquals("0 nota de 10, 1 nota de 20, 0 nota de 50, 0 nota de 100", resultado);
	}
	
	@Test
	public void Quando_passo_o_valor_50_de_saque_receber_1_nota_de_50() throws Exception {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		int valorSaque = 50;
		
		String resultado = CaixaEletronico.RetornarCedulas(valorSaque);
		assertEquals("0 nota de 10, 0 nota de 20, 1 nota de 50, 0 nota de 100", resultado);
	}
	
	@Test
	public void Quando_passo_o_valor_100_de_saque_receber_1_nota_de_100() throws Exception {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		int valorSaque = 100;
		
		String resultado = CaixaEletronico.RetornarCedulas(valorSaque);
		assertEquals("0 nota de 10, 0 nota de 20, 0 nota de 50, 1 nota de 100", resultado);
	}

	@Test
	public void Quando_passo_o_valor_110_de_saque_receber_1_nota_de_10_e_1_nota_de_100() throws Exception {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		int valorSaque = 110;
		
		String resultado = CaixaEletronico.RetornarCedulas(valorSaque);
		assertEquals("1 nota de 10, 0 nota de 20, 0 nota de 50, 1 nota de 100", resultado);
	}
	
	@Test
	public void Quando_passo_o_valor_60_de_saque_receber_1_nota_de_50_e_1_nota_de_10() throws Exception {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		int valorSaque = 60;
		
		String resultado = CaixaEletronico.RetornarCedulas(valorSaque);
		assertEquals("1 nota de 10, 0 nota de 20, 1 nota de 50, 0 nota de 100", resultado);
	}

	@Test
	public void Quando_passo_o_valor_200_de_saque_receber_2_nota_de_100() throws Exception {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		int valorSaque = 200;
		
		String resultado = CaixaEletronico.RetornarCedulas(valorSaque);
		assertEquals("0 nota de 10, 0 nota de 20, 0 nota de 50, 2 nota de 100", resultado);
	}
	
	@Test
	public void Quando_passo_o_valor_550_de_saque_receber_1_nota_de_50_e_5_nota_de_100() throws Exception {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		int valorSaque = 550;
		
		String resultado = CaixaEletronico.RetornarCedulas(valorSaque);
		assertEquals("0 nota de 10, 0 nota de 20, 1 nota de 50, 5 nota de 100", resultado);
	}

	@Test
	public void Quando_passo_o_valor_2510_de_saque_receber_1_nota_de_10_e_25_nota_de_100() throws Exception {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		int valorSaque = 2510;
		
		String resultado = CaixaEletronico.RetornarCedulas(valorSaque);
		assertEquals("1 nota de 10, 0 nota de 20, 0 nota de 50, 25 nota de 100", resultado);
	}
	
	@Test(expected = Exception.class)
	public void Quando_passo_o_valor_77_de_saque_receber_Exeption() throws Exception {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		int valorSaque = 77;
		
		String resultado = CaixaEletronico.RetornarCedulas(valorSaque);
		
	}
	
	@Test(expected = Exception.class)
	public void Quando_passo_o_valor_0_de_saque_receber_Exeption() throws Exception {
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		
		int valorSaque = 0;
		
		String resultado = CaixaEletronico.RetornarCedulas(valorSaque);
		
	}
	
	

}
