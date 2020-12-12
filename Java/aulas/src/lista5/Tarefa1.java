package lista5;

import java.util.Scanner;

public class Tarefa1 {
	
	public static void main(String[] args) {
		
		int acessoTransacao;
		double valor, total=0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual o valor do produto: ");
		valor = leia.nextInt();
		
		System.out.println("1 - À vista em dinheiro ou cheque");
		System.out.println("2 - À vista no cartão de crédito");
		System.out.println("3 - Parcelado em 2x ");
		System.out.println("4 - PArcelado em 3x \n");
		acessoTransacao = leia.nextInt();
		
		if(acessoTransacao == 1) {
			System.out.println("Pagamento à vista com 20% de desconto!");
			total = valor*0.80;
		}
		else if(acessoTransacao == 2) {
			System.out.println("Pagamento à vista com cartão de crédito, desconto de 15%!");
			total = valor*0.85;
		}
		else if(acessoTransacao == 3) {
			System.out.println("Pagamento parcelado em 2x!");
			total = valor;
			System.out.printf("2 parcelas de R$ %.2f\n", (total/2));
		}
		else if(acessoTransacao ==4) {
			System.out.println("Pagamento parcelado em 3x, juros de 10%!");
			total = valor*1.10;
			System.out.printf("3 parcelas de R$ %.2f\n", (total/3));
		}
		System.out.printf("O valor total é: R$ %.2f", total);
	}
}
