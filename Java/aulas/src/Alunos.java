import java.util.Scanner;

public class Alunos {

	public static void main(String[] args) {

		String alunos[] = { "Allen de Lima Vieira", "André de Brito Silva da Costa", "Bárbara Liboni Guerra",
				"Beatriz Martins", "Beymar Jhoel Acapa Lima", "Breno Nogueira Botelho Noccioli",
				"Daniel Augusto Gomes Ferreira Filho", "Danilo Mendes Ferreira", "Danilo Pereira da Silva",
				"Davi Silva Vieira", "Diego Vinicio da Silva Nascimento", "Erick Costa Ferreira", "Ewerton Inacio Lima",
				"Fernanda Agapito", "Fernanda Barbosa Ferraz", "Francisco José Pires",
				"Gabriel Sérgio Nascimento Santos Gonçalves", "Gabriel Enrique Cabral Silva",
				"Gideão da Silva Idelfonso", "Gilson Amorim de Matos", "Guilherme Gonçalves da Silva",
				"Gustavo Rabelo Teles", "Heloisa Beatriz de Oliveira Costa", "Igor Mateus Queiroz Gato",
				"Isabel Emiko Yamakawa Oyama", "Jackeline Akemi de Moura", "José Jorge Hauck Júnior",
				"Juliana Santos André", "Kélven Cleiton de Araújo Brandão", "Laís Lima Santos", "Lucas Anseloni Barros",
				"Lucas Gonçalves da Silva", "Luis felipe da silva", "Luiz Felipe da Silva Magalhães",
				"Marcos Eduardo Gomes Gonçalves", "Micaely da Silva Lima", "Rafaela Oliveira Silva",
				"Tiago dos Santos Martins", "Verônica Navarro Almena", "Vinicius de Alvez Miranda" };
		char genero[] = { 'M', 'M', 'F', 'F', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'F', 'M', 'M', 'M', 'M',
				'M', 'M', 'M', 'F', 'M', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'F', 'F', 'M', 'F',
				'M' };
		int matriculas[] = new int[40];
		double notas[] = new double[40];
		String aux;
		char generos = 'M';
		int matricula;

		Scanner leia = new Scanner(System.in);

		for (int x = 0; x < 40; x++) {
			matriculas[x] = (x + 1);
		}
		System.out.println("Mat\tTipo\tNome");
		for (int x = 0; x < 40; x++) {
			if (genero[x] == 'M') {
				aux = "Aluno";
			} else {
				aux = "Aluna";
			}
			System.out.printf("%d \t%s \t%s\n", matriculas[x], aux, alunos[x]);
		}
		System.out.println("Digite a matricula do aluno para inserir nota ");
		matricula = leia.nextInt();
		for(int indice = 0 ; indice < 40 ; indice++){
			if(matriculas[indice]==matricula) {
				
			}
		}
	}
}
