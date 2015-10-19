package POO;

public class TestaCliente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		c1.nome = "Thiago Maia";
		c1.codigo = 1;
		
		Cliente c2 = new Cliente();
		c2.nome = "Manuel Ferreira";
		c2.codigo = 2;
		
		System.out.println(c1.nome);
		System.out.println(c1.codigo);
		
		System.out.println(" ");
		
		System.out.println(c2.nome);
		System.out.println(c2.codigo);
		

	}

}
