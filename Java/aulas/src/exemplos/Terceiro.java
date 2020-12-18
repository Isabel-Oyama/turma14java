package exemplos;

public class Terceiro extends Funcionario {
	
private double valorTerceiro;
	

	
	//Construtor
	public Terceiro() {
		super();
	}
	//Getters and Setters
	public double getValorTerceiro() {
		return valorTerceiro;
	}
	public void setValorTerceiro(double valorTerceiro) {
		this.valorTerceiro = valorTerceiro;
	}
	
	@Override
	//Método
		public double setPagamentoSalario()
		{
			return (this.valorTerceiro + (super.getHorasMensais() * super.getValorHora()));		
		}
	
}

