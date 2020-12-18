package bancoempresarial;

public class ContaEmpresarial1 extends Conta1{
	
	private double emprestimoEmpresa;

	public ContaEmpresarial1(double emprestimoEmpresa) {
		super();
		this.emprestimoEmpresa = emprestimoEmpresa;
	}

	public void realizarEmprestimo(double valor) {
		if (this.emprestimoEmpresa == 0) {
			System.out.println("Saldo de empr�stimo zerado!");
			return;
		}
		if (this.emprestimoEmpresa < valor) {
			System.out.println("Valor de empr�stimo maior que o saldo");
		} else {
			this.emprestimoEmpresa -= valor;
			super.credito(valor);
		}
	}
	
	
	
}