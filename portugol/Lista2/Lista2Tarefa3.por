programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		inteiro numero1, numero2, numero3, numero4, resutado1, resultado2, resultado3, resultado4

		escreva("Numero 1: ")
		leia(numero1)

		escreva("Numero 2: ")
		leia(numero2)

		escreva("Numero 3: ")
		leia(numero3)

		escreva("Numero 4: ")
		leia(numero4)

		se(Matematica.potencia(numero3, 2) >=1000) {
			escreva(Matematica.potencia(numero3, 2))
			retorne
		}senao{
			escreva("\nNumero 1: " + numero1 + ", quadrado: " + Matematica.potencia(numero1, 2))
			escreva("\nNumero 2: " + numero1 + ", quadrado: " + Matematica.potencia(numero2, 2))
			escreva("\nNumero 3: " + numero1 + ", quadrado: " + Matematica.potencia(numero3, 2))
			escreva("\nNumero 4: " + numero1 + ", quadrado: " + Matematica.potencia(numero4, 2))
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 787; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */