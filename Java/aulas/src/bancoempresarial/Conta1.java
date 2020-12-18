package bancoempresarial;

public abstract class Conta1 {

	private int numeroConta;
	private double saldo;
	private String cpf;

	public Conta1() {

	}

	public Conta1(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Conta1(int numeroConta, String cpf) {
		this.numeroConta = numeroConta;
		this.cpf = cpf;
	}

	public void debito(double valorDebito) {
		this.saldo = this.saldo - valorDebito;
	}

	public void credito(double valorCredito) {
		this.saldo = this.saldo + valorCredito;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public boolean testarSaldo(double valor) 
	{
		boolean teste;
		if (valor <= this.saldo) {
			teste = true;
		} else {
			teste = false;
		}
		return teste;
	}
}

