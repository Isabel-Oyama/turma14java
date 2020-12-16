package exercicioObjeto2;

public class TesteEmpregado {

	public static void main(String[] args) {
		Empregado empregado = new Empregado("Emiko", "Mogi", "99999999", 1, 1000, .10);
		System.out.printf("\nNome: %s\nEndereço: %s\nTelefone: %s\nCod. Setor: %s\nSalário Base: %.2f\nImposto: %s\nSalário Calculado: %.2f",
				empregado.getNome(), empregado.getTelefone(), empregado.getTelefone(), empregado.getCodigoSetor(), empregado.getSalarioBase(),
				empregado.getImposto(), empregado.calcularSalario());
		
	}

}
