package POO;

public class TestarGerente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.salario = 1000;
		
		System.out.println("Salário: "+ g.salario);
		
		System.out.println("Aumentando o salario em 10%: ");
		g.aumentaSalario();
		
		System.out.println("Salario: "+ g.salario);
		
		System.out.println("Aumentando o salario em 30%: ");
		g.aumentarSalario(0.3);
		
		System.out.println("Salario: "+ g.salario);
		
		System.out.println("Aumentando o salario em 50%: ");
		g.aumentarSalario(0.5);
		
		System.out.println("Salario: "+ g.salario);
		

	}

}
