package Lista2;

import java.util.Scanner;

public class Tarefa4 {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o numero: ");
		numero = leia.nextInt();
		
		if(numero < 0) {
			System.out.println("Numero negativo");
		}
		else {
			System.out.println("Numero positivo");
		}
		if(numero%2 ==0) {
			System.out.println("Numero par");
		}
		else {
			System.out.println("Numero impar");
		}
	}

}
