package POO;

public class TestarCartaoDeCredito {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CartaoCredito ccd1 = new CartaoCredito();
		ccd1.numero = 111111;
		ccd1.dataDeValidade = "25/12/2014";
		
		CartaoCredito ccd2 = new CartaoCredito();
		ccd2.numero = 222222;
		ccd2.dataDeValidade = "25/12/2014";
		
		System.out.println("Número: "+ccd1.numero);
		System.out.println("Data de Validade: "+ccd1.dataDeValidade);
		
		System.out.println(" ");
		
		System.out.println("Númeor: "+ccd2.numero);
		System.out.println("Data de Validade: "+ccd2.dataDeValidade);
		
		
		

	}

}
