package entities;

import java.util.HashMap;
import java.util.Map;

public class CaixaEletronico {
	static Map<Integer, Integer> notas;

	public CaixaEletronico() {
		notas = new HashMap<Integer, Integer>();
		notas.put(100, 0);
		notas.put(50, 0);
		notas.put(20, 0);
		notas.put(10, 0);
	}
	

	public static String RetornarCedulas(int valorSaque) throws Exception {
		int aux = valorSaque;
		
		if(!(valorSaque%5==0) || valorSaque == 0){
			throw new Exception("Apenas número divisiveis por 5 e diferente de 0!");
		}
		
		do {
			if(aux >= 100){
				notas.put(100, notas.get(100) + 1);
				aux = aux - 100;
			}
		} while (aux >= 100);
		
		if(aux >= 50){
			notas.put(50, notas.get(50) + 1);
			aux = aux - 50;
		}
		
		do {
			if(aux >= 20){
				notas.put(20, notas.get(20) + 1);
				aux = aux - 20;
			}
		} while (aux >= 20);
		
		do {
			if(aux >= 10){
				notas.put(10, notas.get(10) + 1);
				aux = aux - 10;
			}
		} while (aux >= 10);
		
		return notas.get(10) + " nota de 10, " + notas.get(20) + " nota de 20, " + notas.get(50) + " nota de 50, " + notas.get(100) + " nota de 100";
	}
	
}
