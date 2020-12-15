package exercicioObjeto;

import java.util.Scanner;

public class Tarefa1 {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Emiko", 'F', 1993);
		
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("Genero: " + cliente.getGenero());
		System.out.println("Idade: " + cliente.retornaIdade());
		
	}

}
