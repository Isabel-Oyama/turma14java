package lista5;

import java.util.Scanner;

public class Tarefa2 {
	
	public static void main(String[] args) {
		double peso;
		double altura;
		double imc;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a sua altura(cm): ");
		altura = leia.nextDouble();
		
		System.out.println("Digite o seu peso(kg): ");
		peso = leia.nextDouble();
		
		imc = calcularImc(peso, altura/100);
		System.out.printf("Seu IMC é de: %.2f\n", imc);
		
		if(imc < 18.5) {
			System.out.println("Abaixo do peso");
		}
		else if(imc >= 18.5 && imc < 25.0) {
			System.out.println("Peso normal");
		}
		else if(imc >= 25 && imc < 30) {
			System.out.println("Acima do peso");
		}
		else {
			System.out.println("Obeso");
		}
	}
	public static double calcularImc(double peso, double altura) {
		double imc = peso/Math.pow(altura,2.0);
		return imc;
	}
}
