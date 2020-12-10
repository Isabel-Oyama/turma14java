package lista3;

import java.util.Scanner;

public class Tarefa1Enquanto {

	public static void main(String[] args) {

		int numero = 0, soma=0;
		Scanner leia = new Scanner(System.in);
		
		while (numero>=0) {
			System.out.println("Digite um valor: ");
			numero = leia.nextInt();
			if(numero > 0) {
				soma += numero;
			}
		}
		System.out.println("Valor Total: " + soma);
		System.out.println("Fim");
	}

}
