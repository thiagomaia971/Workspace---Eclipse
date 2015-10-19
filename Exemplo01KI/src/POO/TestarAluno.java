package POO;

public class TestarAluno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		a1.nome = "Thiago Maia";
		a1.dataDeNacismento = "26/04/1997";
		
		Aluno a2 = new Aluno();
		a2.nome = "Manuel";
		a2.dataDeNacismento = "25/12/1960";
		
		Funcionario fun1 = new Funcionario();
		fun1.nome = "Diego";
		fun1.salario = 500;
		
		Funcionario fun2 = new Funcionario();
		fun2.nome = "Maria";
		fun2.salario = 1000;
		
		System.out.println(a1.nome);
		System.out.println(a1.dataDeNacismento);
		
		System.out.println(a2.nome);
		System.out.println(a2.dataDeNacismento);
		
		System.out.println(fun1.nome);
		System.out.println(fun1.salario);
		
		System.out.println(fun2.nome);
		System.out.println(fun2.salario);

	}

}
