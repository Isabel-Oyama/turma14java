package exercicioPolimorfismo;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Cachorro " + super.getNome() + " emitindo som: auau");
	}

	public void correr() {
		System.out.println("Cahorro corre");
	}
}
