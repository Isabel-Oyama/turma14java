package lista5;

public class Tarefa4 {
	public static void main(String[] args) {
		int cima = 1, baixo = 1, soma = 0;
		String s = "";
		for(int i = 0; i < 100; i += 2) {
			s += cima + "/" + baixo + " + ";
			soma += cima/baixo;
			cima += 2;
			baixo += 1;
		}
		System.out.printf("Soma = %s = %s", s, soma);
	}
}
