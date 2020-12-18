package loja;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadLojaObejetos {

	public static void main(String[] args) {
		int opcaoMenu;
		Scanner leia = new Scanner(System.in);
		List<Produto> produtos = cadastrarProdutos();
		List<Venda> produtosVendidos = new ArrayList<>();

		linha(80);
		System.out.println("         Informatica Oyama");
		linha(80);
		
		do {
			mostrarProdutos(produtos);
			System.out.println();
			Produto produtoEscolhido = null;
			System.out.println();
			System.out.println("[1] - Comprar Produtos");
			System.out.println("[2] - Gerenciar Estoque");
			System.out.println("[3] - Emitir nota");
			System.out.println("[0] - Sair");
			System.out.println();
			System.out.print("Digite a opção: ");
			opcaoMenu = leia.nextInt();
			System.out.println("");
			switch (opcaoMenu) {
			case 1:
				System.out.print("Digite o seu nome: ");
				String nome = leia.next();
				System.out.print("Qual o seu genero M-maculino, F-feminino, O-outros: ");
				char genero = leia.next().toUpperCase().charAt(0);
				System.out.println("Digite o seu ano de nascimento: ");
				int anoNascimento = leia.nextInt();
				
				System.out.println("Digite o seu CPF: ");
				String cpf = leia.next();
				Cliente cliente = new Cliente(nome, genero, anoNascimento, cpf);
				cliente.saudacao();
				System.out.println("Digite o codigo do produto desejado: ");
				String codigo = leia.next();
				for (Produto p : produtos) {
					if (p.getCodigo().equals(codigo)) {
						produtoEscolhido = p;
					}
				}
				if (produtoEscolhido == null) {
					System.out.println("Produto não cadastrado!");
					break;
				}
				System.out.println("Qual a quantidade produto desejada: ");
				int qtadeCompras = leia.nextInt();
				double valor = produtoEscolhido.venda(qtadeCompras);
				System.out.printf("Valor a ser pago: R$ %.2f", valor);
				System.out.println();
				System.out.println("\nDigite a forma de pagamento: ");
				System.out.println("1 - À Vista - 10% de desconto");
				System.out.println("2 - Débito");
				System.out.println("3 - Crédito 1x - Acréscimo de 5%");
				System.out.println("4 - Parcelado - Acréscimo de 10%");
				System.out.println("\nDigite a forma de pagamento: ");
				int opcaoPagamento = leia.nextInt();
				Pagamento pagamento = null;
				if (opcaoPagamento == 1) {
					pagamento = new Vista();
				} else if (opcaoPagamento == 2) {
					pagamento = new Debito();
				} else if (opcaoPagamento == 3) {
					pagamento = new Credito();
				} else if (opcaoPagamento == 4) {
					pagamento = new Parcelado();
				} else {
					System.out.println("Opção inválida, cancelando a compra...");
					break;
				}
				produtosVendidos.add(new Venda(produtoEscolhido, qtadeCompras, valor, pagamento));
				break;
			case 2:
				System.out.println("[1] - Adiconar Produto Estoque");
				System.out.println("[2] - Retirar Produto do Estoque");
				System.out.println("[3] - Sair");
				System.out.println();
				System.out.println("Digite uma opção: ");
				int op = leia.nextInt();
				if(op == 1) {
					System.out.println("Digite o código do produto deseja adicionar");
					String addCodigoProduto = leia.next();
					for (Produto p : produtos) {
						if (p.getCodigo().equals(addCodigoProduto)) {
							produtoEscolhido = p;
						}
					}
					if (produtoEscolhido == null) {
						System.out.println("Produto não cadastrado!");
						break;
					}
					System.out.println("Qual a quantidade deseja adicionar no estoque?");
					int addEstoque = leia.nextInt();
					produtoEscolhido.entradaEstoque(addEstoque);
					
				}else if(op == 2) {
					System.out.println("Digite o código do produto deseja retirar");
					String codigoRetirar = leia.next();
					for (Produto p : produtos) {
						if (p.getCodigo().equals(codigoRetirar)) {
							produtoEscolhido = p;
						}
					}
					if (produtoEscolhido == null) {
						System.out.println("Produto não cadastrado!");
						break;
					}
					System.out.println("Qual a quantidade deseja tirar do estoque?");
					int tirarDoEstoque = leia.nextInt();
					produtoEscolhido.tiraEstoque(tirarDoEstoque);
				}else {
					break;
				}
				break;
			case 3: 
				emitirNota(produtosVendidos);
				break;
			case 0:
				System.out.println("Volte sempre!!!");
				break;
			}
		} while (opcaoMenu != 0);

	}
	
	private static void emitirNota(List<Venda> produtosVendidos) {
		double valorTotal = 0;
		linha(80);
		System.out.println("          ################# NOTA FISCAL #################");
		linha(80);
		System.out.println("Produtos vendidos");
		System.out.printf("Cod\tProduto\t\tValor Unitário\tQtde\tTotal\tForma Pgto\tTotal Ajustado");
		for (Venda venda : produtosVendidos) {
			System.out.printf("\n%s\t%s\t\t%.2f\t%d\t%.2f\t%s\t\t%.2f",
					venda.getProduto().getCodigo(),
					venda.getProduto().getNomeProduto(),
					venda.getProduto().getValor(),
					venda.getQuantidade(),
					venda.getValor(),
					venda.getPagamento().formaPagamento(),
					venda.valorAjustado());
			valorTotal += venda.valorAjustado();
		}
		System.out.println();
		linha(80);
		System.out.printf("Valor total: %.2f", valorTotal);
		double valorTotalImposto = valorTotal * 1.09;
		System.out.printf("\nValor total com imposto de 9 porcento: %.2f", valorTotalImposto);
	}
	
	public static void linha(int tamanho) {
		for (int x = 0; x < tamanho; x++) {
			System.out.print("-");
		}
		System.out.println();
	}
	
	private static void mostrarProdutos(List<Produto> produtos) {
		System.out.println();
		System.out.println("\nProdutos cadastrados: ");
		for (Produto produto : produtos) {
			System.out.printf("\nProduto: %s - Valor: R$ %.2f - Código: %s - Estoque: %d", 
					produto.getNomeProduto(), 
					produto.getValor(), 
					produto.getCodigo(), 
					produto.getQtdeProdutoEstoque());
		}
	}
	
	private static List<Produto> cadastrarProdutos() {
		List<Produto> produtos = new ArrayList<>();
		produtos.add(new Produto("HD 320GB", 150, "OYA-001", 10));
		produtos.add(new Produto("HD 500GB", 200, "OYA-002", 10));
		produtos.add(new Produto("HD 1TB", 400, "OYA-003", 10));
		produtos.add(new Produto("SSD 120GB", 200, "OYA-004", 10));
		produtos.add(new Produto("SSD 240 GB", 400, "OYA-005", 10));
		produtos.add(new Produto("Memoria Ram 2GB", 40, "OYA-006", 10));
		produtos.add(new Produto("Memoria Ram 4GB", 100, "OYA-007", 10));
		produtos.add(new Produto("Memoria Ram 8GB", 250, "OYA-008", 10));
		produtos.add(new Produto("Carregador Type-C", 30, "OYA-009", 10));
		produtos.add(new Produto("Carregador Iphone", 40, "OYA-010", 10));
		return produtos;
	}

}
