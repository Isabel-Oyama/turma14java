package loja;

public abstract class Pessoa {
	

	private String nome;
	private char genero;
	private int anoNascimento;
	
	
	public Pessoa(String nome, char genero, int anoNascimento) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.anoNascimento = anoNascimento;
	}

	public void saudacao() {
		if(this.genero == 'M') {
			System.out.println("Seja bem vindo!" + this.nome);
		}else if (this.genero == 'F') {
			System.out.println("Seja bem vinda!" + this.nome);
		}else {
			System.out.println("Seja bem vindo(a)!" + this.nome);
		}
		System.out.println("Sua idade: " + voltaIdade()+" anos");
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
	
	public int voltaIdade() {
		if(this.anoNascimento <= 1900) {
			System.out.println("Dado inválido");
			return 0;
		}else {
			return 2020 - this.anoNascimento;	
		}
	}
	
	public int voltaIdade(int anoAtual) {
		if(anoAtual == 0 || this.anoNascimento <= 1900) {
			System.out.println("Dado inválido!");
			return 0;
		}else {
		return anoAtual - this.anoNascimento;
		}
	}
	
}
