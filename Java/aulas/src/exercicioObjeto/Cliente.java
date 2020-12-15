package exercicioObjeto;

public class Cliente {

	private String nome;
	private char genero;
	private int anoNascimento;
	
	public Cliente(String nome, char genero) {
		this.nome = nome;
		this.genero = genero;
	}
	
	public Cliente(String nome, char genero, int anoNascimento) {
		this.nome = nome;
		this.genero = genero;
		this.anoNascimento = anoNascimento;
	}
	
	public int retornaIdade() {
		return 2020 - anoNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
}
