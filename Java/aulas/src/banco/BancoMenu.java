package banco;

import java.util.Scanner;

public class BancoMenu {
	
	public static void main(String[] args) {
		String nome, numeroConta;
		int opcao;
		
		Scanner leia = new Scanner(System.in);
		
		linha(50);
		System.out.println("          Bem vindo ao Banco G2Bank");
		linha(50);
		
		System.out.println();
		System.out.print("Digite o seu nome: ");
		nome = leia.next();
		System.out.print("Digite o numero da conta: ");
		numeroConta = leia.next();
		System.out.println();
		do {
			System.out.println("1 - Conta Poupança ");
			System.out.println("2 - Conta Corrente ");
			System.out.println("3 - Conta Especial ");
			System.out.println("4 - Conta Empresarial ");
			System.out.println("5 - Conta Universitária ");
			System.out.println("6 - Extrato Consolidado ");
			System.out.println("0 - Sair ");
			System.out.println("Digite a opção: ");
			opcao = leia.nextInt();
		} while (opcao != 0);
		
	}
	public static void linha(int tamanho) {
		for(int x = 0; x < tamanho ; x++) {
			System.out.print("-");
		}
		System.out.println();
	}
	public static void numeroConta1 (String conta, String saldo) {
		System.out.println("Numero da conta: " + conta);
		System.out.println("Seu saldo é: R$ 0.0" + saldo);
	}
}
