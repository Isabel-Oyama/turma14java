package Lista2;

import java.util.Scanner;

public class Tarefa2 {
	
	public static void main(String[] args) {
		
		String C;
		int N, E, horasTrabalhadasNormal;
		
		final int SALARIO_POR_HORAS = 10;
		final int SALARIO_HORAS_EXCEDIDAS = 20;
		final int LIMITE_HORAS = 50;
		
		Scanner leia= new Scanner(System.in);
		
		System.out.println("Digite o código do funcionário: ");
		C = leia.next();
		
		System.out.println("Escreva o número de horas trabalhadas: ");
		N = leia.nextInt();
		
		if (N> LIMITE_HORAS) {
			E = N - LIMITE_HORAS;
			horasTrabalhadasNormal = LIMITE_HORAS;
					
		}
		else {
			E = 0;
			horasTrabalhadasNormal = N;
		}
		System.out.println("Salário Total: " + ((horasTrabalhadasNormal*SALARIO_POR_HORAS)+ (E * SALARIO_HORAS_EXCEDIDAS)));
		System.out.println("Salário excedente: " + E * SALARIO_HORAS_EXCEDIDAS);
	}

}
