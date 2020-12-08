import java.util.Scanner;

public class caminandoVoyFinal {
	
	public static void main (String[] args) {
		
		final int APTAS = 1000;
		boolean[] listaDeRutas = new boolean[APTAS];
		
		int aptasComprobadas = 0;
		
		Scanner sc = new Scanner(System.in);
		
		int desnivelMaximo = 0, numeroDeNiveles = 0, siguiente = 0, anterior = 0;
		
		while(sc.hasNext()) {
			
			int desnivelParcial = 0;
			desnivelMaximo = sc.nextInt();
			numeroDeNiveles = sc.nextInt();
			int ciclos = 0;
			boolean apta = true;
			
			while (ciclos < numeroDeNiveles) {
				siguiente = sc.nextInt();
				if (ciclos == 0) {
					anterior = siguiente;
				}
				else {
					if ((siguiente - anterior) > 0) {
						
						desnivelParcial = desnivelParcial + siguiente - anterior;
						anterior = siguiente;
						if (desnivelParcial > desnivelMaximo) {
							apta = false;
						}
					}
					else {
						desnivelParcial = 0;
					}
				}
				ciclos++;
			}
			listaDeRutas[aptasComprobadas] = apta;
			aptasComprobadas++;
			if (desnivelMaximo == 0) {
				break;
			}
		}
		for (int i = 0; i < aptasComprobadas; i++) {
			if (listaDeRutas[i]) {
				System.out.println("APTA");
			}
			else {
				System.out.println("NO APTA");
			}
		}
	}
	
}
