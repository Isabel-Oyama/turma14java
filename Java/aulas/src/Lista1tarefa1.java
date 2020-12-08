import java.util.Scanner;
public class Lista1tarefa1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int idade, meses, dias;
		int resultado;
		
		System.out.println("Escreva sua idade em anos: ");
		idade = leia.nextInt();
		System.out.println("Escreva sua idade em meses: ");
		meses = leia.nextInt();
		System.out.println("Escreva sua idade em dias: ");
		dias = leia.nextInt();
		
		resultado = (idade*365)+ (meses * 30)+ dias;
		System.out.println("Resultado = " + resultado);
	}
}
