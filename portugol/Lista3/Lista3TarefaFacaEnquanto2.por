programa
{
	
	funcao inicio()
	{
		inteiro numero;
		inteiro soma = 0;
		faca {
			escreva("Digite um número: ")
			leia(numero)	
		} enquanto (numero < 0)

		faca {
			soma = soma + numero
			numero--
		} enquanto (numero > 0)

		escreva(soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 201; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */