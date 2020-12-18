package loja;

public class Credito extends Pagamento {

	public Credito() {
		super(1.05);
	}
	
	@Override
	public String formaPagamento() {
		return "Crédito";
	}

}
