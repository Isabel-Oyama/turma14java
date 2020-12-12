package lista5;

import java.util.Scanner;

public class Tarefa3 {

	public static void main(String[] args) {
		
		int intervalo1=0;
		int intervalo2=0;
		int intervalo3=0;
		int intervalo4=0;
		int numero;
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número de 0 a 100: ");
			numero = leia.nextInt();
			if(numero >= 0 && numero <= 25) {
				intervalo1++;
			}
			else if(numero >= 26 && numero <= 50) {
				intervalo2++;
			}
			else if(numero >= 51 && numero <= 75) {
				intervalo3++;
			}
			else if(numero >= 76 && numero <= 100) {
				intervalo4++;
			}
		}while(numero >=0);
		
		System.out.println("Números no intervalo 1: "+ intervalo1);
		System.out.println("Números no intervalo 2: "+ intervalo2);
		System.out.println("Números no intervalo 3: "+ intervalo3);
		System.out.println("Números no intervalo 4: "+ intervalo4);
	}

}
