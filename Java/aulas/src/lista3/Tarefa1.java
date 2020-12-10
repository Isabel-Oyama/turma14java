package lista3;

import java.util.Scanner;

public class Tarefa1 {

	public static void main(String[] args) {
		
		final int HABITANTES = 20;
		
		double salario;
		double numeroFilhos=0, totalFilhos=0;
		double mediaSalarios, mediaNumeroFilhos = 0;
		double maiorSalario=0, percentualPessoas100, totalSalarios=0;
		double conta100=0;
		Scanner leia = new Scanner(System.in);
		
		for (int habitantes = 1 ; habitantes <= HABITANTES ; habitantes++) {
			
			System.out.println("Digite o salario do habitantes: ");
			salario = leia.nextDouble();
			System.out.println("Digite o numero de filhos do habitante: ");
			numeroFilhos = leia.nextDouble();
			
			totalSalarios = totalSalarios + salario;
			totalFilhos = totalFilhos + numeroFilhos;
			if (maiorSalario < salario) {
				maiorSalario = salario;
			} if(salario <= 100) {
				conta100++;
			}
		}
		mediaSalarios = (totalSalarios/HABITANTES);
		mediaNumeroFilhos = totalFilhos / HABITANTES;
		percentualPessoas100 = (conta100/HABITANTES)*100;
	}
}
