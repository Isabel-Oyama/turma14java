package loja;

import java.util.Scanner;

public class CadLoja {

	public static void main(String[] args) {
		String codigos[] = new String[10];
		String produtos[] = {"HD320GB","HD500GB","HD1TERA","SSD120GB","SSD240GB","MEMORIA RAN 2GB","MEMORIA RAN 4GB","MEMORIA RAN 8GB","CARREGADOR TYPE-C","CARREGADOR IPHONE"};
		double precoUnitarios[] = {150,200,400,200,400,40,100,250,30,40};
		int estoque[] = new int[10];
		int opcaoMenu;
		char opcao;
		String nome, escolha;
		int escolhido=0, unidade = 0;
		char genero;
		Scanner leia = new Scanner(System.in);

		linha(80);
		System.out.println("         Informatica Oyama");
		linha(80);
		for (int x = 0; x < 10; x++) {
			estoque[x] = 10;
		}
		do {
			System.out.println("[1] - Comprar Produtos");
			System.out.println("[2] - Gerenciar Estoque");
			System.out.println("[3] - Sair");
			System.out.println();
			System.out.print("Digite a opção: ");
			opcaoMenu = leia.nextInt();
			System.out.println("");
			switch (opcaoMenu) {
			case 1:
				System.out.print("Digite o seu nome: ");
				nome = leia.next().toUpperCase();
				System.out.print("Qual o seu genero M-maculino, F-feminino, O-outros: ");
				genero = leia.next().toUpperCase().charAt(0);
				if (genero == 'M') {
					System.out.println("Seja bem vindo! " + nome);
				} else if (genero == 'F') {
					System.out.println("Seja bem vinda! " + nome);
				} else {
					System.out.println("Seja bem vindo(a)! " + nome);
				}
				
				System.out.println("CODIGO\t\tR$(UN)\t\tESTOQUE\tPRODUTO");
				for (int x=0; x<10; x++)
				{
					codigos[x]= (x<9) ? "OYA-00" + (x+1) : "OYA-0" + (x+1);
					System.out.printf("%s\t\t%.2f\t\t%d\t%s\n",codigos[x],precoUnitarios[x],estoque[x],produtos[x]);
				}
				System.out.println("Selecione pelo codigo um produto: ");
				escolha = leia.next().toUpperCase();
				
				for (int x=0; x<10; x++)
				{
					if (codigos[x].equals(escolha))
					{
						escolhido = x;
					}
					
				}
				System.out.println("Produto escolhido: "+produtos[escolhido]);
				
				if (estoque[escolhido] == 0) {
					System.out.println("Não há estoque do produto!");
					break;
				}
				do {
					System.out.print("Quantidade de unidade desejado: ");
					unidade = leia.nextInt();
					if (unidade > estoque[escolhido]) {
						System.out.println("Estoque insuficiente!");
					} 
					if (unidade < 0) {
						System.out.println("Valor não pode ser negativo!");
					}
				} while(unidade > estoque[escolhido] || unidade < 0);
				
				estoque[escolhido] -= unidade;
				System.out.printf("Valor à ser pago: R$ %.2f\n", precoUnitarios[escolhido] * unidade);
				System.out.println("Produto: " + produtos[escolhido] + " [" + codigos[escolhido] + "] - Estoque: " + estoque[escolhido]);
				
				break;
				
			case 2:
				System.out.println("WIP"); // work in progress
				break;
			case 3:
				System.out.println("Volte sempre!!!");
				break;
			}
			System.out.println("Deseja continuar S/N: ");
			opcao = leia.next().toUpperCase().charAt(0);
			while(opcao != 'S' && opcao != 'N') {
				System.out.println("Por favor digite S ou N. Tente de novamente: ");
				opcao = leia.next().toUpperCase().charAt(0);
			}
		} while (opcao != 'N');

	}

	public static void linha(int tamanho) {
		for (int x = 0; x < tamanho; x++) {
			System.out.print("-");
		}
		System.out.println("\n");
	}

	public static String opcaoGenero(char genero) {
		if (genero == 'M') {
			return "AAA";
		} else if (genero == 'F') {
			return "BBB";
		} else {
			return "CCC";
		}
	}
}
