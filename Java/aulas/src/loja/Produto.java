	package loja;

public class Produto {
	
	private String nomeProduto;
	private String codigo;
	private double valor;
	private int qtdeProdutoEstoque;
	

	public Produto(String nomeProduto, double valor, String codigo, int qtdeProdutoEstoque) {
		super();
		this.nomeProduto = nomeProduto;
		this.codigo = codigo;
		this.valor = valor;
		this.qtdeProdutoEstoque = qtdeProdutoEstoque;
	}
	
	
	public Produto(String nomeProduto, String codigo, double valor) {
		super();
		this.nomeProduto = nomeProduto;
		this.codigo = codigo;
		this.valor = valor;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQtdeProdutoEstoque() {
		return qtdeProdutoEstoque;
	}
	
	public void tiraEstoque(int saida) {
		if (testarEstoque (saida)) {
			this.qtdeProdutoEstoque -= saida;
		} else {
			System.out.println("Estoque indisponível!");
		}
	}
	public void entradaEstoque(int entrada) {
		this.qtdeProdutoEstoque += entrada;
	}
	public boolean testarEstoque(int valor) {
		
		if (valor > this.qtdeProdutoEstoque) {
			return false;
		}else if(valor == 0){
			return false;
		}else if (this.qtdeProdutoEstoque == 0) {
			return false;
		}else if (this.qtdeProdutoEstoque < 0) {
			return false;
		}else {
			return true;
		}
	}
	
	public double venda(int qtdeVendida) {
		if (qtdeVendida > this.qtdeProdutoEstoque || this.qtdeProdutoEstoque == 0) {
			System.out.println("Não tem produtos em estoque suficiente!");
			return 0;
		} else {
			this.qtdeProdutoEstoque -= qtdeVendida;
			return qtdeVendida * this.valor;
		}
	}
	
	
	
}
