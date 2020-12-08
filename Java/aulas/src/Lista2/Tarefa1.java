package Lista2;

import java.util.Scanner;

public class Tarefa1 {
	
	public static void main(String[] args) {
		
		int p, e = 0,m = 0;
		
		final int PESO_LIMITE = 50;
		final int VALOR = 4;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Peso de tomates: ");
		p = leia.nextInt();
		
		if (p > PESO_LIMITE) {
			e = p - PESO_LIMITE;
			m = e * VALOR;
		}
		System.out.println("Peso excedente: " + e);
		System.out.println(" Valor multa: " + m);
		
	}

}
