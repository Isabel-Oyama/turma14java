package Lista2;

import java.util.Scanner;

public class Tarefa8 {
	
	public static void main(String[] args) {
	
		int N, valor = 0, numeroDigitado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Escreva o valor de N: ");
		N = leia.nextInt();
		
		if(N > 100) {
			System.out.println("Numero digitado é: " + N);
			numeroDigitado = leia.nextInt();
		} else {
			valor = 0;
			System.out.println(valor);
		}
	}
}
