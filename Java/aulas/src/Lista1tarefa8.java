import java.util.Scanner;

public class Lista1tarefa8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double custoConsumidor, custoFabrica, distribuidor = 0.28, imposto = 0.45;
		
		System.out.println("Custo fábrica: ");
		custoFabrica = leia.nextDouble();
		
		custoConsumidor = custoFabrica + (custoFabrica * distribuidor) + (custoFabrica * imposto);
		System.out.println("Custo consumidor: " + custoConsumidor);
	}
}
