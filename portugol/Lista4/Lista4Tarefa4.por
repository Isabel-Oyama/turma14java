programa
{
	
	funcao inicio()
	{
		inteiro matriz[3][3], somaTotal = 0, somaDiagonal = 0

		para(inteiro i = 0; i < 3; i++) {
			para (inteiro j = 0; j < 3; j++) {
				escreva("Matriz " + i + " " + j + " : ")
				leia(matriz[i][j])
			}
		}

		para(inteiro i = 0; i < 3; i++) {
			para (inteiro j = 0; j < 3; j++) {
				somaTotal = somaTotal + matriz[i][j]
				se (i == j) {
					somaDiagonal = somaDiagonal + matriz[i][j]
				}
			}
		}

		escreva("soma total: " + somaTotal)
		escreva("\nsoma diagonal principal: " + somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */