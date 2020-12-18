package bancos;

import java.util.Scanner;

public class ContaUniversitaria extends ContaEspecial {
	
	private int emprestimoEstudantil;
	
	public ContaUniversitaria(int numeroConta, String cpf, double valorLimite, int emprestimoEstudantil) {
		super(numeroConta, cpf, valorLimite);
		this.emprestimoEstudantil = emprestimoEstudantil;
	}
	
	@Override
	public boolean testarSaldo(double valor) {
		boolean teste;
		if (valor <= super.getSaldo()) {
			teste = true;
		} else if (valor <= (this.emprestimoEstudantil + super.getSaldo())) {
			teste = true;
		} else {
			teste = false;
		}
		return teste;
	}

	public int getEmprestimoEstudantil() {
		return emprestimoEstudantil;
	}

	public void perguntarEmprestimo() {
		Scanner leia = new Scanner(System.in);
		System.out.println("Deseja realizar o empréstimo? [S/N]");
		char opcao = leia.next().toUpperCase().charAt(0);
		if (opcao == 'S') {
			System.out.println("\nQuanto deseja retirar do Empréstimo?");
			double valor = leia.nextDouble();
			if (testarSaldo(valor)) {
				super.credito(valor);
				this.emprestimoEstudantil -= valor;
			} else {
				System.out.println("Empréstimo não pode ser realizado!");
			}
		}
	}
	
	public void mostrarSaldos() {
		System.out.println("Saldo: R$ " + super.getSaldo());
		System.out.println("Valor do Limite: R$ " + super.getValorLimite());
		System.out.println("Limite Usado: R$ " + (super.getValorCadastroLimite() - super.getValorLimite()));
		System.out.println("Saldo empréstimo: R$ " + this.emprestimoEstudantil);
	}
	
}
