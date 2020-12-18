package exemplos;
import java.util.Scanner;
public class ExemploOrientadaObjetos
{
	public static void main(String[] args)
	{
		
		Scanner leia = new Scanner(System.in);

		
		Produto vestido = new Produto();
		vestido.nome = "Vestido";
		vestido.qtdeEstoque = 3;
		vestido.valor = 100.00;
		
		Produto blusa = new Produto();
		blusa.nome = "blusa";
		blusa.qtdeEstoque = 1;
		blusa.valor = 50.00;
		
		Produto camisa = new Produto();
		camisa.nome = "camisa";
		camisa.qtdeEstoque = 20;
		camisa.valor = 20;
		
		
		
		
		//String produto = "Vestido";
		//int qtde = 10;
		//double valorProduto = 100.00;
		
		// a classe se chamar Produto
		//nomeProduto
		//qtdeEstoque
		//valorUnitario
		
		//tres produtos no programa
		// vestido - 100,00 - 3 estoque
		// blusa - 50,00 - 1 estoque
		// camise - 20,00 - 20 em estoque
		// escolhe, dizer a quantidade  e  vai mostrar o total a pagar
		
		
		
		
	}
}