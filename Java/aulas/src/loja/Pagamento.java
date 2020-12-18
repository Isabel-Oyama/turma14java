package loja;

public abstract class Pagamento {
	private double acrescimo;
	public Pagamento(double acrescimo) {
		this.acrescimo = acrescimo;
	}

	public double getAcrescimo() {
		return acrescimo;
	}
	
	public String formaPagamento() {
		return "";
	}
	
}
