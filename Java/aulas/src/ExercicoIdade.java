import java.util.Scanner;

public class ExercicoIdade {

	public static void main(String[] args) {
		
		int ano, infantoJuvenil, adulto, idoso, idade;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o ano de nascimento: ");
		ano = leia.nextInt();
		idade = calcularIdade(ano);
		System.out.println("Sua idade é: " + calcularIdade(ano) +" anos");
		idade = calcularIdade(ano);
		if(idade < 18) {
			System.out.println("Infanto Juvenil");
		}else if(idade >= 18 && idade < 60) {
			System.out.println("Adulto");
		} else {
			System.out.println("Idoso");
		}
			
		
	}
	
	public static int calcularIdade(int ano) {
		return 2020 - ano;
	}
	
}
