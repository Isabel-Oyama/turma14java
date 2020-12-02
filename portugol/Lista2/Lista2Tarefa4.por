programa
{
	
	funcao inicio()
	{
		inteiro numero

		escreva("Digite o numero: ")
		leia(numero)

		se(numero < 0){
		escreva("Numero negativo") 
		}
		senao{
		escreva("Numero positivo")	
		}

	 	se(numero%2==0){
	 		escreva("\nNumero par")
	 	}
	 	senao{
	 		escreva("\nNumero impar")
	 	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 274; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */