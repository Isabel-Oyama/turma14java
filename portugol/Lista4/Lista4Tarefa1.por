programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		inteiro pontuacao[5]
		inteiro maiorNumero = -1
		logico trocado = verdadeiro;


		para(inteiro i = 0 ; i < 5 ; i++){
			escreva("\nDigite a pontuação: ")
			leia(pontuacao[i])
		}

		para ( inteiro i = 0; i < 5; i++) {
			escreva("\nPontuação " + (i + 1) + ": " + pontuacao[i])
		}


		para ( inteiro i = 0; i < 5; i++) {
			se (pontuacao[i] > maiorNumero) {
				maiorNumero = pontuacao[i]
			}
		}
		pula()
		escreva("\nMaior numero: " + maiorNumero)

	}
	funcao pula(){
		escreva("\n")
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 517; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */