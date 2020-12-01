programa
{
	
	funcao inicio()
	{
		inteiro P
		inteiro E = 0 
		inteiro M = 0

		const inteiro PESO_LIMITE = 50
		const inteiro VALOR = 4
		

		escreva("Peso de tomates: ")
		leia(P)

		se (P > PESO_LIMITE) {
			E = P - PESO_LIMITE
			M = E * VALOR
		}
		escreva("\nPeso excedente: " + E)
		escreva("\nValor Multa: " + M)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 252; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */