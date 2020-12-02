programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		inteiro A = -1, B = -1, C = -1, R, S, D
		enquanto(A < 0) {
			escreva("valor de A: ")
			leia(A)
		}
		enquanto(B < 0) {
			escreva("valor de B: ")
			leia(B)
		}
		enquanto(C < 0) {
			escreva("valor de C: ")
			leia(C)
		}
		
		R = Matematica.potencia((A + B), 2)
		escreva("\nR = "+R)

		S = Matematica.potencia((B + C), 2)
		escreva("\nS = "+S)

		D = (R + S) / 2
		escreva("\nD = "+D)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 149; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */