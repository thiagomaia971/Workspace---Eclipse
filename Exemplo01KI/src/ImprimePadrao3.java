
public class ImprimePadrao3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		imprimir(4);
		imprimir(5);
				
	}

	public static void imprimir(int quantidade) {
		for(int contador = 1; contador <= quantidade; contador++){
			
			for(int contador2 = 1; contador2 <= contador; contador2++){
				System.out.print("*");
			}
			System.out.println(" ");
			
		}

		
	}
}
