package Lista2;

import java.util.Scanner;

public class Tarefa7 {

	public static void main(String[] args) {
		
		int area, base=0, altura=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de base: ");
		base = leia.nextInt();
		System.out.println("Digite o valor de altura: ");
		altura = leia.nextInt();
		
		if(base < 0 || altura < 0) {
			System.out.println("Valor inválido");
		}else {
			area = calcularArea(base, altura);
			System.out.println("O valor da area é: " + area);
		}
		
	}
	public static int calcularArea (int base, int altura) {
		return (base*altura) / 2;
	}
}
