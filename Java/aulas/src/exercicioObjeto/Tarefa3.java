package exercicioObjeto;

import java.util.Scanner;

public class Tarefa3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String celular1;
		
		Eletronicos celular = new Eletronicos("Iphone 11", "Apple", "vermelho", "IOS");
		
		System.out.printf("%s\n%s\n%s\n%s\n", celular.modelo,celular.marca,celular.cor,celular.sistema);
		celular1 = leia.next();
	}

}
