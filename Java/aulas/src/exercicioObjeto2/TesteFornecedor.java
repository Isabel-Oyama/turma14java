package exercicioObjeto2;

public class TesteFornecedor {

	public static void main(String[] args) {
		Fornecedor fornecedor = new Fornecedor("Emiko", "Mogi", "99999999", 2000, 1000);
		System.out.printf("\nNome: %s\nEndere�o: %s\nTelefone: %s\nValor cr�dito %.2f\nValor D�vida: %.2f\nSaldo: %.2f"
				, fornecedor.getNome(), fornecedor.getEndereco(), fornecedor.getTelefone(), fornecedor.getValorCredito(), fornecedor.getValorDivida(), fornecedor.obterSaldo());
	}

}
