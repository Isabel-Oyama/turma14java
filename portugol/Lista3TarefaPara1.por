programa
{

	     
	funcao inicio()
	{
		inteiro soma = 0

		escreva("Digite um valor: ")
		inteiro x
		
		para(x=3; x<+500; x=x+3) {
			se(eImpar(x)) {
				soma = soma + x
			}
		}
		escreva(soma)
	}


	funcao logico eImpar(inteiro soma)
	{
		se ((soma%2) == 0)
		{
			retorne falso
		}
		senao
		{
			retorne verdadeiro
		}
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 173; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */