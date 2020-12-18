package loja;

public class Venda {
	private Produto produto;
	private int quantidade;
	private double valor;
	private Pagamento pagamento;
	
	public Venda(Produto produto, int quantidade, double valor, Pagamento pagamento) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
		this.valor = valor;
		this.pagamento = pagamento;
	}
	
	public double valorAjustado() {
		return this.valor * pagamento.getAcrescimo();
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Pagamento getPagamento() {
		return pagamento;
	}
}
