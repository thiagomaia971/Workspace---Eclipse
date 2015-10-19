package POO;

public class Gerente {
	String nome;
	double salario;
	
	void aumentaSalario() {
		this.salario += this.salario * 0.1;
	}
	
	void aumentarSalario(double taxa){
		this.salario += this.salario * taxa;
	}
	
	
}
