package exercicioPolimorfismo;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public void emitirSom() {
		System.out.println("Pregui�a " + super.getNome() + " emitindo som: Zzzzz");
	}

	public void subirArvore() {
		System.out.println(super.getNome() + " subindo na �rvore");
	}

}
