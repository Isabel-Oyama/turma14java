import java.util.Scanner;

public class Lista1tarefa5 {

		public static void main(String[] args) {
			
			int peso1 =2, peso2=3, peso3=5;
			double nota1, nota2, nota3, media;
			Scanner leia = new Scanner(System.in);
			
			System.out.println("Digite nota 1 ");
			nota1 = leia.nextDouble();
			System.out.println("Digite nota 2");
			nota2 = leia.nextDouble();
			System.out.println("Digite nota 3");
			nota3 = leia.nextDouble();
			
			media = ((nota1*peso1)+(nota2*peso2)+(nota3*peso3))/(peso1+peso2+peso3);
			System.out.println("Media é: " + media);
		}
}
