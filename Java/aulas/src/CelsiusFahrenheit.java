import java.util.Scanner;

public class CelsiusFahrenheit {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double celsius, fahrenheit;
		
		System.out.println("Escreva a temperatura em celsius: ");
		celsius = leia.nextDouble();
		fahrenheit = ((celsius * 1.8) + 32);
		System.out.print("A temperatura em Fahrenheit é: " + fahrenheit);
		

	}

}
