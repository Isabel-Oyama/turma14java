package loja;

public class Debito extends Pagamento {
	public Debito() {
		super(1);
	}

	@Override
	public String formaPagamento() {
		return "D�bito";
	}
	
}
