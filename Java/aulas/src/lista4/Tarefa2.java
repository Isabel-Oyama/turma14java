package lista4;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Tarefa2 {

	public static void main(String[] args) {
			
		int lancamento[] = new int[10];
		int soma=0;
		
		for(int i = 0 ; i < 10; i++) {
			lancamento[i] = ThreadLocalRandom.current().nextInt(1,7 );
			System.out.println("Dado lancou" + lancamento[i] + " ");
		}
		for(int i=0 ; i<10; i++) {
			soma += lancamento[i];
		}
		linha();
		System.out.println("Média aritmética: " + (soma/10));

	}
	public static void linha() {
		System.out.println("\n");
	}
}
