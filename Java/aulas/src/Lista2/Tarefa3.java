package Lista2;

import java.util.Scanner;

public class Tarefa3 {
	public static void main(String[] args) {
		
		int numero1, numero2, numero3, numero4, resultado1, resultado2, resultado3, resultado4;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Numero 1: ");
		numero1 = leia.nextInt();
		
		System.out.println("Numero 2: ");
		numero2 = leia.nextInt();
		
		System.out.println("Numero 3: ");
		numero3 = leia.nextInt();
		
		System.out.println("Numero 4: ");
		numero4 = leia.nextInt();
		
		if(Math.pow(numero3, 2)>= 1000) {
			System.out.println(Math.pow(numero3, 2));
			return;
		}else {
			System.out.println("Numero 1: " + numero1 + " quadrado: " + Math.pow(numero1, 2));
			System.out.println("Numero 2: " + numero1 + " quadrado: " + Math.pow(numero2, 2));
			System.out.println("Numero 3: " + numero1 + " quadrado: " + Math.pow(numero3, 2));
			System.out.println("Numero 4: " + numero1 + " quadrado: " + Math.pow(numero4, 2));

		}
	}
}
