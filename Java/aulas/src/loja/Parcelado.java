package loja;

public class Parcelado extends Pagamento {

	public Parcelado() {
		super(1.1);
	}
	
	@Override
	public String formaPagamento() {
		return "Parcelado";
	}

}
