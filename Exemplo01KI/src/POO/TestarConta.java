package POO;

public class TestarConta {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Conta c = new Conta();
		
		c.deposita(1000);
		c.imprimeExtrato();
		
		c.saca(100);
		c.imprimeExtrato();
		
		double SaldoDisponivel = c.consultaSaldoDisponivel();
		

		System.out.println("SALDO DISPONIVEL: "+ SaldoDisponivel);
	}

}
