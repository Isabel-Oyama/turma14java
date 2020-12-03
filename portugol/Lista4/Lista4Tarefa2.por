programa
{
	inclua biblioteca Util --> u
	
	funcao inicio()
	{
		inteiro lancamento [10]
		inteiro soma = 0
		para (inteiro i = 0; i < 10; i++) {
			lancamento[i]= u.sorteia(1,6)
			escreva("\nDado lançou: " + lancamento[i] + " ") 
		}

		para (inteiro i = 0; i < 10; i++) {
			soma += lancamento[i]
		}
		escreva("\nMédia aritmética: " + (soma/10))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 175; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */