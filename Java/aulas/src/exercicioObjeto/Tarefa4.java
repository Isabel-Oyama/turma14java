package exercicioObjeto;

import java.util.Scanner;

public class Tarefa4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		String funci;
		
		Funcionario funcionario1 = new Funcionario("Felipe", 'M', 1993, 001);
		
		System.out.printf("%s\n%s\n%s\n%s\n", funcionario1.nome, funcionario1.genero, funcionario1.idade, funcionario1.codigoFuncionario);
		funci = leia.next();
		
	}
	

}
