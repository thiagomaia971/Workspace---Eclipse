package POO;

public class TestarAgencia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Agencia a1 = new Agencia();
		a1.numero = 1234;
		
		Agencia a2 = new Agencia();
		a2.numero = 5678;
		
		System.out.println("Agencia 1: "+a1.numero);
		System.out.println("Agencia 2: "+a2.numero);

	}

}
