package Lista2;

import java.util.Scanner;

public class Tarefa5 {

	public static void main(String[] args) {
		
		double indice;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o indice de poluição: ");
		indice = leia.nextDouble();
		
		if(indice >= 0.3 && indice < 0.4) {
			System.out.println("Grupo 1 suspender atividades");
		}
		else if(indice >= 0.4 && indice < 0.5) {
			System.out.println("Grupo 1 e 2 suspender atividades");
		}
		else if(indice >= 0.5) {
			System.out.println("Suspender todos os grupos");
		}
		else {
			System.out.println("Indice aceitável");
		}
	}
}
