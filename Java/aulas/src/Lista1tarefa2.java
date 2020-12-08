import java.util.Scanner;

public class Lista1tarefa2 {

	public static void main (String[] args) {
		
		int anos, meses, dias,diasEntrada,restoDias;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Idade em dias: ");
		diasEntrada = leia.nextInt();
		
		anos = diasEntrada/365;
		restoDias = diasEntrada%365;
		
		meses = restoDias/30;
		dias = restoDias%30;
		
		System.out.println("Idade em anos: "+ anos);
		System.out.println("Idade em meses: "+ meses);
		System.out.println("Idade em dias: "+ dias);
		
		
		
	
	}
	
}
