package POO;

public class Funcionario {
	String nome;
	double salario = 2000;
	
	double aumentarSalario(double valor){
		return this.salario += valor;
	}
	
	double consultarSalario(){
		return this.salario;
	}
	
	String consultarNome(){
		return this.nome = "Thiago";
	}
	
	
}
