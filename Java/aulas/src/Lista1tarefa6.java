import java.util.Scanner;


public class Lista1tarefa6 {

	public static void main(String[] args) {
		
		double x1, x2, y1, y2, d, p1, p2;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Valor de x1: ");
		x1 = leia.nextDouble();
		System.out.println("Valor de x2: ");
		x2 = leia.nextDouble();
		System.out.println("Valor de y1: ");
		y1 = leia.nextDouble();
		System.out.println("Valor de y2: ");
		y2 = leia.nextDouble();
		
		p1 = Math.pow ((x2-x1), 2);
		p2 = Math.pow((y2 - y1), 2);
		d = (Math.sqrt(p1+p2));
		System.out.printf("Valor de Distância é: %.2f ", d);
		
	}
}
