import java.util.Scanner;

public class Lista1tarefa3 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int tempoSegundos, horas, minutos, segundos;
		
		System.out.println("Digite o tempo em segundos: ");
		tempoSegundos = leia.nextInt();
		
		horas = (tempoSegundos / 360);
		System.out.println(horas + " Horas");
		
		minutos = ((tempoSegundos % 360) / 60);
		System.out.println(minutos + " Minutos");
		
		segundos = ((tempoSegundos % 360) % 60);
		System.out.println(segundos + " Segundos");
		
	}

}
