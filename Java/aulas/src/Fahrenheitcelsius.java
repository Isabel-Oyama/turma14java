import java.util.Scanner;

public class Fahrenheitcelsius {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double celsius, fahrenheit;
		
		System.out.println("Escreva a temperatura em fahrenheit: ");
		fahrenheit = leia.nextDouble();
		celsius = ((fahrenheit - 32) * 5/9);
		System.out.print("A temperatura em celsius é: " + celsius + "º");
		
		
	}
}
