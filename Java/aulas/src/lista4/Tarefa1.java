package lista4;

import java.util.Scanner;

public class Tarefa1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int pontuacao[] = new int[5];
		int maiorNumero = -1;
		boolean trocado = true;
		
		for(int i=0; i<5; i++) {
			System.out.println("Digite a pontuação: ");
			pontuacao[i] = leia.nextInt();
		}
		for(int i=0; i<5; i++) {
			System.out.println("Pontuação " + (i+1) + " : " + pontuacao[i]);
		}
		for(int i=0; i<5; i++) {
			if(pontuacao[i]>maiorNumero) {
				maiorNumero = pontuacao[i];
			}
		}
		System.out.println("Maior numero: " + maiorNumero);

	}

}
