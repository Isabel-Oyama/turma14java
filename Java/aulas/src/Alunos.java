import java.util.Scanner;

public class Alunos {

	public static void main(String[] args) {

		String alunos[] = { "Allen de Lima Vieira", "Andr� de Brito Silva da Costa", "B�rbara Liboni Guerra",
				"Beatriz Martins", "Beymar Jhoel Acapa Lima", "Breno Nogueira Botelho Noccioli",
				"Daniel Augusto Gomes Ferreira Filho", "Danilo Mendes Ferreira", "Danilo Pereira da Silva",
				"Davi Silva Vieira", "Diego Vinicio da Silva Nascimento", "Erick Costa Ferreira", "Ewerton Inacio Lima",
				"Fernanda Agapito", "Fernanda Barbosa Ferraz", "Francisco Jos� Pires",
				"Gabriel S�rgio Nascimento Santos Gon�alves", "Gabriel Enrique Cabral Silva",
				"Gide�o da Silva Idelfonso", "Gilson Amorim de Matos", "Guilherme Gon�alves da Silva",
				"Gustavo Rabelo Teles", "Heloisa Beatriz de Oliveira Costa", "Igor Mateus Queiroz Gato",
				"Isabel Emiko Yamakawa Oyama", "Jackeline Akemi de Moura", "Jos� Jorge Hauck J�nior",
				"Juliana Santos Andr�", "K�lven Cleiton de Ara�jo Brand�o", "La�s Lima Santos", "Lucas Anseloni Barros",
				"Lucas Gon�alves da Silva", "Luis felipe da silva", "Luiz Felipe da Silva Magalh�es",
				"Marcos Eduardo Gomes Gon�alves", "Micaely da Silva Lima", "Rafaela Oliveira Silva",
				"Tiago dos Santos Martins", "Ver�nica Navarro Almena", "Vinicius de Alvez Miranda" };
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
