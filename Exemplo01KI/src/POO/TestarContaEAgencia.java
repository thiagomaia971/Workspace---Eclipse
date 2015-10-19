package POO;

public class TestarContaEAgencia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Agencia a = new Agencia();
		Conta c = new Conta();
		
		a.numero = 178;
		c.saldo = 1000.0;
		c.agencia = a;
		
		
		System.out.println(c.agencia.numero);
		System.out.println(c.saldo);

	}

}
