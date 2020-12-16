package exercicioPolimorfismo;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public void emitirSom() {
		System.out.println("Cavalo " + super.getNome() + " emitindo som: Wiiiiiiihihihi");
	}

	public void correr() {
		System.out.println("Cavalo " + super.getNome() + " correndo");
	}
	
}
