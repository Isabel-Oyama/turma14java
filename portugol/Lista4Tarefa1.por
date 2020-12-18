programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{ 
		inteiro acessoTransacao
		real valor, total = 0

		escreva("Qual o valor do produto: ")
		leia(valor)

		escreva("\n1 - À vista dinheiro ou cheque ")
		escreva("\n2 - À vista cartão de crédito ")
		escreva("\n3 - Parcelado 2 vezes ")
		escreva("\n4 - Parcelado 3 vezes \n")
		leia(acessoTransacao)

		se(acessoTransacao == 1) {
			escreva("Pagamento à vista com desconto de 20% ")
			total = valor * 0.80
		}
		senao se(acessoTransacao == 2){
			escreva("Pagamento à vista com cartão de crédito, desconto de 15% ")
			total = valor * 0.85
		}
		senao se(acessoTransacao == 3){
			escreva("Pagamento parcelado em 2 vezes ")
			total = valor
			escreva("\n2 parcelas de R$ ", Matematica.arredondar((total / 2), 2))
		}
		senao se(acessoTransacao == 4){
			escreva("Pagamento parcelado em 3 vezes, juros de 10% ")
			total = valor * 1.10
			escreva("\n3 parcelas de R$ ", Matematica.arredondar((total / 3), 2))
		}
		
		escreva("\nO valor total é:R$ ", Matematica.arredondar(total, 2))
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 957; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */