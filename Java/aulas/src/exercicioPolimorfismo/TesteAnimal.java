package exercicioPolimorfismo;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Animal cachorro = new Cachorro("Luna", 3);
		Animal preguica = new Preguica("Thor", 4);
		Animal cavalo = new Cavalo("Zeus", 2);
		cachorro.emitirSom();
		preguica.emitirSom();
		cavalo.emitirSom();
		
		
	}

}
