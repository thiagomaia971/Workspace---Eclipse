package POO;

public class TestarFuncionario {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		f.aumentarSalario(300);
		
		double saldoSalario = f.consultarSalario();
		
		String imprimirNome = f.consultarNome();

		System.out.println(imprimirNome);
		System.out.println(saldoSalario);
		
	}

}
