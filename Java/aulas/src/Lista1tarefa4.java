import java.util.Scanner;

public class Lista1tarefa4 {

	public static void main(String[] args) {
		
		int A=-1, B=-1, C=-1; 
		double R, S, D;
		Scanner leia = new Scanner (System.in);
		
		while (A < 0) {
			System.out.println("Valor de A: ");
			A = leia.nextInt();
		}
		while (B < 0) {
			System.out.println("Valor de B: ");
			B = leia.nextInt();
		}
		while (C < 0) {
			System.out.println("Valor de C: ");
			C = leia.nextInt();
		}
		R = Math.pow((A+B), 2);
		System.out.println("R = "+ R);
		
		S = Math.pow((B+C), 2);
		System.out.println("S = "+ S);
		
		D = (R+S)/2;
		System.out.println("D = "+ D);
						
				
	}
}
