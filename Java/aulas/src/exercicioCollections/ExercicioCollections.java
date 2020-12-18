package exercicioCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioCollections {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		List<Estoque> list = new ArrayList<>();
		int codigo = 0;
		while(true) {
			System.out.println();
			System.out.println("O que deseja fazer?");
			System.out.println("1 - Adicionar estoque");
			System.out.println("2 - Remover estoque");
			System.out.println("3 - Atualizar estoque");
			System.out.println("4 - Apresentar dados");
			System.out.println("0 - Sair");
			int op = leia.nextInt();
			if (op == 1) {
				codigo++;
				System.out.println("Digite o nome do estoque");
				String nome = leia.next();
				list.add(new Estoque(codigo, nome));
			} else if (op == 2) {
				System.out.println("Digite o código do produto que deseja remover: ");
				int codigoRemover = leia.nextInt();
				try {
					Estoque estoque = list.get(codigoRemover - 1);
					System.out.println("Estoque a ser removido: " + estoque.getNome());
					list.remove(estoque);
					System.out.println("Estoque removido");
				} catch (Exception e) {
					System.out.println("Produto não encontrado!");
				}
			} else if (op == 3) {
				System.out.println("Digite o código do produto que deseja alterar: ");
				int codigoAlterar = leia.nextInt();
				try {
					Estoque estoque = list.get(codigoAlterar - 1);
					System.out.println("Estoque a ser alterado: " + estoque.getNome());
					System.out.println("Digite o novo nome para o estoque: ");
					estoque.setNome(leia.next());
				} catch (Exception e) {
					System.out.println("Produto não encontrado!");
				}
			} else if (op == 4) {
				System.out.println("Apresentando a lista:");
				System.out.println("Código\t\tNome");
				for (Estoque estoque : list) {
					System.out.printf("\n%d\t\t%s", estoque.getCodigo(), estoque.getNome());
				}
				System.out.println();
			} else if (op == 0) {
				System.out.println("Você escolheu sair...");
				break;
			}
				
		}
		

	}

}
