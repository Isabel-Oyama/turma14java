package lista4;

import java.util.Scanner;

public class Tarefa4 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int matriz[][] = new int[3][3];
		int somaTotal=0, somaDiagonal=0;
		
		for(int i=0 ; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("Matriz " + i + j + ": ");
				matriz[i][i] = leia.nextInt();
			}
		}
		for(int i=0 ; i<3; i++) {
			for(int j=0; j<3; j++) {
				somaTotal += matriz[i][i];
				if(i==j) {
					somaDiagonal += matriz[i][j];
				}
			}
		}
		System.out.println("Soma total: "+ somaTotal);
		System.out.println("Soma diagonal principal: " + somaDiagonal);
		
	}
}
