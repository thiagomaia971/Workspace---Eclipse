
public class ImprimePadrao1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int contador = 1; contador <= 100; contador++){
			int resto = contador % 2;
			if(resto == 1){
				System.out.println("*");
			}else{
				System.out.println("**");
			}
		}

	}

}
