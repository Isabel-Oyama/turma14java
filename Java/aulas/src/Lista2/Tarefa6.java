package Lista2;

import java.util.Scanner;

public class Tarefa6 {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual a idade do nadador: ");
		idade = leia.nextInt();
		
		if(idade >= 5 && idade <=7) {
			System.out.println("Infantil A");
		}
		else if(idade >=8 && idade <=11) {
			System.out.println("Infaltil B");
		}
		else if(idade >=12 && idade <= 13) {
			System.out.println("Juvenil A");
		}
		else if(idade >=13 && idade <=17) {
			System.out.println("Juvenil B");
		} else {
			System.out.println("Maiores de 18 anos");
		}
			
	}

}
