package exercicioObjeto;

import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String aeronave1;
		
		Aviao aeronave = new Aviao("Latam", "Boeing 777", "Branco", 70);
		
//		aeronave.nomeCompanhia = "Latam";
//		aeronave.nomeAeronave = "Boeing 777";
//		aeronave.cor = "Branco";
//		aeronave.tamanho = 70;
		
		System.out.printf("%s\n%s\n%s\n%s\n",aeronave.nomeCompanhia,aeronave.nomeAeronave,aeronave.cor,aeronave.tamanho);
		aeronave1 = leia.next();
	}

}
