package loja;

public class Vista extends Pagamento {
	public Vista() {
		super(.9);
	}
	@Override
	public String formaPagamento() {
		return "À Vista";
	}
}
