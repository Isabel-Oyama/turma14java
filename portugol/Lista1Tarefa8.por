programa
{
	
	funcao inicio()
	{
		real custoConsumidor, custoFabrica, distribuidor = 0.28, imposto = 0.45

		escreva("Custo fábrica: ")
		leia(custoFabrica)
		custoConsumidor = custoFabrica + (custoFabrica * distribuidor) + (custoFabrica * imposto)
		escreva("\nCusto consumidor: " + custoConsumidor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 301; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */