package POO;

public class TestarClienteECartao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cliente c = new Cliente();
		CartaoCredito cdc = new CartaoCredito();
		
		c.nome = "Thiago Maia";
		cdc.numero = 111111;
		
		cdc.cliente = c;
		
		System.out.println(cdc.numero);
		System.out.println(cdc.cliente.nome);
		

	}

}
