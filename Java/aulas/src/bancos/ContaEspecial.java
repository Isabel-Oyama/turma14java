package bancos;

public class ContaEspecial extends ContaCorrente {
	
	private double valorLimite;
	private double valorCadastroLimite;
	
	public ContaEspecial(int numeroConta, String cpf, double valorLimite) {
		super(numeroConta, cpf);
		this.valorLimite = valorLimite;
	}

	public double getValorLimite() {
		return valorLimite;
	}

	public void setValorLimite(double valorLimite) {
		this.valorLimite = valorLimite;
	}
	
	
	public double getValorCadastroLimite() {
		return valorCadastroLimite;
	}



	@Override
	public boolean testarSaldo(double debito) {
		
		boolean teste;
		if (debito <= super.getSaldo()) {
			teste = true;	
			
		} 
		else if (debito <= (this.valorLimite + super.getSaldo())){
			if(debito > super.getSaldo()) {
				
		
				
				System.out.println("Seu saldo é insuficiente, o valor a ser debitado será retirado do seu limite");
				double valorCredito = debito - super.getSaldo();
				super.credito(valorCredito);
				this.valorLimite = this.valorLimite - valorCredito;
				teste = true;
			}
			else {
			
				this.valorLimite -= (debito - super.getSaldo());
				debito -= super.getSaldo();
				teste = true;
			}
		}
		else{
			teste = false;
		}
		
		return teste;
	}
	
	public void registraLimite(){
		if(valorLimite<=0){
			 System.out.println("Valor zerado, impossivel realizar");
		}
		else {
			this.valorCadastroLimite = this.valorLimite;
		}
	}
	
	
	public void devolverLimite(double valorCredito)
	{
		if (this.valorCadastroLimite != this.valorLimite) {
			if(valorCredito >= this.valorCadastroLimite){
				this.valorLimite = this.valorCadastroLimite;
				super.credito(valorCredito - this.valorCadastroLimite);
			}
			else if(valorCredito < (this.valorCadastroLimite - this.valorLimite)){
				this.valorLimite +=  valorCredito;
					
			}
			else {
				double diferenca;
				diferenca =  valorCredito- (this.valorCadastroLimite - this.valorLimite);
				this.valorLimite += (this.valorCadastroLimite - this.valorLimite);
				super.credito(diferenca);
				
			}
		
		}
		else {
			super.credito(valorCredito);
		}
		
	}
	
	
	
}
